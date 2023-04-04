package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int value1, value2, count = 0;
		boolean verification = false;
		
		do {
			
			if (verification == true) {
				count++;
				System.out.println("try again!");
				System.out.println("you missed " + count 
						+ (count == 1 ? " time" : " times"));
			}
			verification = true;
			
		System.out.println("please, type two values: ");
		
		value1 = sc.nextInt();
		value2 = sc.nextInt();
		
		} while(value1 < 0 || value1 > 10 || value2 < 0 || value2 > 10);
			System.out.println("continue the execution...");
			
		sc.close();
	}

}
