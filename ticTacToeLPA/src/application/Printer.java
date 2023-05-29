package application;

public class Printer {

    public static void printGameBoard (String[][] gameBoard) {
        for (String[] line:gameBoard) {
            for (String column : line){
                System.out.print(column);
            }
            System.out.println();
        }
    }

}
