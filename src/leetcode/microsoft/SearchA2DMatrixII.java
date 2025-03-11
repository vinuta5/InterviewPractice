package leetcode.microsoft;

public class SearchA2DMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean findATarget(int [][] matrix, int target){
		if(matrix.length == 0){
			return false;
		}
		int low = 0, high = matrix[0].length - 1;
		while(low < matrix.length && high >= 0){
			if(matrix[low][high] == target){
				return true;
			}
			else if(matrix[low][high] < target){
				low ++;
			}
			else{
				high --;
			}
		}
		return false;
	}
}
