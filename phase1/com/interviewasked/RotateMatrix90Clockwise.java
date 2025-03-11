package com.interviewasked;

public class RotateMatrix90Clockwise {

	public static void main(String[] args) {
		int [][] matrix={ {1, 2, 3},
	  			  		  {4, 5, 6},
	  			          {7, 8, 9},
		};
		/* rows 3, cols = 3
		 
		 temp = (0,2) = 3
		 (0,2) = (0,0) = 1
		 (0,0) = (2,0) = 7
		 (2,0) = 3
		 
		 i = 0, j = 1
		 temp = (0,1) = 2
		 (0,1) = 
		 
		 
		 
		 
		*/

	}
	public static void rotate90Clockwise(int [][] matrix){
		int rows = matrix.length,cols = matrix[0].length;
		if(rows != cols) return;
		for(int i = 0; i < rows; ++ i){
			for(int j = 0; j <= cols; ++ j){
				int temp = matrix[i][cols - j - 1];
				matrix[i][cols - j - 1] = matrix[i][j];
				matrix[i][j] = matrix[rows - i - 1][j];
				matrix[rows - i - 1][j] = temp;
			}
		}
	}
}
