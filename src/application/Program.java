package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x = new Triangle();
		Triangle y = new Triangle();

		System.out.println("Enter the measures of triagle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		double areaX = x.calculateArea();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double areaY = y.calculateArea();
		System.out.printf("Triangle X area: %.2f%n", areaX);
		System.out.printf("Triangle Y area: %.2f%n", areaY);
		if (areaX > areaY) {
			System.out.println("Large area: X");
		} else {
			System.out.println("Large area Y");
		}
		sc.close();

	}

}
