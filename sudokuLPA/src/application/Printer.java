package application;

public class Printer {

    public static void print(String args) {
        System.out.print(args);
    }

    public static void println(String args) {
        System.out.println(args);
    }

    public static void printTable(int[][] matrix) {
        println("Sudoku Board:");

        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                println("------+-------+------");
            }

            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    print("| ");
                }

                if (matrix[i][j] == 0) {
                    print("_ ");
                } else {
                    print(matrix[i][j] + " ");
                }
            }
            println("");
        }
        println("");
    }
}
