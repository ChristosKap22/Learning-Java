package arrays;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = { 1, 9, 2, 8, 3, 7, 4, 6, 5, 0 };
		
		System.out.println("Unsorted: " + Arrays.toString(array));
		
		mergeSort(array);
		
		System.out.println("Sorted: " + Arrays.toString(array));
	}

	private static int[] merge(int[] firstArray, int[] secondArray) {
		int[] mergedArray = new int[firstArray.length + secondArray.length];
		int mergedArrayCurrentIndex = 0;
		int firstArrayCurrentIndex = 0;
		int secondArrayCurrentIndex = 0;

		while (firstArrayCurrentIndex < firstArray.length
				|| secondArrayCurrentIndex < secondArray.length) {
			
			if (firstArrayCurrentIndex < firstArray.length
					&& secondArrayCurrentIndex < secondArray.length) {
				
				if (firstArray[firstArrayCurrentIndex] < secondArray[secondArrayCurrentIndex]) {
					
					mergedArray[mergedArrayCurrentIndex] = firstArray[firstArrayCurrentIndex];
					mergedArrayCurrentIndex++;
					firstArrayCurrentIndex++;
				} else {
					mergedArray[mergedArrayCurrentIndex] = secondArray[secondArrayCurrentIndex];
					mergedArrayCurrentIndex++;
					secondArrayCurrentIndex++;
				}
			} else if (firstArrayCurrentIndex >= firstArray.length
					&& secondArrayCurrentIndex < secondArray.length) {
				
				mergedArray[mergedArrayCurrentIndex] = secondArray[secondArrayCurrentIndex];
				mergedArrayCurrentIndex++;
				secondArrayCurrentIndex++;
			} else if (firstArrayCurrentIndex < firstArray.length
					&& secondArrayCurrentIndex >= secondArray.length) {
				
				mergedArray[mergedArrayCurrentIndex] = firstArray[firstArrayCurrentIndex];
				mergedArrayCurrentIndex++;
				firstArrayCurrentIndex++;
			}
		}

		return mergedArray;
	}

	public static void mergeSort(int[] array) {
		// If the array has less then 2 elements the function is returned
		if (array.length < 2) {
			return;
		}

		// Generate two partition arrays
		int[] leftArray = new int[array.length / 2];
		int[] rightArray = new int[array.length - leftArray.length];
		int rightArrayIndex = 0;

		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = array[i];
		}
		for (int i = leftArray.length; i < array.length; i++) {
			rightArray[rightArrayIndex] = array[i];
			rightArrayIndex++;
		}

		mergeSort(leftArray);
		mergeSort(rightArray);

		int[] mergedArray = merge(leftArray, rightArray);
		for (int i = 0; i < mergedArray.length; i++) {
			array[i] = mergedArray[i];
		}
	}

}
