import java.util.Scanner;

public class Main {
    public static boolean winCondition = true;
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe");
        String[] board = new String[9];
        for (int i = 0; i < 9; i++) {
            board[i] = " ";
        }
        printBoard(board);
        while (winCondition) {
            winCondition = makeMove(board);
        }
        System.out.println("Thanks for playing!");
    }

    public static void printBoard(String[] board) {
        System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
        System.out.println("_ _ _");
        System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
        System.out.println("_ _ _");
        System.out.println(board[6] + "|" + board[7] + "|" + board[8]);
    }

    public static boolean makeMove(String[] board) {
        System.out.println("Make your move! Type numbers 1-9 for each cell: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int cell = scanner.nextInt();
            board[cell - 1] = "X";
            printBoard(board);
            return cell != 9;
        }
        return true;
    }
}