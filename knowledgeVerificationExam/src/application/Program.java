package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double var1, var2;
        double calc;
        String resp;

        System.out.print("type the first value: ");
        var1 = sc.nextDouble();
        System.out.print("type the second value: ");
        var2 = sc.nextDouble();

        calc = (var1 * 4 + var2 * 6) / 10;

        if (calc > 50) {

            if (calc > 60) {
                resp = "red";
            } else {
                resp = "blue";
            }
        } else if (calc > 40){
            resp = "white";
        } else {
            resp = "green";
        }
        System.out.print("the color is: " + resp);

        sc.close();
    }
}
