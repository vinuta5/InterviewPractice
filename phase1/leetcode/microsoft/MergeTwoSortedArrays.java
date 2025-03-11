package leetcode.microsoft;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void mergeArrays(int [] nums1, int m, int [] nums2, int n){
		int lIndex = m - 1, rIndex = n - 1, resIndex = m + n - 1;
		while(resIndex >= 0){
			if(lIndex < 0 ||(rIndex >= 0 && nums2[rIndex] >= nums1[lIndex])){
				nums1[resIndex] = nums2[rIndex];
				rIndex --;
			}
			else if(rIndex < 0 || (lIndex >= 0 && nums1[lIndex] > nums2[rIndex])){
				nums1[resIndex] = nums1[lIndex];
				lIndex --;
			}
			resIndex --;
		}
	}
}
