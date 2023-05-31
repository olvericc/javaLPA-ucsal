package application;

import java.util.Random;
import java.util.Scanner;

public class Executor {

    public static void main(String[] args) {

        Printer.printGameBoard(Game.gameBoard());

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("enter a number between 1 to 9: ");

            int p1Position = sc.nextInt();
            Game.placePiece(Game.gameBoard(), p1Position, "p1");

            Random p2Turn = new Random();

            int p2Position = p2Turn.nextInt(9) + 1;
            Game.placePiece(Game.gameBoard(), p2Position, "p2");

            Printer.printGameBoard(Game.gameBoard());
        }
    }
}
