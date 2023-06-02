package application;

import java.util.Scanner;

public class Executer {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1 or 2 players?");
        String players = keyboard.nextLine();

        Game game = new Game();

        if (players.equals("1")) {
            game.initializeSinglePlayerGame();
        } else {
            System.out.println("Player 1, please enter your word:");
            String word = keyboard.nextLine();
            game.initializeMultiPlayerGame(word);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Ready for player 2! Good luck!");
        }

        game.play(keyboard);
    }
}
