package loops;

import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Decimal number: ");
		int decimalNumber = scanner.nextInt();
		
		System.out.println(Integer.toHexString(decimalNumber));
		System.out.println(convertToHexadecimalString(decimalNumber));
		
		scanner.close();
	}
	
	private static String convertToHexadecimalString(int decimalNumber) {
		if (decimalNumber == 0) {
			return "0";
		}
		
		char[] alphabet = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		StringBuilder binaryStringBuilder = new StringBuilder();
		
		while (decimalNumber != 0) {
			int reminder = decimalNumber % 16;
			binaryStringBuilder.append(alphabet[reminder]);
			
			decimalNumber /= 16;
		} 
		
		return binaryStringBuilder.reverse().toString();
	}

}
