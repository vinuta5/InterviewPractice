package leetcode.microsoft;
import java.util.*;

public class SumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {3,2,4};
		for(int elem: sumPair(nums,6)){
			System.out.println(elem);
		}

	}
	public static int [] sumPair(int [] nums,int target){
		int [] result = new int[2];
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i < nums.length; ++i){
			int elem = nums[i], complement = target - elem;
			if(map.containsKey(complement)){
				result[0] = map.get(complement);
				result[1] = i;
				break;
			}
			map.put(elem, i);
		}
		return result;
	}
}
