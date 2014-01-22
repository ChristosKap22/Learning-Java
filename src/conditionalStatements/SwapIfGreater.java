package conditionalStatements;

import java.util.Scanner;

public class SwapIfGreater {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Swaps the numbers if the first one is greater than the second one
		System.out.print("First number: ");
		int firstNumber = scanner.nextInt();
		
		System.out.print("Second number: ");
		int secondNumber = scanner.nextInt();
		
		if (firstNumber > secondNumber) {
			int bridge = firstNumber;
			firstNumber = secondNumber;
			secondNumber = bridge;
			
			System.out.println("The numbers were swapped");
		}
		
		System.out.println("First number: " + firstNumber);
		System.out.println("Second number: " + secondNumber);
		
		scanner.close();
	}

}
