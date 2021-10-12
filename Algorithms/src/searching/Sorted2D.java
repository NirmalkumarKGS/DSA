package searching;

public class Sorted2D {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 55;
		System.out.println(searchMatrix(matrix, target));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		int row = 0;
		int length = matrix.length;

		while (row < matrix.length) {
			int endCol = matrix[row].length - 1;

			if (matrix[row][endCol] < target)
				row++;
			else
				return binarySearch(matrix[row], target);
		}
		return false;
	}

	public static boolean binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target == arr[mid])
				return true;
			else if (target < arr[mid])
				end = mid - 1;
			else if (target > arr[mid])
				start = mid + 1;
		}
		return false;
	}
}