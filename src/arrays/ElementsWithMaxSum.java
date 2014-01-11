package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ElementsWithMaxSum {

	public static void main(String[] args) {
		int[] array = { 1, 9, 2, 8, 3, 7, 4, 6, 5, 0 };
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number of elements with max sum: ");
		int numberOfElementsWithMaxSum = scanner.nextInt();
		
		int[] elementsWithMaxSum = findElementsWithMaxSum(array, numberOfElementsWithMaxSum);
		System.out.println("Elementes with max sum: " + Arrays.toString(elementsWithMaxSum));
		
		scanner.close();
	}
	
	private static int[] findElementsWithMaxSum(int[] array, int numberOfElements) {
		if (numberOfElements >= array.length) {
			return array.clone();
		}
		
		Arrays.sort(array);
		int[] elementsWithMaxSum = new int[numberOfElements];
		for (int i = 0; i < numberOfElements; i++) {
			elementsWithMaxSum[i] = array[array.length - 1 - i];
		}
		
		return elementsWithMaxSum;
	}

}
