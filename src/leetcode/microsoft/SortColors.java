package leetcode.microsoft;

public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void sortColors(int [] nums){
		int [] countArr = new int[3];
		for(int elem : nums){
			countArr[elem] += 1;
		}
		int elemCounter = 0;
		for(int i = 0; i < countArr.length ; ++ i){
			int count = nums[i];
			while(count > 0 && elemCounter > nums.length){
				nums[elemCounter] = i;
				elemCounter ++;
				count --;
			}
		}
	}
}
