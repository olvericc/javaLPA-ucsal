package application;

public class tempConverter {

    public static double celToKel(double temp) {
        return temp + 273.15;
    }

    public static double kelToCel(double temp) {
        return temp - 273.15;
    }

    public static double celToFah(double temp) {
        return (temp * 1.8) + 32;
    }

    public static double fahToCel(double temp) {
        return (temp - 32) / 1.8;
    }

    public static double fahToKel(double temp) {
        return (temp - 32) * 5/9 + 273;
    }

    public static double kelToFah(double temp) {
        return (temp - 273) * 1.8 + 32;
    }

}
