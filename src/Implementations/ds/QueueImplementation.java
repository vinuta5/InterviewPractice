package Implementations.ds;

public class QueueImplementation {
	int rear = -1,front = 0;
	int [] queue;
	QueueImplementation(int size){
		queue = new int[size];
	}
	void enqueue(int data){
		if(isQueueFull()) throw new IllegalStateException();
		rear += 1;
		queue[rear] = data;
	}
	int dequeue(){
		if(isQueueEmpty()) throw new IllegalStateException();
		int remove = queue[front];
		front += 1;
		return remove;
	}
	boolean isQueueFull(){
		return rear > queue.length - 1;
	}
	boolean isQueueEmpty(){
		return front < 0 || rear < front;
	}
	int peek(){
		return queue[front];
	}

	public static void main(String[] args) {
	}

}
