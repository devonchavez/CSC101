
import java.util.Random;
import java.util.Scanner;

public class Main {

    static final char CROSS = 'X';
    static final char CIRCLE = 'O';

    public static void displayBoard(char[][] board){

        System.out.println("+---+---+---+");
        for (int i = 0; i < board.length; i++) {
            System.out.print(("| "));// loop through rows
            for (int j = 0; j < board[i].length; j++) {          // loop through columns
                System.out.print(board[i][j] + " | ");
            }
            System.out.print("\n+---+---+---+");
            System.out.println(); // move to next line after each row
        }
    }

    //public static boolean checkWinner(){

    //}

    public static boolean insetMove(char[][] board, int row, int col, char move){

        if (row < 0 || row > 2)
            return false;
        if (col < 0 || col > 2)
            return false;

        board[row][col] = move;
        return true;
    }

    public static void main(String args[]) {
        int row,col;
        char currentPlayer = CIRCLE;
        char opponentPlayer = CROSS;
        int numberOfMoves = 0;
        int rounds = 0;
        Scanner input = new Scanner(System.in);
        char[][] board = {
                {'X', ' ', ' '},
                {' ', 'X', 'X'},
                {' ', ' ', ' '}
        };

        while(true){
            displayBoard(board);
            System.out.printf("Player %c enter move (row col): ", currentPlayer);
            if(input.hasNextInt()) {
                row = input.nextInt();
                col = input.nextInt();
            } else {
                System.out.println("Invalid input, row number must be an integer");
                input.nextLine();
                continue;
            }
            board[row][col] = currentPlayer;
            numberOfMoves++;
            System.out.println(numberOfMoves);
        }


        //if (insertMove(board, row, col, currentPlayer)){

    }
}


/*
        for (int i = 0; i < 3; i++) {              // loop through rows
            for (int j = 0; j < 3; j++) {          // loop through columns
                System.out.print(board[i][j] + " ");
                if )
            }
            System.out.println(); // move to next line after each row
        }
 */
