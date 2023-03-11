package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final String Error = "Out of interval";
		
		double firstValue, secondValue,thirdValue, avg;
	
		System.out.print("Please type the first value: ");
		firstValue = sc.nextDouble();
		// testing the first value
		if (firstValue >= 0 && firstValue <= 10) {
			System.out.print("Type the second value: ");
			secondValue = sc.nextDouble();
			
			// testing the second value
			if (secondValue >= 0 && secondValue <= 10) {
				System.out.print("Type the third value: ");
				thirdValue = sc.nextDouble();
				
				// testing the third value
				if (thirdValue >= 0 && thirdValue <= 10) {
					avg = (firstValue + secondValue + thirdValue) / 3;
					
					// testing the average -> approved or not approved
					if (avg >= 6) {
						System.out.println("approved");
					}
					else {
						System.out.println("not approved");
					}
					System.out.println("Your average is: " + avg);
				} // if 3
				else {
					System.out.println(Error);
				}
			} // if 2
			else {
				System.out.println(Error);
			}
		} // if 1
		else {
			System.out.println(Error);
		}

		sc.close();

	}

}
