package application;

import java.util.Random;
import java.util.Scanner;

public class Executer {

    public static void main(String[] args) {

        char[][] gameBoard = Game.gameBoard();

        Printer.printGameBoard(gameBoard);

        while (true) {
            Scanner sc = new Scanner(System.in);

            Printer.print("enter a number between 1 to 9: ");

            int p1Position = sc.nextInt();

            while(Game.p1Positions.contains(p1Position) || Game.p2Positions.contains(Game.p1Positions)) {
                Printer.print("try again, enter a correct position!");
                p1Position = sc.nextInt();
            }

            Game.placePiece(gameBoard, p1Position, "p1");

            String gameResult = Game.logicForWinning();
            if (gameResult.length() > 0) {
                System.out.println(gameResult);
                break;
            }

            Random p2Turn = new Random();

            int p2Position = p2Turn.nextInt(9) + 1;

            while(Game.p1Positions.contains(p2Position) || Game.p2Positions.contains(Game.p2Positions)) {
                Printer.print("try again, enter a correct position!");
                p2Position = p2Turn.nextInt(9) + 1;
            }

            Game.placePiece(gameBoard, p2Position, "p2");

            Printer.printGameBoard(gameBoard);

            Game.logicForWinning();

            gameResult = Game.logicForWinning();
            if (gameResult.length() > 0) {
                System.out.println(gameResult);
                break;
            }
        }
    }
}
