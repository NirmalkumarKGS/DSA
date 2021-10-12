package HashSet;

import java.util.HashSet;

/**
 * The HashSet class implements the Set interface, backed by a hash table which
 * is actually a HashMap instance. No guarantee is made as to the iteration
 * order of the set which means that the class does not guarantee the constant
 * order of elements over time. This class permits the null element.
 * 
 * The class also offers constant time performance for the basic operations like
 * add, remove, contains, and size assuming the hash function disperses the
 * elements properly among the buckets
 */

public class HashSetExample {

	public static void main(String[] args) {

		// This constructor is used to build an empty HashSet object in which the
		// default initial capacity is 16 and the default load factor is 0.75.
		HashSet<String> h = new HashSet<String>();

		// Adding elements into HashSet using add()
		h.add("India");
		h.add("Australia");
		h.add("South Africa");
		h.add("India"); // adding duplicate elements

		// Displaying the HashSet
		System.out.println(h);

	}

}
