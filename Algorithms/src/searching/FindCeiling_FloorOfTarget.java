package searching;

public class FindCeiling_FloorOfTarget {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 4, 4, 4, 8, 14, 16, 17, 18 };
		int target = 15;
		System.out.print("Ceiling of number " + target + " is: ");
		System.out.println(Ceiling(arr, target));

		System.out.print("Floor of number " + target + " is: ");
		System.out.println(Floor(arr, target));
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

}
