import java.util.Scanner;

public class Main {

    static final char CROSS = 'X';
    static final char CIRCLE = 'O';

    //method to display board
    public static void displayBoard(char[][] board) {

        //nested loop for iterating through the board and displaying the board
        System.out.println("+---+---+---+");
        for (int i = 0; i < board.length; i++) {
            System.out.print(("| "));
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.print("\n+---+---+---+");
            System.out.println();
        }
    }

    //method for checking winner
    public static boolean checkWinner(char[][] board, char player) {

        //looping for 3 in a row for rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        //looping for 3 in a row for cols
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        //checking for diagonal win
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        //checking for diagonal win
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;

    }

    //method for inserting move
    public static boolean insertMove(char[][] board, int row, int col, char move) {

        //making sure that moves are between ranges (0,2)
        if (row < 0 || row > 2)
            return false;
        if (col < 0 || col > 2)
            return false;

        //making sure space isnt taken
        if (board[row][col] != ' '){
            return false;
        }

        //placing the actual move on the board
        board[row][col] = move;
        return true;

    }

    //botplayer that plays alongside user
    public static int[] botMoves(char[][] board, char bot, char human) {

        //array that adresses corners and sides
        int[][] corners = {{0,0}, {0,2}, {2,0}, {2,2}};
        int[][] sides = {{0,1}, {1,0}, {1,2}, {2,1}};

        //looping through board to check for empty spots and if bot can win
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = bot;

                    if (checkWinner(board, bot)) {
                        board[i][j] = ' ';
                        return new int[]{i, j};
                    }
                    board[i][j] = ' ';
                }
            }
        }

        //checking if bot can block human
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = human;

                    if (checkWinner(board, bot)) {
                        board[i][j] = ' ';
                        return new int[]{i, j};
                    }
                    board[i][j] = ' ';
                }
            }
        }

        //checking for open middle
        if (board[1][1] == ' ') {
            return new int[]{1, 1};
        }

        //checkking for open corners
        for (int[] corner: corners){
            if (board[corner[0]][corner[1]] == ' '){
                return corner;
            }
        }

        //checking for open sides
        for (int[] side : sides) {
            if (board[side[0]][side[1]] == ' ') {
                return side;
            }
        }

        return new int[]{0, 0};
    }

    //main method ;D
    public static void main(String args[]) {

        //variables for player and bot, and input, and displaying board
        int row, col;
        char human = CIRCLE;
        char bot = CROSS;
        char currentPlayer = human;
        int numberOfMoves = 0;
        int rounds = 0;
        Scanner input = new Scanner(System.in);
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        //game loop
        while (true) {
            boolean validMove = false;

            //checking if space is open
            System.out.println("Round: " + rounds);
            while (!validMove) {
                displayBoard(board);
                System.out.printf("Player %c enter move (row col): ", currentPlayer);

                // Check if both inputs are ints
                if (!input.hasNextInt()) {
                    System.out.println("Row must be an integer.");
                    input.nextLine();
                    continue;
                }
                row = input.nextInt();

                if (!input.hasNextInt()) {
                    System.out.println("Column must be an integer.");
                    input.nextLine();
                    continue;
                }
                col = input.nextInt();

                //range check
                if (row < 0 || row > 2 || col < 0 || col > 2) {
                    System.out.println("Row and column must be in range 0-2.");
                    continue;
                }

                //cell taken check
                if (!insertMove(board, row, col, currentPlayer)) {
                    System.out.println("Cell already taken. Try again.");
                    continue;
                }

                validMove = true;
            }

            //checking winner at rounds 5 and up
            numberOfMoves++;
            if (numberOfMoves >= 5 && checkWinner(board, human)) {
                displayBoard(board);
                System.out.printf("Player %c wins!\n", currentPlayer);
                break;
            }

            if (numberOfMoves == 9) {
                displayBoard(board);
                System.out.println("It's a tie!");
                break;
            }

            //switch to bot
            currentPlayer = bot;

            int[] botMove = botMoves(board, bot, human);
            insertMove(board, botMove[0], botMove[1], currentPlayer);
            System.out.printf("Bot placed at (%d, %d)\n", botMove[0], botMove[1]);
            numberOfMoves++;

            if (numberOfMoves >= 5 && checkWinner(board, currentPlayer)) {
                displayBoard(board);
                System.out.println("Bot wins!");
                break;
            }

            if (numberOfMoves == 9) {
                displayBoard(board);
                System.out.println("It's a tie!");
                break;
            }

            // Switch back to human and rounds indicator
            currentPlayer = human;
            rounds++;
        }
    }
}




