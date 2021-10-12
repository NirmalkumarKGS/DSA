package searching;

public class InfiniteArrayBinary {

	public static int findTargetInFromfiniteArray(int[] arr, int target) {
		int output = findBoxes(arr, target);
		return output;
	}
	
	public static int findBoxes(int[] arr, int target) {
		int start = 0;
		int end = 1;
		
		while(target > arr[end]) {
			int temp = end + 1;
			end = end + (end - start + 1) * 2;
			start = temp;
		}
		
		return binarySearch(arr, target, start, end);
	}
	
	public static int binarySearch(int[] arr, int target, int start, int end) {
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(target < arr[mid]) {
				end = mid - 1;
			}else if(target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
//		int[] arr = {2,3,5,7,8,10,11,12,15,20,23,30};
//		int target = 8;
//		System.out.println(findTargetInFromfiniteArray(arr, target));
		System.out.println(1/6);
	}
	
}