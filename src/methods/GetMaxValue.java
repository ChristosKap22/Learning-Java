package methods;

import java.util.Scanner;

public class GetMaxValue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("First number: ");
		int firstNumber = scanner.nextInt();
		
		System.out.print("Second number: ");
		int secondNumber = scanner.nextInt();
		
		System.out.print("Third number: ");
		int thirdNumber = scanner.nextInt();
		
		System.out.println("Max number: " + getMax(firstNumber, secondNumber, thirdNumber));
		
		scanner.close();
	}
	
	public static int getMax(int firstNumber, int secondNumber) {
		if (firstNumber < secondNumber) {
			return secondNumber;
		} else {
			return firstNumber;
		}
	}
	
	public static int getMax(int firstNumber, int secondNumber, int thirdNumber) {
		return getMax(getMax(firstNumber, secondNumber), thirdNumber);
	}

}
