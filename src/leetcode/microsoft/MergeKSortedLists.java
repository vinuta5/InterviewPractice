package leetcode.microsoft;

public class MergeKSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ListNode mergeKLists(ListNode [] lists){
		return mergeListPartition(lists,0,lists.length - 1);
	}
	public static ListNode mergeListPartition(ListNode [] lists, int start,int end){
		if(start == end){
			return lists[start];
		}
		if(start < end){
			int mid = (start + end)/2;
			ListNode leftPart = mergeListPartition(lists,start,mid);
			ListNode rightPart = mergeListPartition(lists,mid + 1,end);
			return mergeLists(leftPart,rightPart);
		}
		else{
			return null;
		}
	}
	public static ListNode mergeLists(ListNode l1, ListNode l2){
		if(l1 == null){
			return l2;
		}
		else if(l2 == null){
			return l1;
		}
		if(l1.x < l2.x){
			l1.next = mergeLists(l1.next,l2);
			return l1;
		}
		else{
			l2.next = mergeLists(l1,l2.next);
			return l2;
		}
	}
	
}
