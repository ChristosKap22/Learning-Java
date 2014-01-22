package consoleInputOutput;

import java.util.Locale;
import java.util.Scanner;

public class CircleAreaAndPerimeter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		double circleRadius = scanner.nextDouble();
		
		System.out.println("Area: " + getAreaOfCircle(circleRadius));
		System.out.println("Perimeter: " + getPerimeterOfCircle(circleRadius));
		
		scanner.close();
	}

	private static double getAreaOfCircle(double radius) {
		return Math.PI * radius * radius;
	}
	
	private static double getPerimeterOfCircle(double radius) {
		return Math.PI * radius * 2;
	}
}
