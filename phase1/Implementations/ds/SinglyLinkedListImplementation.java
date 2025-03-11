package Implementations.ds;
class ListNode{
	int key;
	ListNode next;
	ListNode(int key){
		this.key = key;
		next = null;
	}
}
public class SinglyLinkedListImplementation {
	ListNode head;
	void insertListNodeFirst(int data){
		ListNode newNode = new ListNode(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	void insertListNodeLast(int data){
		ListNode newNode = new ListNode(data);
		ListNode current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
	}
	void insertListNodePosition(int data, int position){
		if(position == 0) {
			insertListNodeFirst(data);
		}
		ListNode newNode = new ListNode(data);
		ListNode current = head, prev = head;
		int counter = 0;
		while(current != null){
			if(position == counter){
				newNode.next = current;
				prev.next = newNode;
				return;
			}
			prev = current;
			current = current.next;
			counter ++;
		}
		if(position > counter){
			return;
		}
		prev.next = newNode;
	}
	
	ListNode deleteListNodeFirst(){
		head = head.next;
		return head;
	}
	ListNode deleteListNodeLast(){
		ListNode current = head;
		while(current.next != null){
			current = current.next;
		}
		current = null;
		return head;
	}
	ListNode deleteListNodePosition(int position){
		if(position == 0){
			return deleteListNodeFirst();
		}
		ListNode current = head, prev = head;
		int counter = 0;
		while(current != null){
			if(position == counter){
				
			}
			prev = current;
			current = current.next;
			counter ++;
		}
		return null;
	}

	public static void main(String[] args) {
	}

}
