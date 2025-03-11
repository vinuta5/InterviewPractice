package leetcode.microsoft;
import java.util.*;
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-1,-3,-7,2,4,5,6,8,9}; // -1,-3,-7,2,4,5,6,8,9
		getSubstringsFromMaximum("bird");
		//getSubArrays(arr);
		
	}
	static void getSubArrays(int [] arr){
		for(int i = 0; i < arr.length; ++ i){
			for(int j = arr.length -1; j >= 0; -- j){
				System.out.println(j - i + 1);
			}
		}
	}
	static void getSubStringsFromMinimum(String str){
		for(int i = 0; i < str.length(); ++ i){
			for(int j = i + 1; j <= str.length(); ++ j){
				System.out.println(str.substring(i, j));
			}
		}
	}
// 0 - 4, 0 - 3, 0 - 2, 0 - 1, 1 - 4, 1 - 3, 1 - 2
	static void getSubstringsFromMaximum(String str){
		for(int i = 0; i < str.length(); ++ i){
			for(int j = str.length(); j >= 0 ; -- j){
				System.out.println(str.substring(i, j));
			}
		}
	}
	
	static void subArrMaxProduct(int [] arr){
		int max_fwd = Integer.MIN_VALUE, max_bwd = Integer.MIN_VALUE, max_tillnow = 1;

		for(int i = 0; i < arr.length; ++ i){
			max_tillnow = max_tillnow * arr[i];
			if(max_tillnow == 0){
				max_tillnow = 1;
				continue;
			}
			max_fwd = Math.max(max_tillnow,max_fwd);	
		}
		max_tillnow = 1;
		for(int i = arr.length - 1; i >= 0; -- i ){
			max_tillnow = max_tillnow * arr[i];
			if(max_tillnow == 0){
				max_tillnow = 1;
				continue;
			}
			max_bwd = Math.max(max_bwd,max_tillnow);
		}

		System.out.print(Math.max(max_fwd, max_bwd));
	}
	public static int removeDuplicates(int [] nums){
		int duplicates = 0, prev_value = 0;
		for(int i = 0; i < nums.length ; ++ i){
			if(i > 0 && nums[i] == prev_value){
				++ duplicates;
			}
			else{
				nums[i - duplicates] = nums[i];
				prev_value = nums[i];
			}
		}
		return nums.length - duplicates;
	}
	public static String removeDuplicates(String s){
		String str = new String();
		for (int i = 0; i < s.length(); i++) 
		{
			char c = s.charAt(i);
			if (str.indexOf(c) < 0)
			{
				str += c;
			}
		}
		return str;
	}
	
	ArrayList<Integer> getIndices(String page, String entity){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int index = page.indexOf(entity);
		while(index > -1){
			list.add(index);
			index = page.indexOf(entity,index + 1);
		}
		return list;
	}
	
	static ArrayList<Integer> getDuplicate(int [] arr){
		ArrayList<Integer> list = new ArrayList();
		for(int elem : arr){
			int index = Math.abs(elem) - 1;
			if(arr[index] < 0){
				list.add(Math.abs(elem));
			}
			else{
				arr[index] = -arr[index];
			}
		}
		return list;
	}
	
}

