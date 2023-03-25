import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // constants
        final String ERROR = "Incorrect, try again, please!";

        Scanner sc = new Scanner(System.in);

        //  use this term to break line -> \n
        System.out.println("choose the invertebrate animal: \n" +
                "\n 1) dog" +
                "\n 2) cat" +
                "\n 3) squid" +
                "\n 4) cow \n");

        System.out.println("type your answer: ");

        int chosenOption = sc.nextInt();

        switch (chosenOption){
            case 1 : case 2 : case 4:
                System.out.println(ERROR);
                break;
            case 3:
                System.out.println("congratulations, your answer is correct!");
                break;
            default:
                System.out.println("out of interval");
                break;
        }

        sc.close();

    }
}