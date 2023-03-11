package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double firstValue, secondValue,thirdValue, avg;
	
		System.out.print("Please type the first value: ");
		firstValue = sc.nextDouble();
		if (firstValue >= 0 && firstValue <= 10) {
			System.out.print("Type the second value: ");
			secondValue = sc.nextDouble();
			if (secondValue >= 0 && secondValue <= 10) {
				System.out.print("Type the third value: ");
				thirdValue = sc.nextDouble();
				if (thirdValue >= 0 && thirdValue <= 10) {
					avg = (firstValue + secondValue + thirdValue) / 3;
					System.out.println("Your average is: " + avg);
				} else {
					System.out.print("out of interval");
				}
			}
			else {
				System.out.print("out of interval");
			}
		} 
		else {
			System.out.print("out of interval");
		}
		System.out.println("Try again!");
		sc.close();

	}

}
