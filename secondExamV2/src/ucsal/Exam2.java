package ucsal;

import java.util.Locale;
import java.util.Scanner;

public class Exam2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String collaboratorName;
        int count = 0;
        double currentSalary,
                grossSalary,
                increaseSalary,
                valueOfDiscountIr,
                valueOfDiscountInss,
                salaryWithIr,
                salaryWithInss,
                finalSalary,
                gainValue,
                lossValue;
        do {

            System.out.print("Please type the collaborator name: ");
            collaboratorName = sc.next().toUpperCase();

            System.out.print("Now, type your salary: ");
            currentSalary = sc.nextDouble();

            System.out.print("\nCollaborator " + (count + 1) + ": " + collaboratorName);
            System.out.printf("\nCurrent Salary: U$ %.2f%n", currentSalary);

            // increase validation
            if (currentSalary > 15000) {
                increaseSalary = currentSalary * 0.0993;
            }
            else if (currentSalary > 10000) {
                increaseSalary = currentSalary * 0.0875;
            }
            else if (currentSalary > 5000) {
                increaseSalary = currentSalary * 0.0825;
            }
            else if (currentSalary > 4000) {
                increaseSalary = currentSalary * 0.0820;
            }
               else if (currentSalary > 1000) {
                increaseSalary = currentSalary * 0.0380;
            }
            else {
                increaseSalary = 0;
            }

            // increase salary
            System.out.printf("The increase salary equals to: U$ %.2f%n", increaseSalary);

            // gross salary
            grossSalary = currentSalary + increaseSalary;
            System.out.printf("The gross salary after increase: U$ %.2f%n", grossSalary);

            // validation to calculate the ir
            if (grossSalary > 15000) {

                valueOfDiscountIr = grossSalary * 0.30;

                if (valueOfDiscountIr > 5000) {
                    valueOfDiscountIr = 5000;
                }
            } else if (grossSalary > 10000) {

                valueOfDiscountIr = grossSalary * 0.20;

                if (valueOfDiscountIr > 3000) {
                    valueOfDiscountIr = 3000;
                }

            } else if (grossSalary > 5000) {

                valueOfDiscountIr = grossSalary * 0.10;

                if (valueOfDiscountIr > 1000) {
                    valueOfDiscountIr = 1000;
                }

            } else {
                valueOfDiscountIr = 0;
            }

            // value of discount of ir
            System.out.printf("Value of IR: U$ %.2f%n", valueOfDiscountIr);

            salaryWithIr = grossSalary - valueOfDiscountIr;

            // validation to calculate the inss
            if (salaryWithIr > 15000) {

                valueOfDiscountInss = salaryWithIr * 0.12;

                if (valueOfDiscountInss > 5000) {
                    valueOfDiscountInss = 5000;
                }
            } else if (salaryWithIr > 7500) {

                valueOfDiscountInss = salaryWithIr * 0.10;

                if (valueOfDiscountInss > 2500) {
                    valueOfDiscountInss = 2500;
                }
            } else if (salaryWithIr > 3750) {

                valueOfDiscountInss = salaryWithIr * 0.09;

                if (valueOfDiscountInss > 3750) {
                    valueOfDiscountInss = 3750;
                }
            } else {

                valueOfDiscountInss = salaryWithIr * 0.05;

                if (valueOfDiscountInss > 250) {
                    valueOfDiscountInss = 250;
                }
            }

            // value of discount of inss
            System.out.printf("Value of discount of INSS: U$ %.2f%n", valueOfDiscountInss);

            // salary calculated after deductions
            salaryWithInss = salaryWithIr - valueOfDiscountInss;
            System.out.printf("Salary calculated after deductions: U$ %.2f%n", salaryWithInss);

            // final salary
            finalSalary = salaryWithInss + 1000;
            System.out.printf("Final salary of the collaborator: U$ %.2f%n", finalSalary);

            // gain / loss / nothing changed
            if (currentSalary > finalSalary){
                lossValue = currentSalary - finalSalary;
                System.out.printf("Loss of U$ %.2f%n", lossValue);
            } else if (currentSalary < finalSalary) {
                gainValue = finalSalary - currentSalary;
                System.out.printf("Gain of U$ %.2f%n", gainValue);
            } else {
                System.out.println("Nothing changed");
            }

            count++;
            System.out.println();

        } while (count < 4);

        System.out.println("Final of execution");

    }
}