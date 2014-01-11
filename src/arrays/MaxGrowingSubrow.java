package arrays;

import java.util.Arrays;

public class MaxGrowingSubrow {

	public static void main(String[] args) {
		int[] array = { 3, 2, 3, 4, 2, 2, 4, 6, 7 };

		int[] maxGrowingSubrow = findMaxGrowingSubrow(array);
		System.out.println(Arrays.toString(maxGrowingSubrow));
	}

	private static int[] findMaxGrowingSubrow(int[] array) {
		if (array == null) {
			throw new NullPointerException("The array is null");
		}

		if (array.length == 0) {
			return array;
		}

		int previousNumber = array[0];
		int subrowEndIndex = 0;
		int subrowMaxLength = 1;
		int currentSubrowLength = 1;

		for (int i = 1; i < array.length; i++) {
			if (array[i] > previousNumber) {
				currentSubrowLength++;

				if (subrowMaxLength < currentSubrowLength) {
					subrowMaxLength = currentSubrowLength;
					subrowEndIndex = i;
				}
			} else {
				currentSubrowLength = 1;
			}

			previousNumber = array[i];
		}

		int[] subrow = new int[subrowMaxLength];
		for (int i = 0; i < subrow.length; i++) {
			int indexOfConsecutiveNumber = subrowEndIndex - subrowMaxLength + 1 + i;
			subrow[i] = array[indexOfConsecutiveNumber];
		}

		return subrow;
	}

}
