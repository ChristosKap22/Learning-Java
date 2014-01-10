package operators.and.expressions;

public class DifferentOperationsWithNumber {

	public static void main(String[] args) {
		int number = 12345;
		
		System.out.println(getSumOfDigits(number));
		System.out.println(reverseNumber(number));
		System.out.println(swapFirstAndLastDigits(number));
	}
	
	private static int getSumOfDigits(int number) {
		int sum = 0;
		
		while (number != 0) {
			int lastDigit = number % 10;
			sum += lastDigit;
			number = number / 10;
		}
		
		return sum;
	}
	
	private static int reverseNumber(int number) {
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
	
	private static int swapFirstAndLastDigits(int number) {
		int copyOfNumber = number;
		int digitsCount = 0;
		
		while (copyOfNumber != 0) {
			copyOfNumber = copyOfNumber / 10;
			digitsCount++;
		}
		
		int lastDigit = number % 10;
		int firstDigit = 0;
		copyOfNumber = number;
		for (int i = 0; i < digitsCount; i++) {
			if (i == digitsCount - 1) {
				firstDigit = copyOfNumber % 10;
			}
			
			copyOfNumber = copyOfNumber / 10;
		}
		
		int resultNumber = 0;
		resultNumber += lastDigit * Math.pow(10, digitsCount - 1);
		resultNumber += firstDigit;
		
		number = number / 10;
		for (int i = 1; i < digitsCount - 1; i++) {
			int lastDigitOfNumber = number % 10;
			resultNumber += lastDigitOfNumber * Math.pow(10, i);
			
			number = number / 10;
		}
		
		return resultNumber;
	}
}
