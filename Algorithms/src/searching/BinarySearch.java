package searching;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 4, 4, 4, 8, 14, 16, 17, 18 };
		int target = 15;
		System.out.print("Ceiling of number " + target + " is: ");
		System.out.println(Ceiling(arr, target));

		System.out.print("Floor of number " + target + " is: ");
		System.out.println(Floor(arr, target));

		int first = searchPosition(arr, 4, true);
		int last = searchPosition(arr, 4, false);
		System.out.println(first + " , " + last);

		System.out.println(Arrays.toString(searchRange(new int[] {1}, 1)));

	}

	// Return the smallest number which is >= target
	static int Ceiling(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == nums[mid])
				return nums[mid];
			else if (target < nums[mid])
				end = mid - 1;
			else if (target > nums[mid])
				start = mid + 1;
		}
		return nums[start];
	}

	// Return the greatest number which is <= target
	static int Floor(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == nums[mid])
				return nums[mid];
			else if (target < nums[mid])
				end = mid - 1;
			else if (target > nums[mid])
				start = mid + 1;
		}
		return nums[end];
	}

	public static int searchPosition(int[] nums, int target, boolean findFirstIndex) {
		int ans = -1;
		int start = 0, end = nums.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				ans = mid;
				if (findFirstIndex)
					end = mid - 1;
				else
					start = mid + 1;

			} else if (target < nums[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}
		return ans;
	}

	public static int[] searchRange(int[] nums, int target) {
		int[] position = { -1, -1 };
		int left = 0, right = nums.length - 1;
		boolean leftFound = false, rightFound = false;
		while (left <= right) {
			if (!leftFound) {
				if (nums[left] == target) {
					position[0] = left;
					leftFound = true;
				} else
					left++;
			}
			if (!rightFound) {
				if (nums[right] == target) {
					position[1] = right;
					rightFound = true;
				} else
					right--;
			}
			if (position[0] > -1 && position[1] > -1)
				break;
		}
		return position;
	}
	
	public static int binarySearch(int[] array, int target) {
		return binarySearch(array, target, 0, array.length - 1);
	}

	public static int binarySearch(int[] array, int target, int left, int right) {
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
