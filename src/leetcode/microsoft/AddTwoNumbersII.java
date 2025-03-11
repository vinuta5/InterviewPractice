package leetcode.microsoft;

public class AddTwoNumbersII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
		ListNode curr1 = reverseList(l1), curr2 = reverseList(l2), prev = null, head = null;
		int carry = 0;
		while(curr1 != null || curr2 != null || carry != 0){
			head = new ListNode(0);
			int sum = ((curr1 != null) ? curr1.x : 0) + ((curr2 != null) ? curr2.x : 0) + carry;
			head.x = sum % 10;
			carry = sum / 10;
			head.next = prev;
			prev = head;
			curr1 = curr1 != null ? curr1.next : curr1;
			curr2 = curr2 != null ? curr2.next : curr2;
		}
		return head;
	}
	public static ListNode reverseList(ListNode node){
		ListNode curr = node, prev = null;
		while(curr != null){
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
}
