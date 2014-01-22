package consoleInputOutput;

import java.util.Scanner;

public class GreatesNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int maxNumber = Integer.MIN_VALUE;
		int numbersCount = 5;
		
		for (int i = 0; i < numbersCount; i++) {
			System.out.printf("Number %d: ", i + 1);
			int number = scanner.nextInt();
			
			if (maxNumber < number) {
				maxNumber = number;
			}
		}
		
		System.out.println("Max number: " + maxNumber);
		
		scanner.close();
	}

}
