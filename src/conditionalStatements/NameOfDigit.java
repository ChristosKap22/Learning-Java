package conditionalStatements;

import java.util.Scanner;

public class NameOfDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a digit: ");
		byte digit = scanner.nextByte();
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
		
		System.out.println(nameOfDigit);
		
		scanner.close();
	}

}
