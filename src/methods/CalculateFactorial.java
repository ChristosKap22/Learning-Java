package methods;

import java.math.BigInteger;
import java.util.Scanner;

public class CalculateFactorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input number: ");
		int number = scanner.nextInt();
		
		BigInteger factorial = calculateFactorial(number);
		System.out.printf("%s! = %s", number, factorial);
		
		scanner.close();
	}
	
	public static BigInteger calculateFactorial(int number) {
		BigInteger factorial = BigInteger.valueOf(1);
		
		for (int i = 2; i <= number; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		
		return factorial;
	}

}
