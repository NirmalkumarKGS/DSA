import java.util.*;

public class testing {

	public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
		Map<String, Integer> winnerMap = new TreeMap<String, Integer>();
		for (int i = 0; i < results.size(); i++) {
			if (results.get(i) > 0) {
				String winner = competitions.get(i).get(0);
				if (winnerMap.containsKey(winner)) {
					winnerMap.replace(winner, winnerMap.get(winner) + 3);
				} else
					winnerMap.put(winner, 3);
			} else {
				String winner = competitions.get(i).get(1);
				if (winnerMap.containsKey(winner))
					winnerMap.replace(winner, winnerMap.get(winner) + 3);
				else
					winnerMap.put(winner, 3);
			}
		}
		SortedMap<String, Integer> sortedMap = valueSort(winnerMap);
		return sortedMap.lastKey();
	}

	public <K, V extends Comparable<V>> SortedMap<K, V> valueSort(final Map<K, V> map) {
		// Static Method with return type Map and
		// extending comparator class which compares values
		// associated with two keys
		Comparator<K> valueComparator = new Comparator<K>() {

			// return comparison results of values of
			// two keys
			public int compare(K k1, K k2) {
				int comp = map.get(k1).compareTo(map.get(k2));
				if (comp == 0)
					return 1;
				else
					return comp;
			}

		};

		// SortedMap created using the comparator
		NavigableMap<K, V> sorted = new TreeMap<K, V>(valueComparator);

		sorted.putAll(map);

		return sorted;
	}
}
