package Implementations.ds;
class DoublyLinkedList{
	int key;
	DoublyLinkedList next,previous;
	DoublyLinkedList(int key){
		this.key = key;
	}
}
public class DoublyLinkedListImplementation {
	DoublyLinkedList head = null;
	void addNodeFirst(int data){
		DoublyLinkedList newNode = new DoublyLinkedList(data);
		if(head == null){
			head = newNode;
			return;
		}
		head.previous = newNode;
		newNode.next = head;
		head = newNode;
	}
	void addNodeLast(int data){
		DoublyLinkedList newNode = new DoublyLinkedList(data);
		DoublyLinkedList current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
		newNode.previous = current;
	}
	void addNodePosition(int data,int position){
		if(position == 0){
			addNodeFirst(data);
			return;
		}
		DoublyLinkedList newNode = new DoublyLinkedList(data);
		DoublyLinkedList current = head, prev = head;
		int counter = 0;
		while(current != null){
			if(position == counter){
				newNode.next = current;
				newNode.previous = current.previous;
				current.previous.next = newNode;
				current.previous = newNode;
		        return;
			}
			prev = current;
			current = current.next;
			counter ++;
		}
		if(counter < position){
			return;
		}
		newNode.previous = prev;
		current = newNode;
	}
	public static void main(String[] args) {
		
	}

}
