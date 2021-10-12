package searching;

public class RotateCount {

	public static void main(String[] args) {
		int[] arr = {15,21,27,2,3,6,8,10,13};
		System.out.println(binarySearch(arr) + 1);
		
		//expected output is 3
	}
	
	public static int binarySearch(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {			
			int mid = start + (end - start)/2;
			if(mid < end && arr[mid] > arr[mid+1]) {
				return mid;
			}
			if(mid > start && arr[mid] < arr[mid-1]) {
				return mid-1;
			}
			if(arr[mid] <= arr[start]) {
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		return -1;
	}

}