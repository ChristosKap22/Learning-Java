package consoleInputOutput;

import java.util.Scanner;

public class ReadNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		int thirdNumber = scanner.nextInt();
		
		int sum = firstNumber + secondNumber + thirdNumber;
		System.out.println(sum);
		
		scanner.close();
	}

}
