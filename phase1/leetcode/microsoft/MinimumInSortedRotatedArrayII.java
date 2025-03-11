package leetcode.microsoft;

public class MinimumInSortedRotatedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int getMinimum(int [] nums){
		int start = 0, end = nums.length - 1;
		while(start < end){
			if(nums[start] == nums[end]) {
				end --;
			}
			else if(nums[start] < nums[end]){
				return nums[start];
			}
			else{
				start ++;
			}
		}
		return nums[start];
	}
}
