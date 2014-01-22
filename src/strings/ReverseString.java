package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input a string: ");
		String str = scanner.nextLine();
		
		String reversedStr = new StringBuilder(str).reverse().toString();
		
		System.out.println("Reversed: " + reversedStr);
		
		scanner.close();
	}

}
