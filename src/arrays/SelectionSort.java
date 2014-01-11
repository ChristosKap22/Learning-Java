package arrays;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = { 1, 9, 2, 8, 3, 7, 4, 6, 5, 0 };
		
		System.out.println("Unsorted: " + Arrays.toString(array));
		
		selectionSort(array);
		
		System.out.println("Sorted: " + Arrays.toString(array));
	}
	
	private static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int indexOfMinElement = i;
			
			// Find the min element
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[indexOfMinElement]) {
					indexOfMinElement = j;
				}
			}
			
			// Swap the i-th element with the min element
			int bridge = array[i];
			array[i] = array[indexOfMinElement];
			array[indexOfMinElement] = bridge;
		}
	}

}
