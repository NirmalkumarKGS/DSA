package sorting;

import java.util.Arrays;

/**
 * 
 * Insertion sort is a simple sorting algorithm that works similar to the way
 * you sort playing cards in your hands. The array is virtually split into a
 * sorted and an unsorted part. Values from the unsorted part are picked and
 * placed at the correct position in the sorted part.
 * 
 *  Algorithm: To sort an array of size n in ascending order: 
 *  1: Iterate from arr[1] to arr[n] over the array. 
 *  2: Compare the current element (key) to its predecessor. 
 *  3: If the key element is smaller than its predecessor, compare it to the elements before. 
 *  Move the greater elements one position up to make space for the swapped element.
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11,11,0,-77 };
		System.out.println(Arrays.toString(Sort(arr)));
	}

	private static int[] Sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break;
				}
			}
		}
		return arr;
	}

}
