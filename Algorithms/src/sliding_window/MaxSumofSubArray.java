package sliding_window;

public class MaxSumofSubArray {

	/**
	 * Need to find the maximum sum of sub array with given 'k'th size
	 */
	public static void main(String[] args) {
		// input array
		int[] arr = { 1 };
		// window size/sub array size
		int k = 1;
		System.out.println(sumOfSubArray(arr, k));
		System.out.println(slidingWindow(arr, k));
	}

	// Brute Force Technique - nester loop
	// Outer loop will start from 0th position to possible kth sub array
	// Inner loop will add the sum of kth sub array elements
	// Time complexity for this will be
	// Outer loop n-k+1 times
	// Inner loop will be k - 1 times
	// O(k(n-k+1)) -> O(n*k)
	private static int sumOfSubArray(int[] arr, int k) {
		int n = arr.length;
		int sum = Integer.MIN_VALUE;

		for (int i = 0; i < n - k + 1; i++) {
			int currentSum = 0;
			for (int j = 0; j < k; j++)
				currentSum += arr[i + j];
			sum = Math.max(currentSum, sum);
		}
		return sum;
	}

	// Loop will run upto arr.length - 1 times
	// Step 1: First calculate the sum of k elements for the first window size
	// Step 2: then slide the window by removing first element of previous window
	// and next array element.
	// Step 3: calculate the sum by subtracting the removed element value and added
	// element value
	// Step 4: Repeat the steps upto nth element in the array.
	private static int slidingWindow(int[] arr, int k) {
		int sum = 0;
		// array length should be greater than the sub array size (k)
		if (arr.length < k)
			return -1;
		// calculate initial window size
		for (int i = 0; i < k; i++)
			sum += arr[i];

		int windowSize = sum;
		for (int j = k; j < arr.length; j++) {
			windowSize = windowSize + arr[j] - arr[j - k];
			sum = Math.max(sum, windowSize);
		}
		return sum;
	}

}
