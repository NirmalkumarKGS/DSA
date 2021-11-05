package searching;

public class InfiniteArrayBinary {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 7, 8, 10, 11, 12, 15, 20, 23, 30, 33, 42, 45, 48, 51, 56, 59, 60, 62, 66, 70, 72, 75, 82,
				85, 88, 90, 99 };
		int target = 88;
		boolean rangeFound = false;
		int start = 0;
		int end = start + 1;
		while (!rangeFound) {
			rangeFound = findValidRange(arr, target, start, end);
			if (rangeFound)
				break;
			else {
				int newStart = end + 1;
				end = (end - start + 1) * 2 + end;
				start = newStart;

			}
		}
		System.out.println(binarySearch(arr, target, start, end));

	}

	static boolean findValidRange(int[] arr, int target, int start, int end) {
		if (target <= arr[end]) {
			return true;
		}
		return false;
	}

	static int binarySearch(int[] arr, int target, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}