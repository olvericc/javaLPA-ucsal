package application;

public class Game {

    public boolean isValidMove(int[][] matrix, int row, int column, int number) {
        for (int i = 0; i < 9; i++) {
            if (matrix[row][i] == number || matrix[i][column] == number) {
                return false;
            }
        }

        int blockRow = row / 3 * 3;
        int blockColumn = column / 3 * 3;
        for (int i = blockRow; i < blockRow + 3; i++) {
            for (int j = blockColumn; j < blockColumn + 3; j++) {
                if (matrix[i][j] == number) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isSudokuComplete(int[][] matrix) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (matrix[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void insertNumber(int[][] matrix, int row, int column, int number) {
        matrix[row][column] = number;
    }
}
