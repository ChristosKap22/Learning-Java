package methods;

import java.util.Arrays;

public class GenericSelectionSort {

	public static void main(String[] args) {
		Character[] charArray = { 'b', 'a', 'f', 'd', 'e', 'c' };
		
		System.out.println("Unsorted: " + Arrays.toString(charArray));
		
		selectionSort(charArray);
		
		System.out.println("Sorted: " + Arrays.toString(charArray));
		
		Integer[] intArray = { 5, 1, 4, 2, 3, 6 };
		
		System.out.println("Unsorted: " + Arrays.toString(intArray));
		
		selectionSort(intArray);
		
		System.out.println("Sorted: " + Arrays.toString(intArray));
	}
	
	public static <T extends Comparable<T>> void selectionSort(T[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int indexOfMinElement = i;
			
			for (int j = i + 1; j < array.length; j++) {
				if (array[j].compareTo(array[indexOfMinElement]) < 0) {
					indexOfMinElement = j;
				}
			}
			
			// swap the i-th element with the min element
			T bridge = array[i];
			array[i] = array[indexOfMinElement];
			array[indexOfMinElement] = bridge;
		}
	}

}
