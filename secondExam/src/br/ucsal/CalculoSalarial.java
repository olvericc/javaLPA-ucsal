package br.ucsal;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSalarial {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String colaboratorName;
		double grossSalary, increaseSalary, finalSalary,
			updatedSalary, incomeTaxDiscount, inssDiscount;
		
		int count = 0;
		
		do {
			count++;
			System.out.println("please, type the name of a colaborator: ");
			colaboratorName = sc.next();
			
			System.out.println("now, type the salary of a colaborator");
			grossSalary = sc.nextDouble();
			
			System.out.println();
			System.out.println("Colaborator: " + colaboratorName);
			System.out.printf("Current salary: U$ %.2f%n", grossSalary);
			
			if (grossSalary > 15000) {
				increaseSalary = grossSalary * 0.0993;
			} else if (grossSalary > 10000) {
				increaseSalary = grossSalary * 0.0875;
			} else if (grossSalary > 5000) {
				increaseSalary = grossSalary * 0.0825;
			} else if (grossSalary > 4000) {
				increaseSalary = grossSalary * 0.0820;
			} else {
				increaseSalary = grossSalary * 0.0038;
			}
			System.out.printf("Value of increase: U$ %.2f%n", increaseSalary);
			
			updatedSalary = increaseSalary + grossSalary;			
			System.out.printf("Gross salary after increase: U$ %.2f%n", updatedSalary);
			
			if (updatedSalary > 15000) {
				incomeTaxDiscount = updatedSalary - 0.30;
				if (incomeTaxDiscount > 5000) {
					incomeTaxDiscount = 5000;
				} else {
					incomeTaxDiscount = incomeTaxDiscount = 
				}
			} else if (grossSalary > 10000) {
				incomeTaxDiscount = updatedSalary - 0.20; 
				if (incomeTaxDiscount > 3000) {
					incomeTaxDiscount = 3000;
				} else {
					incomeTaxDiscount = grossSalary - 3000;
				}
			} else if (grossSalary > 5000) {
				incomeTaxDiscount = updatedSalary - 0.10;
				if (incomeTaxDiscount > 1000) {
					incomeTaxDiscount = 1000;
				} else {
					incomeTaxDiscount = grossSalary - 1000;
				}
			} else {
				incomeTaxDiscount = 0;
			}
			
			System.out.printf("Income tax discount: U$ %.2f%n", incomeTaxDiscount);
			
			
			//System.out.printf("INSS discount: U$ %.2f%n", inssDiscount);
			
		} 
		
		while (count < 4);
		
	}

}
