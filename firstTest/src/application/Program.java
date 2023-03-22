package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int value1, value2, sum;
		
		System.out.println("type the first value: ");
		value1 = sc.nextInt();
		System.out.println("type the second value: ");
		value2 = sc.nextInt();
		
		sum = value1 + value2;
		
		System.out.println("your sum is: " + sum);
		
		sc.close();
	}

}
