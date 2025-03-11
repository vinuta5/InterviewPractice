package leetcode.microsoft;

public class ListNode {
	int x;
	ListNode next;
	ListNode(int x){
		this.x = x;
		next = null;
	}
	public static void displayLinkedList(ListNode head){
		ListNode current = head;
		while(current != null){
			System.out.println(current.x);
			current = current.next;
		}
	}
}
