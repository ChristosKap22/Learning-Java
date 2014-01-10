package loops;

import java.util.Scanner;

public class FactorialLastTrailingZeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("N = ");
		int number = scanner.nextInt(); // number = N; I will calculate how many trailing zeros N! has
		int trailingZerosCount = countTralingZerosOfTheFactorialOfANumber(number);
		
		System.out.println("Traling zeros count: " + trailingZerosCount);
		
		scanner.close();
	}
	
	private static int countTralingZerosOfTheFactorialOfANumber(int number) {
		int denominator = 5;
		if (number > denominator) {
			while (number % denominator != 0) {
				number--;
			}
			
			int trailingZeros = 0;
			while (number / denominator != 0) {
				trailingZeros += number / denominator;
				denominator *= 5;
			}
			
			return trailingZeros;
		} else {
			return 0;
		}
	}

}
