package leetcode.microsoft;

class ReverseALinkedList {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		head.next = two;
		two.next = three;
		three.next = four;
		ListNode.displayLinkedList(head);
		ListNode reverse = reverseLinkedList(head);
		ListNode.displayLinkedList(reverse);
		
	}
	public static ListNode reverseLinkedList(ListNode head){
		ListNode current = head, prev = null;
		while(current != null){
			ListNode temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		return prev;
	}
}
