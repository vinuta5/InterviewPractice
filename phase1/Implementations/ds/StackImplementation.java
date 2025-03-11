package Implementations.ds;

public class StackImplementation {
	int top = -1;
	int [] stack;
	StackImplementation(int size){
		stack = new int[size];
	}
	void push(int data){
		if(isFull()) throw new IllegalStateException();
		stack[++ top] = data;
	}
	int pop(){
		if(isEmpty()) throw new IllegalStateException();
		int removed = stack[top --];
		return removed;
	}
	boolean isEmpty(){
		return top < 0;
	}
	boolean isFull(){
		return top > stack.length - 1;
	}
	int peek(){
		return stack[top];
	}
	public static void main(String[] args) {

	}

}
