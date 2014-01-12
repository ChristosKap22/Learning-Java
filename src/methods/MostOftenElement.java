package methods;

import java.util.HashMap;
import java.util.AbstractMap.SimpleEntry;

public class MostOftenElement {

	public static void main(String[] args) {
		int[] array = { 4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3 };
		
		SimpleEntry<Integer, Integer> mostOftenElement = findMostOftenElement(array);
		System.out.printf("Most often element: %d -> %d times",
				mostOftenElement.getKey(), mostOftenElement.getValue());
	}
	
	private static SimpleEntry<Integer, Integer> findMostOftenElement(int[] array) {
		HashMap<Integer, Integer> elementsCounts = new HashMap<Integer, Integer>();
		
		int keyWithMaxCount = 0;
		int maxCount = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (elementsCounts.containsKey(array[i])) {
				int oldCount = elementsCounts.get(array[i]);
				int newCount = oldCount + 1;
				
				if (maxCount < newCount) {
					maxCount = newCount;
					keyWithMaxCount = array[i];
				}
				
				elementsCounts.put(array[i], newCount);
			} else {
				elementsCounts.put(array[i], 1);
			}
		}
		
		return new SimpleEntry<Integer, Integer>(keyWithMaxCount, maxCount);
	}

}
