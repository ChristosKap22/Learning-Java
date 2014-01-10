package loops;

import java.util.Scanner;

public class GenerateMatrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Rows: ");
		int rows = scanner.nextInt();
		
		System.out.print("Cols: ");
		int cols = scanner.nextInt();
		
		int[][] matrix = generateMatrix(rows, cols);
		
		printMatrix(matrix);
		
		scanner.close();
	}
	
	private static int[][] generateMatrix(int rows, int cols) {
		int[][] matrix = new int[rows][cols];
		int cellValue = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = cellValue;
				cellValue++;
			}
		}
		
		return matrix;
	}
	
	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%-5d", matrix[i][j]);
			}
			
			System.out.println();
		}
	}

}
