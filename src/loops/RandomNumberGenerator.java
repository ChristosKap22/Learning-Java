package loops;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		System.out.println("A random number will be generated in range [0, X]");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("X = ");
		int rangeRightBorder = scanner.nextInt();
		
		Random randomNumberGenerator = new Random();
		int randomNumber = randomNumberGenerator.nextInt(rangeRightBorder + 1);
		System.out.println(randomNumber);
		
		scanner.close();
	}

}
