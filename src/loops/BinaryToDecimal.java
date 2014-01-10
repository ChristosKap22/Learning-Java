package loops;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Binary string: ");
		String binaryString = scanner.nextLine();
		int decimalNumber = convertToDecimalNumber(binaryString);

		System.out.println(decimalNumber);

		scanner.close();
	}

	private static int convertToDecimalNumber(String binaryString) {
		int decimalNumber = 0;

		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) == '1') {
				decimalNumber += Math.pow(2, binaryString.length() - i - 1);
			}
		}

		return decimalNumber;
	}

}
