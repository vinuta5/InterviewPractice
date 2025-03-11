package com.interviewasked;
class Base {
	void display() {
		System.out.println("base : private");
	}
	void print() {
		System.out.println("base : static");
	}
}
class Derived extends Base {
	void display() {
		System.out.println("derived : private");
	}
	void print() {
		System.out.println("derived : static");
	}
}

public class Driver {
	public static void main(String [] args){
		Base b = new Derived();
		b.display();
		b.print();
	}
}