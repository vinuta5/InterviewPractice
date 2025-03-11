package leetcode.microsoft;

public class LinkedListCycle {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(2);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		head.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		System.out.println(hasCycle(head));
	}
	public static boolean hasCycle(ListNode head){
		if(head == null){
			return false;
		}
		ListNode slow = head,fast = head;
		while(fast.next != null && fast.next.next != null){
			slow = fast.next;
			fast = fast.next.next;
			if(fast.equals(slow)){
				return true;
			}
		}
		return false;
	}
}
