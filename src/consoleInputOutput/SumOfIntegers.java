package consoleInputOutput;

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int numbersCount = 5;
		
		for (int i = 0; i < numbersCount; i++) {
			System.out.printf("Number %d: ", i + 1);
			sum += scanner.nextInt();
		}
		
		System.out.println("Sum: " + sum);
		
		scanner.close();
	}

}
