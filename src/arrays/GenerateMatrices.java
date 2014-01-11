package arrays;

import java.util.Scanner;

public class GenerateMatrices {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("rows = cols = ");
		int rowsAndCols = scanner.nextInt();

		scanner.close();

		int[][] matrixA = generateMatrixA(rowsAndCols);
		printMatrix(matrixA);

		System.out.println();

		int[][] matrixB = generateMatrixB(rowsAndCols);
		printMatrix(matrixB);
		
		System.out.println();
		
		int[][] matrixC = generateMatrixC(rowsAndCols);
		printMatrix(matrixC);
		
		System.out.println();
		
		int[][] matrixD = generateMatrixD(rowsAndCols);
		printMatrix(matrixD);

	}

	private static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.printf("%-5d", matrix[row][col]);
			}

			System.out.println();
		}
	}

	private static int[][] generateMatrixA(int rowsAndCols) {
		int[][] matrix = new int[rowsAndCols][rowsAndCols];
		int cellValue = 1;
		for (int col = 0; col < matrix.length; col++) {
			for (int row = 0; row < matrix[col].length; row++) {
				matrix[row][col] = cellValue;
				cellValue++;
			}
		}

		return matrix;
	}

	private static int[][] generateMatrixB(int rowsAndCols) {
		int[][] matrix = new int[rowsAndCols][rowsAndCols];
		int cellValue = 1;
		for (int col = 0; col < matrix.length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < matrix[col].length; row++) {
					matrix[row][col] = cellValue;
					cellValue++;
				}
			} else {
				for (int row = matrix[col].length - 1; row >= 0; row--) {
					matrix[row][col] = cellValue;
					cellValue++;
				}
			}
		}

		return matrix;
	}

	private static int[][] generateMatrixC(int rowsAndCols) {
		int[][] matrix = new int[rowsAndCols][rowsAndCols];
		int cellValue = 1;

		// Generates all under the main diagonal + the main diagonal
		for (int i = 0; i < rowsAndCols; i++) {
			int row = rowsAndCols - i - 1;
			int col = 0;

			while (row <= rowsAndCols - 1) {
				matrix[row][col] = cellValue;
				cellValue++;
				row++;
				col++;
			}
		}

		// Generates all above the main diagonal without the main diagonal
		for (int i = 0; i < rowsAndCols - 1; i++) {
			int row = 0;
			int col = i + 1;

			while (col <= rowsAndCols - 1) {
				matrix[row][col] = cellValue;
				cellValue++;
				row++;
				col++;
			}
		}

		return matrix;
	}

	private static int[][] generateMatrixD(int rowsAndCols) {
		int[][] matrix = new int[rowsAndCols][rowsAndCols];
		int cellValue = 1;
        int minRow = 0;
        int maxRow = rowsAndCols - 1;
        int minCol = 0;
        int maxCol = rowsAndCols - 1;

        while (cellValue <= rowsAndCols * rowsAndCols)
        {
            for (int row = minRow; row <= maxRow; row++) // go down
            {
                matrix[row][minCol] = cellValue;
                cellValue++;
            }

            minCol++;

            for (int col = minCol; col <= maxCol; col++) // go right
            {
                matrix[maxRow][col] = cellValue;
                cellValue++;
            }

            maxRow--;

            for (int row = maxRow; row >= minRow; row--) // go up
            {
                matrix[row][maxCol] = cellValue;
                cellValue++;
            }

            maxCol--;

            for (int col = maxCol; col >= minCol; col--) // go left
            {
                matrix[minRow][col] = cellValue;
                cellValue++;
            }

            minRow++;
        }
        
        return matrix;
	}
	
}
