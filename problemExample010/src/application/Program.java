package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final String ERROR = "Error!";
		
		System.out.print("type the first value: ");
		int a = sc.nextInt();
		System.out.print ("type the second value: ");
		int b = sc.nextInt();
		
		System.out.println("choose the operation: ");
		
		System.out.println("1 - sum");
		System.out.println("2 - mult");
		System.out.println("3 - div");
		System.out.println("4 - sub");
		
		int op = sc.nextInt();
		
		switch (op) {
			case 1 -> {
				System.out.println(sum(a, b, op));
				break;	
			}
			case 2 -> {
				System.out.println(mult(a, b, op));
				break;
			}
			case 3 -> {
				System.out.println(div(a, b, op));
				break;	
			}
			case 4 -> {
				System.out.println(sub(a, b, op));
				break;	
			}
			default -> System.out.println(ERROR);
		}
		sc.close();
	}

	public static String sum(int value1, int value2, int op) {
		int total = value1 + value2;
		return "total: " + total;
	}
	
	public static String mult(double value1, double value2, int op) {
		int total = (int) (value1 * value2);
		return "total: " + total;
	}
	
	public static String div(double value1, double value2, int op) {
		int total = (int) (value1 / value2);
		return "total: " + total;
	}
	
	public static String sub(double value1, double value2, int op) {
		int total = (int) (value1 - value2);
		return "total: " + total;
	}
}
