package conditional.statements;

import java.util.Scanner;

public class SignOfProduct {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("First number: ");
		int firstNumber = scanner.nextInt();
		
		System.out.print("Second number: ");
		int secondNumber = scanner.nextInt();
		
		System.out.println("Positive sign: " + isSignOfProductPositive(firstNumber, secondNumber));
		
		scanner.close();
	}
	
	private static boolean isSignOfProductPositive(int firstNumber, int secondNumber) {
		boolean isPositive = true;
		
		if ((firstNumber > 0 && secondNumber < 0) ||
				(firstNumber < 0 && secondNumber > 0)) {
			isPositive = false;
		}
		
		return isPositive;
	}

}
