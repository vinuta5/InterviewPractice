package cracking.hackerrank;
import java.util.*;
public class Queue_ImplmentUsingTwoStacks<T> {
	Stack<T> newestOnTop_stack = new Stack<T>();
	Stack<T> oldestOnTop_stack = new Stack<T>();
	
	public void enqueue(T value){
		newestOnTop_stack.push(value);
	}
	public T dequeue(){
		moveElements();
		return oldestOnTop_stack.pop();
	}
	public T peek(){
		moveElements();
		return oldestOnTop_stack.peek();
	}
	private void moveElements(){
		if(oldestOnTop_stack.isEmpty()){
			while(!newestOnTop_stack.isEmpty()){
				oldestOnTop_stack.push(newestOnTop_stack.pop());
			}
		}
	}
	public static void main(String[] args) {
		Queue_ImplmentUsingTwoStacks obj = new Queue_ImplmentUsingTwoStacks();
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
		System.out.println(obj.peek());
		System.out.println(obj.dequeue());
		System.out.println(obj.peek());
		obj.enqueue(50);
		System.out.println(obj.peek());
		System.out.println(obj.dequeue());
		
	}

}
