package cracking.hackerrank;
import java.util.*;
public class BitManipulation_LonelyInteger {
	public static int getLonelyIntegerXor(int [] nums){
		int result = 0;
		for(int num : nums){
			result = result ^ num;
		}
		return result;
	}
	public static int getLonelyIntegerMap(int [] nums){
		int result = 0;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int num : nums){
			map.put(num, map.containsKey(num)? map.get(num) + 1 : 1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			if(entry.getValue() == 1){
				result = entry.getKey();
				break;
			}
		}
		return result;
	}
	public static int getLonelyIntegerList(int [] nums){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int num : nums){
			if(list.contains(num)) {
				list.remove(list.indexOf(num));
			}
			else{
				list.add(num);
			}
		}
		return list.get(0);
	}
	
	public static void main(String[] args) {
		int []  arr = {0 ,0 ,1 ,2, 1};
		System.out.println(getLonelyIntegerXor(arr));
		System.out.println(getLonelyIntegerMap(arr));
		System.out.println(getLonelyIntegerList(arr));
	}

}
