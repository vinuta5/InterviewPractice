package leetcode.microsoft;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ListNode addTwoLists(ListNode l1, ListNode l2){
		ListNode curr1 = l1, curr2 = l2, prev = new ListNode(0), head = prev;
		int carry = 0;
		while(curr1 != null || curr2 != null || carry != 0){
			ListNode newNode = new ListNode(0);
			int sum = ( curr1 != null ? curr1.x : 0  ) + ( curr2 != null ? curr2.x : 0 ) + carry;
			newNode.x = sum % 10;
			carry = sum / 10;
			prev.next = newNode;
			prev = newNode;
			curr1 = (curr1 != null)? curr1.next : curr1;
			curr2 = (curr2 != null)? curr2.next : curr2;
		}
		return head.next;
	}
}
