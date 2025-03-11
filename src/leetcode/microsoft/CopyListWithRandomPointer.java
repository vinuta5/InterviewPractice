package leetcode.microsoft;
import java.util.*;

class RandomListNode{
	int label;
	RandomListNode next,random;
	RandomListNode(int x){
		label = x;
	}
}

public class CopyListWithRandomPointer {
	private final Map<RandomListNode,RandomListNode> map = new HashMap();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public RandomListNode deepCopy(RandomListNode head){
		if(head == null) return null;
		if(map.containsKey(head)) return map.get(head);
		RandomListNode clone = new RandomListNode(head.label);
		map.put(head, clone);
		clone.next = deepCopy(head.next);
		clone.random = deepCopy(head.random);
		return clone;
	}
}
