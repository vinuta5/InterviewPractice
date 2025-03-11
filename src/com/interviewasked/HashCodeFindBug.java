package com.interviewasked;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * The below class is designed with intentional bugs.
 * 
 * As-is the main() method is going to print out: "Ready? set? Go! => count=1"
 * 
 * But why? We see 2 different class types are being put into the Set therefore
 * we should see a 2 count. Please fix the below code so that we see a 2 count
 * within the Set.
 * 
 * HINT: Any of the below changes will be considered bugs in your solution: 1.
 * Change the use of the constant CONSTANT 2. Changing the value of property 'x'
 * within either class. 3. Changing anything within the main() driver.
 * 
 * The only acceptable solution will involve modifications to the hashCode()
 * and/or equals() methods.
 * 
 * @author Interviewer
 *
 */
public class HashCodeFindBug {

	private static final String CONSTANT = UUID.randomUUID().toString();

	public static class A {

		String x = CONSTANT;

		@Override
		public int hashCode() {
			int result = (x == null) ? 0 : x.hashCode();
			return result;
		}

		
	}

	public static class B {

		String x = CONSTANT;

		@Override
		public int hashCode() {
			int result = (x == null) ? 0 : x.hashCode();
			return result;
		}

		
	}

	public static void main(String[] args) {

		A a = new A();
		B b = new B();

		Set<Object> accum = new HashSet<>();
		accum.add(a);
		accum.add(b);

		System.out.println("Ready? set? Go! => count=" + accum.size());
	}

}