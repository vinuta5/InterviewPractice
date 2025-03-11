package leetcode.microsoft;

public class SearchA2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean findInAMatrix(int [][] matrix,int target){
		if(matrix == null || matrix[0].length == 0 || matrix.length == 0){
			return false;
		}
		int row_low = 0,row_high = matrix.length - 1, col_low = 0,col_high = matrix[0].length;
		int last = matrix[0].length - 1, first = 0;
		
		while(row_low <= row_high && col_low <= col_high){
			int row_mid = row_low + (row_high - row_low)/2;
			int col_mid = col_low + (col_high - col_low)/2;
			if(target == matrix[row_mid][col_mid]) return true;
			if(target > matrix[row_mid][last]){
				row_low = row_mid + 1;
			}
			else if(target < matrix[row_mid][first]){
				row_high = row_mid - 1;
			}
			else if(target < matrix[row_mid][col_mid]){
				col_high = col_mid - 1;
			}
			else{
				col_low = col_mid + 1;
			}
		}
		return false;
	}
}
