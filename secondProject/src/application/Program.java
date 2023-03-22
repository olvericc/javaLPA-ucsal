package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main (String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double a, b;
		double avg;
		final double WEIGHT_1 = 3.0, WEIGHT_2 = 7.0;
		final String ERROR = "ERROR";
		
		System.out.printf("type two values: ");
		System.out.println();
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		if (a >= 0 && a <= 10 && b >= 0 && b <= 10) {
			System.out.println("validated");
			
			avg = (a*WEIGHT_1 + b*WEIGHT_2) / (WEIGHT_1 + WEIGHT_2);
			
			System.out.printf("the average equals to: %.2f", avg);
			System.out.println();
			
			if (avg <= 3.0) {
				System.out.println("not approved");
			} 
			else if (avg > 3.0 && avg < 6.0) {
				System.out.println("last test");
			} 
			else if (avg == 6.0) {
				System.out.println(ERROR);
			}
			else {
				System.out.println("approved");
			}
		} 
		else {
			System.out.println("invalidated");
		}
		
		sc.close();
	}
}
