package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double calc;
		
		System.out.print("please, type the current temperature: ");
		double temp = sc.nextDouble();
		
		System.out.println();
		System.out.println("""
                    now, choose the option:\s
                    a) celsius to kelvin
                    b) celsius to fahrenheit
                    c) kelvin to celsius
                    d) kelvin to fahrenheit
                    e) fahrenheit to celsius
                    f) fahrenheit to kelvin""");
		char option = sc.next().charAt(0);
		
		switch (option) {
			case 'a':
				calc = temp + 273.0;
				System.out.printf("result = %.2f%n", calc);
				break;
			case 'b':
				calc = 1.8 * temp + 32.0;
				System.out.printf("result = %.2f%n", calc);
				break;
			case 'c':
				calc = temp - 273.0;
				System.out.printf("result = %.2f%n", calc);
				break;
			case 'd':
				calc = (temp - 273.0) * 1.8 + 32.0;
				System.out.printf("result = %.2f%n", calc);
				break;
			case 'e':
				calc = temp - 32 / 1.8; 
				System.out.printf("result = %.2f%n", calc);
				break;
			case 'f':
				calc = (temp - 32) * 5 / 9 + 273.0;
				System.out.printf("result = %.2f%n", calc);
				break;
			default:
				System.out.printf("out of interval");
				break;
		}
		
		sc.close();

	}

}
