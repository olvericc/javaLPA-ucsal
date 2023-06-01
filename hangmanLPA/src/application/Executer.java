package application;

import java.util.Scanner;

public class Executer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Printer.print("single-player or multi-player? (1 / 2)");

        String typeOfGame = sc.nextLine();

        Game game = new Game();

        if (typeOfGame.equals("1") || typeOfGame.equals("single-player")) {
            game.singlePlayer();
        } else {
            Printer.print("p1, write the suggested word");
            String p1Word = sc.nextLine();

            game.multiPlayerGame(p1Word);

            Printer.print("now it's player 2's turn");
        }
        game.playing(sc);
    }
}
