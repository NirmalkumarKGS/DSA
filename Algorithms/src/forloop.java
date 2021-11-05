

import java.util.Arrays;

public class forloop {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		printMatrix(matrix);

		System.out.println("--------------------------------------");

		int totalRowOfRotatedMatrix = matrix[0].length;
		int totalColOfRotatedMatrix = matrix.length;
		int n = matrix.length;
		int[][] rotatedMatrix = new int[totalRowOfRotatedMatrix][totalColOfRotatedMatrix];

		System.out.println("---------clock wise--------");
		
		// clockwise rotation
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				rotatedMatrix[j][(totalColOfRotatedMatrix - 1) - i] = matrix[i][j];
			}
		}

		printMatrix(rotatedMatrix);
		

		System.out.println("--------------------------------------");

		System.out.println("---------anti-clock wise--------");


		// anti-clockwise rotation
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				rotatedMatrix[(totalRowOfRotatedMatrix - 1) - j][i] = matrix[i][j];
			}
		}

		printMatrix(rotatedMatrix);
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "   ");
			}
			System.out.println();
		}
	}
	
    public boolean findRotation(int[][] mat, int[][] target) {
        int n= mat.length;
        for(int i=0; i<n/2; i++){
            for(int j=0; j<n-i-1; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[n-j-1][i];
                mat[n-j-1][i]= mat[n-i-1][n-j-1];
                mat[n-i-1][n-j-1] = mat[j][n-i-1];
                mat[j][n-i-1] = temp;
            }
        }
        boolean flag = true;
        for(int i=0; i<mat.length; i++){
            for(int j=i; j<mat[0].length; j++){
                if(mat[i][j] != target[i][j])
                    flag = false;
            }
        }
        return flag;
    }

}
