package conditionalStatements;

public class GreatestOfFiveNumbers {

	public static void main(String[] args) {
		int[] numbers = { 1, 5, 2, 4, 3 };
		
		System.out.println(findGreatestNumber(numbers));
	}
	
	private static int findGreatestNumber(int[] numbers) {
		int greatest = Integer.MIN_VALUE;
		
		for (int i = 0; i < numbers.length; i++) {
			if (greatest < numbers[i]) {
				greatest = numbers[i];
			}
		}
		
		return greatest;
	}
}
