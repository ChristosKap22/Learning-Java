package operatorsAndExpressions;

public class CheckThirdBit {

	public static void main(String[] args) {
		int firstNumber = 5; // 0101 in binary
		int secondNumber = 8; // 1000 in binary
		
		System.out.println(getThirdBit(firstNumber));
		System.out.println(getThirdBit(secondNumber));
	}

	private static int getThirdBit(int number) {
		return (number >> 3) & 1;
	}
}
