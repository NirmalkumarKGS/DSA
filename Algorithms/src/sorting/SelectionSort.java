package sorting;

import java.util.Arrays;

/**
 * The selection sort algorithm sorts an array by repeatedly finding the minimum
 * or maximum element (considering ascending order) from unsorted part and
 * putting it at the appropriate index
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11 };
		System.out.println(Arrays.toString(Sort(arr)));

	}

	static int[] Sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int lastIndex = arr.length - i - 1;
			int maxIndex = findMaxIndex(arr, 0, lastIndex);
			int temp = arr[lastIndex];
			arr[lastIndex] = arr[maxIndex];
			arr[maxIndex] = temp;
		}
		return arr;
	}

	static int findMaxIndex(int[] arr, int start, int end) {
		int max = start;
		while (start <= end) {
			if (arr[max] < arr[start]) {
				max = start;
			}
			start++;
		}
		return max;
	}

}
