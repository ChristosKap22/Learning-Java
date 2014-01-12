package arrays;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = { 1, 9, 2, 8, 3, 7, 4, 6, 5, 0 };
		
		System.out.println("Unsorted: " + Arrays.toString(array));
		
		quickSort(array);
		
		System.out.println("Sorted: " + Arrays.toString(array));
	}
	
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}
	
	private static int partition(int[] array, int leftIndex, int rightIndex, int pivotIndex) {
		int pivotValue = array[pivotIndex];
		
		// Swap array[rightIndex] with array[pivotIndex]
		int bridge = array[rightIndex];
		array[rightIndex] = array[pivotIndex];
		array[pivotIndex] = bridge;
		
		int storeIndex = leftIndex;
		for (int i = leftIndex; i < rightIndex; i++) {
			if (array[i] < pivotValue) {
				// Swap array[storeIndex] with array[i]
				bridge = array[storeIndex];
				array[storeIndex] = array[i];
				array[i] = bridge;
				
				storeIndex++;
			}
		}
		
		// Swap array[storeIndex] and array[rightIndex]
		// The storeIndex is the new position of the pivot
		bridge = array[storeIndex];
		array[storeIndex] = array[rightIndex];
		array[rightIndex] = bridge;
		
		return storeIndex;
	}
	
	private static void quickSort(int[] array, int leftIndex, int rightIndex) {
		if (rightIndex - leftIndex < 1) {
			return;
		}
		
		int pivotIndex = (leftIndex + rightIndex) / 2;
		int pivotIndexAfterPartition = partition(array, leftIndex, rightIndex, pivotIndex);
		
		quickSort(array, leftIndex, pivotIndexAfterPartition - 1);
		quickSort(array, pivotIndexAfterPartition + 1, rightIndex);
	}

}
