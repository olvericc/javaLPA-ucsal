package application;

public class Game {

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
}
