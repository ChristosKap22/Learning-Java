package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		System.out.println(Arrays.toString(array));
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Searched element: ");
		int searchedElement = scanner.nextInt();
		
		int searchedElementIndex = binarySearch(array, searchedElement);
		System.out.println("The element is at index: " + searchedElementIndex);
		
		scanner.close();
	}
	
	private static int binarySearch(int[] array, int searchedValue) {
		int leftIndex = 0;
		int rightIndex = array.length - 1;
		
		while (rightIndex - leftIndex >= 0) {
			int middleIndex = (rightIndex + leftIndex) / 2;
			if (array[middleIndex] < searchedValue) {
				leftIndex = middleIndex + 1;
			} else if (array[middleIndex] > searchedValue) {
				rightIndex = middleIndex - 1;
			} else {
				return middleIndex;
			}
		}
		
		return -1;
	}

}
