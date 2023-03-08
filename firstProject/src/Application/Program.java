package Application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String studentName;
		double firstValue, secondValue, avg;
		
		System.out.println("What is your name, my little student? ");
		studentName = sc.nextLine();
		System.out.println("Your student name is: " + studentName);
		System.out.println();
		System.out.println("Thanks! Please type the first value: ");
		firstValue = sc.nextDouble();
		System.out.println("Now, type the second value: ");
		secondValue = sc.nextDouble();
		
		avg = (firstValue + secondValue) / 2;
		
		System.out.printf("The average of the values is: " + avg);

		sc.close();
	}

}