package loops;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class GenerateFibonacci {

	public static void main(String[] args) {
		int rowLength = 50;
		List<BigInteger> fibonacciRow = generateFibonacciRow(rowLength);
		
		// Print the row
		for (int i = 0; i < fibonacciRow.size(); i++) {
			System.out.println(fibonacciRow.get(i));
		}
	}
	
	private static List<BigInteger> generateFibonacciRow(int rowLength) {
		List<BigInteger> fibonacciRow = new ArrayList<BigInteger>();
		
		int firstNumber = 0;
		int secondNumber = 1;
		
		fibonacciRow.add(BigInteger.valueOf(firstNumber));
		fibonacciRow.add(BigInteger.valueOf(secondNumber));
		
		for (int i = 2; i < rowLength; i++) {
			BigInteger nextNumber = fibonacciRow.get(i - 1).add(fibonacciRow.get(i - 2));
			fibonacciRow.add(nextNumber);
		}
		
		return fibonacciRow;
	}

}
