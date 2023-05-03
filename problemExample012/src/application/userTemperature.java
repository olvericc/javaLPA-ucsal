package application;

import java.util.Scanner;

public class userTemperature {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Printer.print("please, type a temperature in degrees: ");
        double temperatureInDegrees = sc.nextDouble();

        Printer.print("""
                choose the conversion you want to do:\s
                 1 - celsius to kelvin
                 2 - kelvin to celsius
                 3 - celsius to fahrenheit
                 4 - fahrenheit to celsius
                 5 - fahrenheit to kelvin
                 6 - kevin to fahrenheit""");

        int option = sc.nextInt();

        Printer.print(chooseOption(temperatureInDegrees, option));

        sc.close();

    }

    public static double chooseOption(double temp, int op) {
        double calc = 0;
        final String ERROR = "error! try again, please";

        switch (op) {
            case 1 -> calc = tempConverter.celToKel(temp);
            case 2 -> calc = tempConverter.kelToCel(temp);
            case 3 -> calc = tempConverter.celToFah(temp);
            case 4 -> calc = tempConverter.fahToCel(temp);
            case 5 -> calc = tempConverter.fahToKel(temp);
            case 6 -> calc = tempConverter.kelToFah(temp);
            default -> System.out.println(ERROR);
        }

        return calc;
    }

}
