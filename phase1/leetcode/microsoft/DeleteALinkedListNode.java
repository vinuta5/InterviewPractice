package leetcode.microsoft;
//given access to the node that is to be deleted.

public class DeleteALinkedListNode {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		head.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		ListNode.displayLinkedList(head);
		deleteNode(three);
		ListNode.displayLinkedList(head);
		
	}
	//replace the current node content with current.next data and delete node.next
	public static void deleteNode(ListNode node){
		node.x = node.next.x;
		node.next = node.next.next;
	}
}
