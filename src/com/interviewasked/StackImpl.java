package com.interviewasked;

public class StackImpl {
	int top = -1, size;
	int [] stack;
	
	StackImpl(int size){
		this.size = size;
		stack = new int[size];
	}
	public void push(int elem){
		if(isFull()) return;
		top += 1;
		stack[top] = elem;
		
	}
	public int pop(){
		if(isEmpty()) return Integer.MIN_VALUE;
		int removed = stack[top];
		top -= 1;
		return removed;
	}
	public boolean isEmpty(){
		return (top < 0);
	}
	public boolean isFull(){
		return (top > size - 1);
	}
	public int getTop(){
		return top;
	}
	public void display(){
		for(int i = 0; i <= top; ++ i){
			System.out.print(stack[i] + " ");
		}
	}

	public static void main(String[] args) {
		StackImpl obj = new StackImpl(3);
		obj.push(1);
		obj.push(2);
		obj.push(3);
		System.out.println(obj.getTop());
		obj.display();
		System.out.println();
		obj.pop();
		obj.pop();
		System.out.println(obj.getTop());
		obj.display();
	}

}
