package cracking.hackerrank;
import java.util.*;

class LinkedListNode{
	int data;
	LinkedListNode next = null;
	LinkedListNode(int data){
		this.data = data;
		next = null;
	}
}
public class LinkedList_DetectCycle {
	
	public static boolean detectCycleSet(LinkedListNode head){
		HashSet<LinkedListNode> set = new HashSet<LinkedListNode>();
		LinkedListNode current = head;
		if(current == null) return false;
		while(current != null){
			set.add(current);
			if(set.contains(current)) return true;
			current = current.next;
		}
		return false;
	}
	public static boolean detectCycleTwoPointers(LinkedListNode head){
		if(head == null) return false;
		LinkedListNode fast = head, slow = head;
		while(fast.next != null && fast.next.next != null){
			slow = fast.next;
			fast = fast.next.next;
			if(slow.equals(fast)) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode(1);
		LinkedListNode two = new LinkedListNode(2);
		LinkedListNode three = new LinkedListNode(2);
		LinkedListNode four = new LinkedListNode(4);
		LinkedListNode five = new LinkedListNode(5);
		head.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		System.out.println(detectCycleTwoPointers(head));
		System.out.println(detectCycleSet(head));

	}

}
