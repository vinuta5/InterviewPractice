package com.interviewasked;
import java.util.*;

public class PeekingIterator {
	Iterator<Integer> iterator;
	boolean hasPeek = false;
	Integer next = null;
	
	PeekingIterator(Iterator iterator){
		this.iterator = iterator;
	}
	public Integer peek(){
		if(!hasPeek){
			next = iterator.next();
			hasPeek = true;
		}
		return next;
	}
	public Integer next(){
		if(!hasPeek){
			return iterator.next();
		}
		hasPeek = false;
		Integer temp = next;
		next = null;
		return temp;
	}
	public boolean hasNext(){
		return hasPeek || iterator.hasNext();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
