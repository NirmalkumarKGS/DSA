package HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Nirmal
 * */
/**
 * @implNote The Java Set interface, java.util.Set, represents a collection of
 *           objects where each object in the Java Set is unique. In other
 *           words, the same object cannot occur more than once in a Java Set.
 *           The Java Set interface is a standard Java interface and it is a
 *           subtype of the Java Collection interface, meaning Set inherits from
 *           Collection.
 * 
 *           Set Implementation - AbstractSet, ConcurrentHashMap.KeySetView,
 *           ConcurrentSkipListSet, CopyOnWriteArraySet, EnumSet, HashSet,
 *           JobStateReasons, LinkedHashSet, TreeSet
 */

public class SetExample {
	public static void main(String[] args) {

		Set<Integer> SetA = new HashSet<Integer>();
		SetA.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
		Set<Integer> SetB = new HashSet<Integer>();
		SetB.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

		// To find union
		Set<Integer> union = new HashSet<Integer>(SetA);
		union.addAll(SetB);
		System.out.print("Union of the two Set");
		System.out.println(union);

		// To find intersection
		Set<Integer> intersection = new HashSet<Integer>(SetA);
		intersection.retainAll(SetB);
		System.out.print("Intersection of the two Set");
		System.out.println(intersection);

		// To find the symmetric difference
		Set<Integer> difference = new HashSet<Integer>(SetA);
		difference.removeAll(SetB);
		System.out.print("Difference of the two Set");
		System.out.println(difference);

	}
}
