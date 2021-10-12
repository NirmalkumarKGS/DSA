package HashMap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		WeakHashMap<Integer, String> weak = new WeakHashMap<>();
		
		Integer two = new Integer(2);
		String twoS = new String("Two");
		
		weak.put(two, twoS);
		System.out.println(weak);
		
		two = null;
		
		System.gc();
		
		System.out.println(weak);
		
		
		HashMap<Integer, String> map = new HashMap<>();
		
		Integer two1 = new Integer(2);
		String twoS1 = new String("Two");
		
		map.put(two1, twoS1);
		System.out.println(map);
		
		two1 = null;
		
		System.gc();
		
		System.out.println(map);
	}
	
}
