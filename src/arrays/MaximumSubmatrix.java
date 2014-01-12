package arrays;

import java.util.Random;
import java.util.Scanner;

public class MaximumSubmatrix {

	public static void main(String[] args) {
		int matrixRows = 5;
		int matrixCols = 5;
		int cellMinValue = 1;
		int cellMaxValue = 50;
		int[][] matrix = generateRandomMatrix(matrixRows, matrixCols, cellMinValue, cellMaxValue);
		
		printMatrix(matrix);
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Submatrix rows = ");
		int submatrixRows = scanner.nextInt();
		
		System.out.print("Submatrix cols = ");
		int submatrixCols = scanner.nextInt();
		
		scanner.close();
		
		int[][] maxSubmatrix = findMaxSubmatrix(matrix, submatrixRows, submatrixCols);
		System.out.println("Max submatrix:");
		printMatrix(maxSubmatrix);
	}
	
	private static int[][] generateRandomMatrix(int rows, int cols, int cellMinValue, int cellMaxValue) {
		int[][] matrix = new int[rows][cols];
		Random random = new Random();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(cellMaxValue - cellMinValue + 1) + cellMinValue;
			}
		}
		
		return matrix;
	}
	
	private static int[][] findMaxSubmatrix(int[][] matrix, int submatrixRows, int submatrixCols) {
		int[][] submatrix = new int[submatrixRows][submatrixCols];
		
		int maxSum = Integer.MIN_VALUE;
		
		for (int row = 0; row < matrix.length - submatrixRows; row++) {
			for (int col = 0; col < matrix[row].length - submatrixCols; col++) {
				int currentSum = 0;
				int[][] currentSubMatrix = new int[submatrixRows][submatrixCols];
				
				// Traverse the submatrix platform
				for (int i = row; i < submatrixRows + row; i++) {
					for (int j = col; j < submatrixCols + col; j++) {
						currentSum += matrix[i][j];
						currentSubMatrix[i - row][j - col] = matrix[i][j];
					}
				}
				
				if (maxSum < currentSum) {
					maxSum = currentSum;
					submatrix = currentSubMatrix.clone();
				}
			}
		}
		
		return submatrix;
	}
	
	private static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.printf("%-5d", matrix[row][col]);
			}

			System.out.println();
		}
	}

}
