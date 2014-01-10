package loops;

import java.util.Scanner;

public class FindMinAndMaxNumber {

	public static void main(String[] args) {
		int minNumber = Integer.MAX_VALUE;
		int maxNumber = Integer.MIN_VALUE;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number of numbers to input: ");
		int numbersToInput = scanner.nextInt();
		for (int i = 0; i < numbersToInput; i++) {
			System.out.printf("Number %d: ", i + 1);
			int number = scanner.nextInt();
			
			if (maxNumber < number) {
				maxNumber = number;
			}
			
			if (minNumber > number) {
				minNumber = number;
			}
		}
		
		System.out.println("Min number: " + minNumber);
		System.out.println("Max number: " + maxNumber);
		
		scanner.close();
	}

}
