import java.util.*;

public class SpaceCompTest {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 4, 7, 12, 15, 1000 }, { 2, 5, 19, 31, 32, 1001 }, { 3, 8, 24, 33, 35, 1002 },
				{ 40, 41, 42, 44, 45, 1003 }, { 99, 100, 103, 106, 128, 1004 } };
		int rows = matrix.length;
		for (int i = 0; i < rows; i++) {
			int colIdx = binarySearch(matrix[i], 1004);
			if (colIdx > -1)
				System.out.println(i + ", " + colIdx);
		}

		System.out.println(" -1, -1 ");

	}

	public static int binarySearch(int[] array, int target) {
		return binarySearch(array, 0, array.length - 1, target);
	}

	public static int binarySearch(int[] array, int left, int right, int target) {
		if (left > right) {
			return -1;
		}
		int mid = left + (right - left) / 2;
		if (target < array[mid]) {
			return binarySearch(array, target, left, mid - 1);
		} else if (target > array[mid]) {
			return binarySearch(array, target, mid + 1, right);
		} else
			return mid;
	}

}
