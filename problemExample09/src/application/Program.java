package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("type a number: ");
		
		int number, count = 0;
		
		for (int i = 0; i <= 4; i++) {
			number = sc.nextInt();
			if (number % 2 == 0) {
				count++;
			}
			
		}
		sc.close();
		System.out.println("total of pair numbers: " + count);

	}

}
