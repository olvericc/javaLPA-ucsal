import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final String ERROR = "out of interval";
        double value1, value2, calc;
        int operation;

        System.out.println("please, type two values: ");
        value1 = sc.nextDouble();
        value2 = sc.nextDouble();

        if (value1 >= 1.0 && value1 <= 10.0 && value2 >= 1.0 && value2 <= 10.0) {
            System.out.println("""
                    now, choose the operator:\s
                     1) addition
                     2) subtraction
                     3) division
                     4) multiplication""");
            operation = sc.nextInt();
            switch (operation) {
                case 1 -> {
                    calc = value1 + value2;
                    System.out.printf("result = %.2f%n", calc);
                }
                case 2 -> {
                    calc = value1 - value2;
                    System.out.printf("result = %.2f%n", calc);
                }
                case 3 -> {
                    calc = value1 / value2;
                    System.out.printf("result = %.2f%n", calc);
                }
                case 4 -> {
                    calc = value1 * value2;
                    System.out.printf("result = %.2f%n", calc);
                }
                default -> System.out.println(ERROR);
            }
        }
        else {
            System.out.println(ERROR);
        }
        sc.close();

    }
}