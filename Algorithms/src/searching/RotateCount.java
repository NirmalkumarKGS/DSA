package searching;

import java.util.HashMap;
import java.util.Map;

public class RotateCount {

	public static void main(String[] args) {
		int[] nums = { 15, 21, 27, 2, 3, 6, 8, 10, 13 };
		int target =5;
		// System.out.println(binarySearch(arr) + 1);
		Map<Integer, Integer> set = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (set.containsKey(diff)) {
				System.out.println(set.get(diff));System.out.println(i);
				System.out.println(nums[set.get(diff)]);System.out.println(nums[i]);
			} else {
				set.put(nums[i], i);
			}
		}
		
		// expected output is 3
	}

	public static int binarySearch(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if (arr[mid] <= arr[start]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

}