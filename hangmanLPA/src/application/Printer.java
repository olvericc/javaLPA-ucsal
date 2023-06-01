package application;

import java.util.List;

public class Printer {

    public static void print (String args) {
        System.out.print(args);
    }

    public static void printMan(Integer wrongCount) {
        Printer.print(" -------");
        Printer.print(" |     |");

        if (wrongCount >= 1) {
            Printer.print(" O");
        }

        if (wrongCount >= 2) {
            Printer.print("\\ ");
            if (wrongCount >= 3) {
                Printer.print("/");
            } else {
                Printer.print("");
            }
        }

        if (wrongCount >= 4) {
            Printer.print(" |");
        }

        if (wrongCount >= 5) {
            Printer.print("/ ");
            if (wrongCount >= 6) {
                Printer.print("\\");
            } else {
                Printer.print("");
            }
        }

        Printer.print("");
        Printer.print("");
    }

    public static boolean printWord(String word, List<Character> playerGuesses) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (playerGuesses.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));
                count++;
            } else {
                Printer.print("-");
            }
        }

        Printer.print("");

        return (word.length() == count);
    }
}