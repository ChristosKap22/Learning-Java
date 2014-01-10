package loops;

import java.util.Arrays;
import java.util.Scanner;

public class HexadecmialToDecimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Hex string: ");
		String hexString = scanner.nextLine();
		int decimalNumber = convertToDecimalNumber(hexString);

		System.out.println(decimalNumber);

		scanner.close();
	}

	private static int convertToDecimalNumber(String hexString) {
		char[] alphabet = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		
		int decimalNumber = 0;

		for (int i = 0; i < hexString.length(); i++) {
			char currentChar = Character.toUpperCase(hexString.charAt(i));
			int index = Arrays.binarySearch(alphabet, currentChar);
			
			decimalNumber += index * Math.pow(16, hexString.length() - i - 1);
		}

		return decimalNumber;
	}

}
