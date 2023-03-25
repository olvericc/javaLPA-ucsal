package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double value1, value2, value3;
		
		System.out.println("please type the first value: ");
		value1 = sc.nextDouble();
		System.out.println("please type the second value: ");
		value2 = sc.nextDouble();
		System.out.println("please type the third value: ");
		value3 = sc.nextDouble();
		
		if (value1 == value2 && value2 == value3 && value3 == value1) {
			System.out.println("equilateral triangle");
		} else if (value1 != value2 && value2 != value3 && value3 != value1) {
			System.out.println("scalene triangle");
		} else {
			System.out.println("isosceles triangle");
		}
		
		sc.close();

	}

}
