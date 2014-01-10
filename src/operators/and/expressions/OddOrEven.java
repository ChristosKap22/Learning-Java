package operators.and.expressions;

public class OddOrEven {

	public static void main(String[] args) {
		int oddNumber = 5;
		int evenNumber = 8;
		
		System.out.println(isNumberEven(oddNumber));
		System.out.println(isNumberEven(evenNumber));
	}

	public static boolean isNumberEven(int number) {
		return number % 2 == 0;
	}
}
