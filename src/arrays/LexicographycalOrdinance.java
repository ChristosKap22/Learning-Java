package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LexicographycalOrdinance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("First char array length = ");
		int firstCharArrayLength = scanner.nextInt();
		char[] firstCharArray = new char[firstCharArrayLength];
		for (int i = 0; i < firstCharArray.length; i++) {
			System.out.printf("firstCharArray[%d] = ", i);
			firstCharArray[i] = scanner.next().charAt(0);
		}
		
		System.out.print("Second char array length = ");
		int secondCharArrayLength = scanner.nextInt();
		char[] secondCharArray = new char[secondCharArrayLength];
		for (int i = 0; i < secondCharArray.length; i++) {
			System.out.printf("secondCharArray[%d] = ", i);
			secondCharArray[i] = scanner.next().charAt(0);
		}
		
		char[] firstInLexicographycalOrdinance =
				getFirstArrayInLexicographycalOrdinance(firstCharArray, secondCharArray);
		
		System.out.print("First in lexicographycal ordinance: ");
		System.out.println(Arrays.toString(firstInLexicographycalOrdinance));
		
		scanner.close();
	}
	
	private static char[] getFirstArrayInLexicographycalOrdinance(char[] firstArray, char[] secondArray) {
		char[] result = firstArray;
		
		int minLength = Math.min(firstArray.length, secondArray.length);
		for (int i = 0; i < minLength; i++) {
			if (firstArray[i] < secondArray[i]) {
				result =  firstArray;
			} else if (firstArray[i] > secondArray[i]) {
				result =  secondArray;
			}
		}
		
		return result;
	}

}
