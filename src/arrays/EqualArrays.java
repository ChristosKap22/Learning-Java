package arrays;

import java.util.Scanner;

public class EqualArrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("First array length = ");
		int firstArrayLength = scanner.nextInt();
		int[] firstArray = new int[firstArrayLength];
		for (int i = 0; i < firstArray.length; i++) {
			System.out.printf("firstArray[%d] = ", i);
			firstArray[i] = scanner.nextInt();
		}
		
		System.out.print("First array length = ");
		int secondArrayLength = scanner.nextInt();
		int[] secondArray = new int[secondArrayLength];
		for (int i = 0; i < secondArray.length; i++) {
			System.out.printf("secondArray[%d] = ", i);
			secondArray[i] = scanner.nextInt();
		}
		
		if (firstArray.length != secondArray.length) {
			System.out.println("The arrays are not equal");
		} else {
			boolean areEqual = true;
			for (int i = 0; i < firstArray.length; i++) {
				if (firstArray[i] != secondArray[i]) {
					areEqual = false;
					break;
				}
			}
			
			System.out.printf("The two arrays are equal? : %b", areEqual);
		}
		
		scanner.close();
	}

}
