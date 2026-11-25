package week16.graph;

public class LC130_SurroundedRegion {
	 public static void solve(char[][] board) {

	        int rows = board.length;

	        if (rows == 0) {
	            return;
	        }

	        int cols = board[0].length;

	        // Check first and last columns
	        for (int i = 0; i < rows; i++) {
	            dfs(board, i, 0);
	            dfs(board, i, cols - 1);
	        }

	        // Check first and last rows
	        for (int j = 0; j < cols; j++) {
	            dfs(board, 0, j);
	            dfs(board, rows - 1, j);
	        }

	        // Convert surrounded O to X
	        // Restore protected cells
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {

	                if (board[i][j] == 'O') {
	                    board[i][j] = 'X';
	                }

	                else if (board[i][j] == '#') {
	                    board[i][j] = 'O';
	                }
	            }
	        }
	    }

	    public static void dfs(char[][] board, int r, int c) {

	        int rows = board.length;
	        int cols = board[0].length;

	        if (r < 0 || c < 0 || r >= rows || c >= cols) {
	            return;
	        }

	        if (board[r][c] != 'O') {
	            return;
	        }

	        board[r][c] = '#';

	        dfs(board, r + 1, c);
	        dfs(board, r - 1, c);
	        dfs(board, r, c + 1);
	        dfs(board, r, c - 1);
	    }

	    public static void main(String[] args) {

	        char[][] board = {
	            {'X', 'X', 'X', 'X'},
	            {'X', 'O', 'O', 'X'},
	            {'X', 'X', 'O', 'X'},
	            {'X', 'O', 'X', 'X'}
	        };

	        solve(board);

	        for (char[] row : board) {
	            for (char ch : row) {
	                System.out.print(ch + " ");
	            }
	            System.out.println();
	        }
	    }

}
