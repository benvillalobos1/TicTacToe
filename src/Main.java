import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //TODO: (Ben 3/17/26)
    //TODO:     - Create Board and Move classes
    //TODO:     - Refactor code to represent new structure
    //TODO:     - Design and upload UMLs for the project

    /**
     * Main function called when program is run
     *
     * @param args - command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe");
        String[] board = new String[9];
        for (int i = 0; i < 9; i++) {
            board[i] = " ";
        }
        boolean winCondition = true;

        printBoard(board);
        while (winCondition) {
            winCondition = makeMove(board);
        }
        System.out.println("Thanks for playing!");
    }

    /**
     * Function that is called to print the current state of the board.
     *
     * @param board - String array that represents the current state of the board.
     */
    public static void printBoard(String[] board) {
        System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
        System.out.println("_ _ _");
        System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
        System.out.println("_ _ _");
        System.out.println(board[6] + "|" + board[7] + "|" + board[8]);
    }

    /**
     * Function that allows for moves to be made as long as the move is valid.
     * Called every iteration of the game. Includes computer's move
     *
     * @param board String array that represents the current state of the board.
     *
     * @return true or false depending on if the move is made
     *
     * @post return TRUE if and only if the move is valid and made. Return FALSE otherwise.
     */
    public static boolean makeMove(String[] board) {
        System.out.println("Make your move! Type numbers 1-9 for each cell: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int cell = scanner.nextInt();
            if (checkValid(board, cell)) {
                board[cell - 1] = "X";
                aiMove(board);
                printBoard(board);
                return true;
            }
        }
        return false;
    }

    /**
     * Generates a random move for the computer.
     *
     * @param board String array that represents the current state of the board.
     */
    public static void aiMove(String[] board) {
        //TODO: (Ben 3/17/26) Update move generation to not be random. Create algorithm.
        Random random = new Random();
        int randInt = random.nextInt(8) + 1;
        if (checkValid(board, randInt)) {
            board[randInt - 1] = "O";
        } else {
            aiMove(board);
        }
    }

    /**
     * Function responsible for verifying the validity of a move.
     *
     * @param board String array that represents the current state of the board
     * @param move integer that represents which cell is being changed.
     *
     * @return true or false depending on if the move is valid
     *
     * @post return TRUE if all conditions are met and satisfied. Return FALSE otherwise.
     */
    public static boolean checkValid(String[] board, int move) {
        /*
        First case: checks if move has already been made
        Second case: makes sure input is within range 1-9
         */
        if (Objects.equals(board[move], "X") || Objects.equals(board[move], "O")) return false;
        if (move < 1 || move > 9) return false;

        //TODO: (Ben 3/17/26) Add more checks

        return true;

    }
}