package HashSet;

import java.util.EnumSet;
import java.util.Set;

/**
 * EnumSet class which is implemented in the collections framework is one of the
 * specialized implementation of the Set interface for use with the enumeration
 * type. It is a high performance set implementation, much faster than HashSet.
 * 
 * All of the elements in an enum set must come from a single enumeration type
 * that is specified when the set is created either explicitly or implicitly.
 */

public class EnumSetExample {
	public static void main(String[] args) {
		// Creating a set
		Set<Designation> set1;

		// Adding the elements
		set1 = EnumSet.of(Designation.SDE, Designation.DBADMIN, Designation.ARCHITECT, Designation.SDET,
				Designation.MANAGER);

		System.out.println("Set 1: " + set1);
	}
}

enum Designation {
	TRAINEE, SDE, SSDE, TECHLEAD, ARCHITECT, DEVOPS, MANAGER, DBADMIN, SDET
}