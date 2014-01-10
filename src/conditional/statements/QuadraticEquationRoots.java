package conditional.statements;

import java.util.Locale;
import java.util.Scanner;

public class QuadraticEquationRoots {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		System.out.println("ax^2 + bx + x = 0");

		Scanner scanner = new Scanner(System.in);

		System.out.print("a = ");
		double a = scanner.nextDouble();

		System.out.print("b = ");
		double b = scanner.nextDouble();

		System.out.print("c = ");
		double c = scanner.nextDouble();

		if (a != 0) {
			double D = b * b - 4 * a * c;

			if (D > 0) {
				double x1 = ((-b) + Math.sqrt(D)) / (2 * a);
				double x2 = ((-b) - Math.sqrt(D)) / (2 * a);

				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			} else if (D == 0) {
				double x1 = (-b) / (2 * a);

				System.out.println("x1 = x2 = " + x1);
			} else if (D < 0) {
				System.out.println("No real roots exist!");
			}
		}

		else if (a == 0) {
			if (b != 0) {
				double x = (-c) / b;
				System.out.println(x);
			} else if (b == 0 && c != 0) {
				System.out.println("No real roots exist!");
			}
		}

		if (a == 0 && b == 0 && c == 0) {
			System.out.println("Every single \"x\" is a root");
		}

		scanner.close();
	}

}
