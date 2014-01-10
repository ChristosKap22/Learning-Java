package loops;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Decimal number: ");
		int decimalNumber = scanner.nextInt();
		
		System.out.println(Integer.toBinaryString(decimalNumber)); // System convert
		System.out.println(convertToBinaryString(decimalNumber)); // My convert
		
		scanner.close();
	}
	
	public static String convertToBinaryString(int decimalNumber) {
		if (decimalNumber == 0) {
			return "0";
		}
		
		StringBuilder binaryStringBuilder = new StringBuilder();
		while (decimalNumber != 0) {
			int reminder = decimalNumber % 2;
			binaryStringBuilder.append(reminder);
			
			decimalNumber /= 2;
		} 
		
		return binaryStringBuilder.reverse().toString();
	}

}
