public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe");
        String[] board = new String[9];
        for (int i = 0; i < 9; i++) {
            board[i] = " ";
        }
        printBoard(board);
    }

    public static void printBoard(String[] board) {
        System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
        System.out.println("_ _ _");
        System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
        System.out.println("_ _ _");
        System.out.println(board[6] + "|" + board[7] + "|" + board[8]);
    }
}