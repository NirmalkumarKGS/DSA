package sorting;

/**
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly
 * swapping the adjacent elements if they are in wrong order.
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3,0 };
		printArray(Sort(arr));
	}

	private static int[] Sort(int[] arr) {
		boolean isSwapped = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				System.out.println(i + "-" + j);
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					isSwapped = true;
				}
			}
			if (!isSwapped)
				break;
		}
		return arr;
	}

	/* Prints the array */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
