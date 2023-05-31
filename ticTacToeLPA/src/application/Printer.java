package application;

public class Printer {

    public static void print (String args) {
        System.out.println(args);
    }

    public static void printGameBoard (char[][] gameBoard) {
        final String TRACE = "-----";
        System.out.println(TRACE);
        for (char[] line:gameBoard) {
            for (char column : line){
                System.out.print(column);
            }
            System.out.println();
        }
        System.out.println(TRACE);
    }
}
