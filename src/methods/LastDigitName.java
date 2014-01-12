package methods;

import java.util.Scanner;

public class LastDigitName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input number: ");
		int number = scanner.nextInt();
		
		System.out.println("Last digit name: " + getNameOfLastDigit(number));
		
		scanner.close();
	}
	
	public static String getNameOfLastDigit(int number) {
		int lastDigit = 0;
		
		if (number >= 0) {
			lastDigit = number % 10;
		} else {
			lastDigit = -(number % 10);
		}
		
		return getDigitName(lastDigit);
	}
	
	public static String getDigitName(int digit) {
		String nameOfDigit = "";
		
		switch (digit) {
		case 0: 
			nameOfDigit = "Zero";
			break;
		case 1: 
			nameOfDigit = "One";
			break;
		case 2: 
			nameOfDigit = "Two";
			break;
		case 3: 
			nameOfDigit = "Three";
			break;
		case 4: 
			nameOfDigit = "Four";
			break;
		case 5: 
			nameOfDigit = "Five";
			break;
		case 6: 
			nameOfDigit = "Six";
			break;
		case 7: 
			nameOfDigit = "Seven";
			break;
		case 8: 
			nameOfDigit = "Eight";
			break;
		case 9: 
			nameOfDigit = "Nine";
			break;
			
		default:
			nameOfDigit = "The number is not a digit";
			break;
		}
		
		return nameOfDigit;
	}

}
