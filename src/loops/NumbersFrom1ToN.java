package loops;

import java.util.Scanner;

public class NumbersFrom1ToN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("N = ");
		int lastNumber = scanner.nextInt();
		for (int i = 1; i <= lastNumber; i++) {
			System.out.println(i);
		}
		
		scanner.close();
	}

}
