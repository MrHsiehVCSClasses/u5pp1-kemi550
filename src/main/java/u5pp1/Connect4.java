package u5pp1;

public class Connect4 {

    public static final int RED_WIN = 0;
    public static final int BLACK_WIN = 1;
    public static final int NO_WINNER = 2;
    public static final int BOTH_WIN = 3;

    public static final int RED = 1;
    public static final int BLACK = -1;
    public static final int EMPTY = 0;

   // implementation here

   //Goes through every index in row and column and sees if its EMPTPY (0) returns false if empty true if is full 
    public static boolean isFull(int[][] board){
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board[row].length; column++){
                if (board [row] [column] == EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    //Checks is a board is valid by seeing if there are no empty spaces underneath any pieces
    public static boolean isBoardValid(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 1 || board[row][col] == -1) {
                    for (int rowJ = row + 1; rowJ < board.length; rowJ++) {
                        if (board[rowJ][col] == 0) {
                        //If an empty space is found, the board is not valid and returns false
                        return false;
                    }
                }
            }
        }
    }
    //If there are no empty spaces found, the board is valid and returns true 
    return true;
    }
    //If red has 4 in a row returns 0, if black has 4 in a row returns 1, if both have 4 in a row returns 3, if there is no winner returns 0
    public static int getWinner(int[][] board) {
        boolean red = false;
        boolean black = false;
    
        // Checks horizontally
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length - 3; j++) {
                if (board[i][j] == 1 && board[i][j + 1] == 1 && board[i][j + 2] == 1 && board[i][j + 3] == 1) {
                    red = true;
                } else if (board[i][j] == -1 && board[i][j + 1] == -1 && board[i][j + 2] == -1 && board[i][j+3] == -1) {
                    black = true;
                }
            }
        }
    
        // Checks vertically
        for (int i = 0; i < board.length - 3; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1 && board[i + 1][j] == 1 && board[i + 2][j] == 1 && board[i + 3][j] == 1) {
                    red = true;
                } else if (board[i][j] == -1 && board[i + 1][j] == -1 && board[i + 2][j] == -1 && board[i + 3][j] == -1) {
                    black = true;
                }
            }
        }
        // Checks diagonally
    for (int i = 3; i < board.length; i++) {
        for(int j = 0; j < board[i].length - 3; j++) {
            if (board[i][j] == 1) {
                if (board[i - 1][j + 1] == 1) {
                    if ((board[i - 2][j + 2] == 1) && (board[i - 3][j + 3] == 1)) {
                        red = true;
                    }
                }
            } else if (board[i][j] == -1) {
                if (board[i - 1][j + 1] == -1) {
                    if ((board[i - 2][j + 2] == -1) && (board[i - 3][j + 3] == -1)) {
                        black = true;
                    }
                }
            }
        }
    }

    for(int i = 0; i < board.length - 3; i++) {
        for(int j = 0; j < board[0].length - 3; j++) {
            if (board[i][j] == 1) {
                if (board[i + 1][j + 1] == 1) {
                    if ((board[i + 2][j + 2] == 1) && (board[i + 3][j + 3] == 1)) {
                        red = true;
                    }
                }
            } else if (board[i][j] == -1) {
                if (board[i + 1][j + 1] == -1) {
                    if ((board[i + 2][j + 2] == -1) && (board[i + 3][j + 3] == -1)) {
                        black = true;
                    }
                }
            }
        }
    }
    if (red && black) {
        return BOTH_WIN;
            } else if (red) {
        return RED_WIN;
            } else if (black) {
        return BLACK_WIN;
            } else {
        return NO_WINNER;
        }
        }
    
}
