package application;

public class Printer {

    public static void printGameBoard (char[][] gameBoard) {
        for (char[] line:gameBoard) {
            for (char column : line){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
