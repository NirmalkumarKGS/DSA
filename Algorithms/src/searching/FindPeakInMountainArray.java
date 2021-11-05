package searching;

/*
 * Find the peak in mountain array
 * **/
public class FindPeakInMountainArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 4, 5, 6, 7, 8, 0, 1, 2, };
		System.out.println(findPeak(arr));
	}

	private static int findPeak(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] > arr[mid + 1]) {
				//you are in desc part of array
				// this may be the ans but look left side for more potential ans.
				// this is why end != mid -1;
				end = mid;
			} else if (arr[mid] < arr[mid + 1]) {
				// you are in the asc part of the array
				// so we dont need to have start = mid; because mid +1 is greater than mid 
				start = mid + 1;
			}
		}
		//when the loop breaks, start === end means start and end will point to the same element which will be the peak of the array
		return start;

	}

}