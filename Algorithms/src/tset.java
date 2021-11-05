
import static org.hamcrest.CoreMatchers.equalTo;

import java.util.*;
import java.util.Map.Entry;

public class tset {
	static String isBalanced(String s) {
		Stack<Character> str = new Stack<Character>();
		String ans = "true";
		String no = "false";
		boolean answer = true;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(') {
				str.push(ch);
				continue;
			}
			if (str.isEmpty()) {
				return no;

			}

			if (ch == ')') {
				if (str.peek() == '(') {
					str.pop();
				} else {
					answer = false;
					break;
				}
			}
			if (ch == ']') {
				if (str.peek() == '[') {
					str.pop();
				} else {
					answer = false;
					break;
				}
			}
			if (ch == '}') {
				if (str.peek() == '{') {
					str.pop();
				} else {
					answer = false;
					break;
				}
			}

		}
		if (!str.isEmpty()) {
			answer = false;
		}
		if (answer)
			return ans;
		else
			return no;

	}

	public static Integer sum(Integer[] ints) {
		int sum = 0;
		for (Integer integer : ints) {
			sum += integer;
		}
		return sum;
	}

	public static String sum(String[] strs) {
		StringBuilder sb = new StringBuilder();
		for (String string : strs) {
			sb.append(string);
		}
		return sb.toString();
	}

	public static void main(String args[]) throws Exception {
//		int[] nums = { 8, 1, 2, 2, 3 };
//		Map<Integer, Integer> hMap = new HashMap<>();
//		int[] copy = nums.clone();
//		Arrays.sort(copy);
//		for (int i = 0; i < nums.length; i++) {
//			hMap.putIfAbsent(copy[i], i);
//		}
//		for (int i = 0; i < nums.length; i++) {
//			copy[i] = hMap.get(nums[i]);
//		}

//		int i = 0, j = 0;
//		int[] result = new int[nums.length];
//		while (i < nums.length) {
//			if (i != j) {
//				if (nums[i] > nums[j])
//					result[i] = result[i] + 1;
//			}
//			j++;
//			if (j == nums.length) {
//				i++;
//				j = 0;
//
//			}
//		}

//		int[] nums = { 8, 1, 2, 2, 3 };
//		int[] count = new int[101];
//		int[] res = new int[nums.length];
//
//		for (int i = 0; i < nums.length; i++) {
//			count[nums[i]]++;
//		}
//
//		for (int i = 1; i <= 100; i++) {
//			count[i] += count[i - 1];
//		}
//
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] == 0)
//				res[i] = 0;
//			else
//				res[i] = count[nums[i] - 1];
//		}

		// int[] array = new int[] { 3, 5, -4, 8, 11, 1, -1, 6 };

//		int[] gain = { -5, 1, 5, 0, -7 };
//		int highAltitude = 0;
//		int startPoint = 0;
//		int n = gain.length;
//		for (int i = 0; i < n; i++) {
//			startPoint += gain[i];
//			if (startPoint > highAltitude)
//				highAltitude = startPoint;
//		}

//		int[][] matrix = new int[2][2];
//		Arrays.sort(array);
//		int left = 0;
//		int right = array.length - 1;
//		while (left < right) {
//			int currentSum = array[left] + array[right];
//			if (currentSum == 8) {
//				System.out.println(Arrays.toString(new int[] { array[left], array[right] }));
//			} else if (currentSum < 8) {
//				left++;
//			} else if (currentSum > 8) {
//				right--;
//			}
//		}

//		List<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
//		list.add(new ArrayList<>(Arrays.asList(new String[] { "phone", "blue", "pixel" })));
//		list.add(new ArrayList<>(Arrays.asList(new String[] { "computer", "silver", "lenovo" })));
//		list.add(new ArrayList<>(Arrays.asList(new String[] { "phone", "gold", "iphone" })));
//		System.out.println(countMatches(list, "color", "silver"));

		// searchPosition(new int[] { 5, 7, 7, 8, 8, 10 }, 0, 5, 8);

		// int[] array = new int[] { 1, 3 };
		// System.out.println(searchInsert(array, 0));

		// System.out.println(leftIndex);
		// System.out.println(rightIndex);

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2));

		ListIterator<Integer> listItr = list.listIterator();
		int count = 0;
		while (listItr.hasNext()) {
			if (listItr.next() == 2) {
				listItr.remove();
				count += 1;
			}
		}

		for (int i = 0; i < count; i++) {
			list.add(2);
		}

		for (int num : list) {
			System.out.println(num);
		}
	}

	public static int searchInsert(int[] nums, int target) {
		int startIndex = 0;
		int endIndex = nums.length - 1;

		while (startIndex < endIndex) {
			int midIndex = startIndex + (endIndex - startIndex) / 2;
			if (target == nums[midIndex])
				return midIndex;
			else if (nums[midIndex] > target) {
				endIndex = midIndex;

			} else if (nums[midIndex] < target) {
				startIndex = midIndex + 1;
			}
		}
		if (nums[startIndex] < target)
			startIndex += 1;

		return startIndex;
	}

	public static int firstBadVersion(int n) {
		int badVersion = n;
		for (int i = 1, j = n; i <= j; i++, j--) {
			if (i == 2) {
				badVersion = i;
				break;
			}
			if (j == 2) {
				badVersion = j;
			}

		}
		return badVersion;
	}

	static int leftIndex = Integer.MAX_VALUE;
	static int rightIndex = -1;

	public static int countMatches(List<ArrayList<String>> items, String ruleKey, String ruleValue) {
		ListIterator<ArrayList<String>> iterator = items.listIterator();
		int count = 0;
		while (iterator.hasNext()) {
			List<String> valueList = iterator.next();
			if (ruleKey.equals("type")) {
				if (valueList.get(0).equals(ruleValue))
					count++;
			} else if (ruleKey.equals("color")) {
				if (valueList.get(1).equals(ruleValue))
					count++;
			} else if (ruleKey.equals("name")) {
				if (valueList.get(2).equals(ruleValue))
					count++;
			}
		}
		return count;
	}

	public static void searchPosition(int[] nums, int left, int right, int target) {
		if (left > right)
			return;

		int mid = (left + right) / 2;
		if (nums[mid] == target) {
			if (mid > rightIndex)
				rightIndex = mid;
			if (mid < leftIndex)
				leftIndex = mid;
			searchPosition(nums, left, mid - 1, target);
			searchPosition(nums, mid + 1, right, target);

		} else if (nums[mid] > target)
			searchPosition(nums, left, mid - 1, target);
		else
			searchPosition(nums, mid + 1, right, target);
	}
}
