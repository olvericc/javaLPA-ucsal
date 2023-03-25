import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int value1, value2, value3;

        System.out.println("please, type the first value: ");
        value1 = sc.nextInt();

        if (value1 >= 0 && value1 <= 10) {
            System.out.println("type the second value: ");
            value2 = sc.nextInt();



        }
        else { // first if
            System.out.println("out of interval");
        }

        sc.close();

    }
}