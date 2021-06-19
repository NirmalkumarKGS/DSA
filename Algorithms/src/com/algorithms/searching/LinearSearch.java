package com.algorithms.searching;

import org.junit.Test;

/**
 * 
 * @author Nirmal 
 * Find the index of target value in an unsorted array 
 * Input1:”{ 5, 9, 1, 0, 11, 23, 55 }” Input2: 55 Output: 6 
 * Linear search algorithm
 * 
 */
public class LinearSearch {

	int[] array = { 5, 9, 1, 0, 11, 23, 55 };

	@Test
	public void TestCase1() {
		int output = search(array, 0);
		System.out.println(output);
	}

	@Test
	public void TestCase2() {
		int output = search(array, 55);
		System.out.println(output);
	}	

	@Test
	public void TestCase3() {
		int output = betterSearch(array, 0);
		System.out.println(output);
	}

	@Test
	public void TestCase4() {
		int output = betterSearch(array, 55);
		System.out.println(output);
	}
	

	// Time Complexity
	// If element found: Best case: O(1), Worst case: O(n)
	// If element not found: O(n)
	public static int search(int[] arr, int target) {
		if (arr.length < 0)
			return -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				return i;
		}
		return -1;
	}

	// Time to improve the worst case
	// If element found: Best case: O(1), Worst case: O(n/2)
	// If element not found: O(n)
	public static int betterSearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int index = -1;

		if (arr.length < 0)
			return -1;

		for (start = 0; start <= end;) {
			if (arr[start] == target) {
				index = start;
				break;
			} else if (arr[end] == target) {
				index = end;
				break;
			}
			start++;
			end--;
		}
		return index;
	}

}
