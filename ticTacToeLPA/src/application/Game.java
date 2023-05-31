package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {

    static ArrayList<Integer> p1Positions = new ArrayList<Integer>();
    static ArrayList<Integer> p2Positions = new ArrayList<Integer>();

    public static char[][] gameBoard () {
        return new char[][]{
                {' ', '|', ' ','|', ' '},
                {'-', '+', '-','+', '-'},
                {' ', '|', ' ','|', ' '},
                {'-', '+', '-','+', '-'},
                {' ', '|', ' ','|', ' '},
        };
    }

    public static void placePiece(char[][] gameBoard, int position, String userTurn) {

        char character = ' ';

        if (userTurn.equals("p1")) {
            character = 'x';
        } else if (userTurn.equals("p2")) {
            character = 'o';
        }

        switch (position) {
            case 1 -> gameBoard[0][0] = character;
            case 2 -> gameBoard[0][2] = character;
            case 3 -> gameBoard[0][4] = character;
            case 4 -> gameBoard[2][0] = character;
            case 5 -> gameBoard[2][2] = character;
            case 6 -> gameBoard[2][4] = character;
            case 7 -> gameBoard[4][0] = character;
            case 8 -> gameBoard[4][2] = character;
            case 9 -> gameBoard[4][4] = character;
            default -> {}
        }
    }

    public static String logicForWinning () {

        List<Integer> lineOne = Arrays.asList(1, 2, 3);
        List<Integer> lineTwo = Arrays.asList(4, 5, 6);
        List<Integer> lineThree = Arrays.asList(7, 8, 9);

        List<Integer> columnOne = Arrays.asList(1, 4, 7);
        List<Integer> columnTwo = Arrays.asList(2, 5, 8);
        List<Integer> columnThree = Arrays.asList(3, 6, 9);

        List<Integer> diagonalOne = Arrays.asList(1, 5, 9);
        List<Integer> diagonalTwo = Arrays.asList(7, 5, 3);

        List<List> win = new ArrayList<>();

        win.add(lineOne);
        win.add(lineTwo);
        win.add(lineThree);

        win.add(columnOne);
        win.add(columnTwo);
        win.add(columnThree);

        win.add(diagonalOne);
        win.add(diagonalTwo);

        for (List list : win) {
            if (p1Positions.containsAll(list)) {
                return "p1 wins!";
            } else if (p2Positions.containsAll(list)){
                return "p2 wins!";
            } else if (p1Positions.size() + p2Positions.size() == 9) {
                return "play again!";
            }
        }

        return "";
    }
}
