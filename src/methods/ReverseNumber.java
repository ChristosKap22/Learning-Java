package methods;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input number: ");
		int number = scanner.nextInt();
		
		int reversedNumber = reverseNumber(number);
		System.out.println("Reversed number: " + reversedNumber);
		
		scanner.close();
	}
	
	public static int reverseNumber(int number) {
		int copyOfNumber = number;
		int digitsCount = 0;
		
		while (copyOfNumber != 0) {
			copyOfNumber = copyOfNumber / 10;
			digitsCount++;
		}
		
		int reversedNumber = 0;
		for (int i = 0; i < digitsCount; i++) {
			int lastDigitOfNumber = number % 10;
			reversedNumber += lastDigitOfNumber * Math.pow(10, digitsCount - i - 1);
			
			number = number / 10;
		}
		
		return reversedNumber;
	}

}
