package searching;

/*
 * Given a characters array letters that is sorted in non-decreasing order and a character target, 
 * return the smallest character in the array that is larger than target.
 * Note that the letters wrap around.
 * For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
 * 
 *  https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 * **/

public class SmallestLetterGreaterThanTarget {

	public static void main(String[] args) {
		char[] letters = { 'c', 'f', 'j' };
		char target = 'g';

		System.out.println(nextGreaterLetter(letters, target));

	}

	static char nextGreaterLetter(char[] arr, char target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			}
		}
		return arr[start % arr.length];
	}

}
