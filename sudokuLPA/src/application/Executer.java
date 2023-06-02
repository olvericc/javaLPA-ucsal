package application;

import java.util.Scanner;

public class Executer {

    public static void main(String[] args) {

        int[][] matrix = {
                {0, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 6, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 8, 0, 0, 4, 7},
                {0, 5, 0, 0, 0, 0, 0, 3, 0},
                {0, 0, 6, 0, 7, 0, 5, 0, 0},
                {0, 7, 0, 0, 0, 0, 0, 9, 0},
                {9, 6, 0, 0, 1, 0, 0, 0, 0},
                {3, 0, 0, 0, 0, 4, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0}
        };

        try (Scanner scanner = new Scanner(System.in)) {
            Game game = new Game();

            Printer.printTable(matrix);

            while (!game.isSudokuComplete(matrix)) {
                Printer.print("Enter the row (0 to 8): ");
                int row = scanner.nextInt();
                Printer.print("Enter the column (0 to 8): ");
                int column = scanner.nextInt();
                Printer.print("Enter the number (1 to 9): ");
                int number = scanner.nextInt();

                if (game.isValidMove(matrix, row, column, number)) {
                    game.insertNumber(matrix, row, column, number);
                    Printer.println("Number inserted successfully!");
                } else {
                    Printer.println("Wrong move! Try again.");
                }

                Printer.println("");

                Printer.printTable(matrix);
            }
        }

        Printer.println("Congratulations! You completed the Sudoku!");
    }
}