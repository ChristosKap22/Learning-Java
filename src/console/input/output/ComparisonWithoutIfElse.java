package console.input.output;

import java.util.Scanner;

public class ComparisonWithoutIfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("First number: ");
		int firstNumber = scanner.nextInt();
		
		System.out.print("Second number: ");
		int secondNumber = scanner.nextInt();
		
		int greaterNumber = (firstNumber + secondNumber + Math.abs(firstNumber - secondNumber)) / 2;
		System.out.println("Greater: " + greaterNumber);
		
		int smallerNumber = (firstNumber + secondNumber - Math.abs(firstNumber - secondNumber)) / 2;
		System.out.println("Smaller: " + smallerNumber);
		
		scanner.close();
	}

}
