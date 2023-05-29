package application;

import java.util.Scanner;

public class Executor {

    public static void main(String[] args) {

        Printer.printGameBoard(Game.gameBoard());

        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number between 1 to 9: ");
        int position = sc.nextInt();

        Game.placePiece(, position, "p1");

        Printer.printGameBoard(Game.gameBoard());

    }

}
