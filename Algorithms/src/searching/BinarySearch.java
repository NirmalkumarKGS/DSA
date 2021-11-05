package searching;

public class BinarySearch {
	
	//Regular Binary Search Approach
	static int normalBinarySearch(int[] nums, int target, int start, int end) {
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(target < nums[mid]) {
				end = mid - 1;
			}else if(target > nums[mid]) {
				start = mid + 1;
			}else{
				return mid;
			}
		}
		return -1;
	}

	//recursive Binary Search
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
