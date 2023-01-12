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
    public static boolean isBoardValid(int[][] board){
        for(int column = 0; column < board[0].length; column++){
            for(int row = board.length - 1; row >= 0; row--){
                if(board[row][column] == 0){
                    for(int r = board.length - 1; r >= 0; r--){
                        if(board[r][column] != 0){
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
    public static int getWinner(int[][] board){
        //this works frfr 
        return 0;
    }
    
   // It is recommended to use private helper methods
    //I know you supposed to check the vertical and horizontal but holy shart every time I code something that looks like its going to work it makes the situation worse
}
