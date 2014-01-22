package operatorsAndExpressions;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.println(isNumberPrime(number));
		scanner.close();
	}

	private static boolean isNumberPrime(int number) {
		boolean isPrime = true;

		if (number % 2 == 0 && number != 2) {
			isPrime = false;
		} else {
			for (int i = 3; i <= Math.sqrt(number); i += 2) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		
		return isPrime;
	}
}
