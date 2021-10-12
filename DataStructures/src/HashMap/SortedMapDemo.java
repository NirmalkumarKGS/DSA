package HashMap;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class SortedMapDemo {

	public static void main(String[] args) {
		SortedMap<Integer, String> ame = new TreeMap<>();
		ame.put(3, "s");
		ame.put(5, "s");
		ame.put(1, "s");
		ame.put(2, "s");
		
//		System.out.println(ame);
		
		NavigableMap<Integer, String> navi = new TreeMap<>();
		navi.put(3, "s");
		navi.put(5, "s");
		navi.put(1, "s");
		navi.put(2, "s");
		
//		System.out.println(navi);
//		System.out.println(navi.tailMap(2, true));
//		
//		System.out.println(navi.subMap(2, 10));
//		System.out.println(navi.subMap(1, true, 5, true));
//		
//		System.out.println(navi.descendingKeySet());
//		System.out.println(navi.higherEntry(1));
//		System.out.println(navi.ceilingEntry(2));
		
		TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);

        // Using get()
        int value1 = numbers.get("Three");
        System.out.println("Using get(): " + value1);

        // Using getOrDefault()
        int value2 = numbers.getOrDefault("Five", 100);
        System.out.println("Using getOrDefault(): " + value2);
        
	}
	
	// Creating a comparator class
    public static class CustomComparator implements Comparator<String> {

        @Override
        public int compare(String number1, String number2) {
            int value =  number1.compareTo(number2);

            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            }
            else if (value < 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
	
}