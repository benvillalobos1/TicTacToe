public class Board {

    private int rows;
    private int col;
    private int size;
    private String[] board;

    /**
     * Constructor function to initialize Board object
     * @param s size of board
     */
    public Board(int s) {
        rows = size;
        col = size;
        size = s;

        board = new String[s];

        generateBoard();

    }

    /**
     * Default constructor. Returns Board object of size 9
     *
     * @post rows = 3 AND col = 3 AND size = 9
     */
    public Board() {
        rows = 3;
        col = 3;
        size = 9;

        board = new String[9];

        generateBoard();
    }

    /**
     * Function used to fill in empty board with " "
     */
    private void generateBoard() {
        for (int i = 0; i < size; i++) {
            board[i] = " ";
        }
    }

    public int getRows() { return rows; }

    public int getCol() { return col; }

    public int getSize() { return size; }

    public String[] getBoard() { return board; }

}
