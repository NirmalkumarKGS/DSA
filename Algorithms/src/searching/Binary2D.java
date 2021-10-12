package searching;

import java.util.Arrays;

public class Binary2D {

	public static void main(String[] args) {
		int[][] matrix = {
				{10, 20, 30, 40},
				{15, 25, 35, 45},
				{28, 29, 37, 49},
				{33, 34, 38, 50}
		};
		
		System.out.println(Arrays.toString(search(matrix, 50)));
		
	}
	
	public static int[] search(int[][] matrix, int target) {
		
		int r = 0;
		int c = matrix.length - 1;
		
		while( r < matrix.length && c >= 0) {
			if(matrix[r][c] == target) {
				return new int[] {r,c};
			}else if(matrix[r][c] > target) {
				c--;
			}else {
				r++;
			}
		}
		
		return new int[] {-1,-1};
	}
	
}


// Time Complexity O(N)
// Space Complexity O(1)