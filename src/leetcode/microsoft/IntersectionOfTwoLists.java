package leetcode.microsoft;

public class IntersectionOfTwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ListNode intersectionOfTwoLists(ListNode headA,ListNode headB){
		ListNode currA = headA, currB = headB;
		while(currA != currB){
			if(currA == null){
				currA = headB;
			}
			else{
				currA = currA.next;
			}
			if(currB == null){
				currB = headA;
			}
			else{
				currB = currB.next;
			}
		}
		return currA;
	}
}
