package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InitializeArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Array length: ");
		int arrayLength = scanner.nextInt();
		
		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = i * 5;
		}
		
		System.out.println(Arrays.toString(array));
		
		scanner.close();
	}

}
