package week16.graph;

public class LC200_Island {

		 public static int numIslands(char[][] grid) {

		        int rows = grid.length;
		        int cols = grid[0].length;

		        int count = 0;

		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {

		                if (grid[i][j] == '1') {

		                    count++;

		                    dfs(grid, i, j);
		                }
		            }
		        }

		        return count;
		    }

		    public static void dfs(char[][] grid, int r, int c) {

		        int rows = grid.length;
		        int cols = grid[0].length;

		        if (r < 0 || c < 0 || r >= rows || c >= cols) {
		            return;
		        }

		        if (grid[r][c] == '0') {
		            return;
		        }

		        grid[r][c] = '0';

		        dfs(grid, r + 1, c);
		        dfs(grid, r - 1, c);
		        dfs(grid, r, c + 1);
		        dfs(grid, r, c - 1);
		    }

		    public static void main(String[] args) {

		        char[][] grid = {
		            {'1', '1', '0', '0'},
		            {'1', '1', '0', '0'},
		            {'0', '0', '1', '0'},
		            {'0', '0', '0', '1'}
		        };

		        System.out.println("Number of Islands: " + numIslands(grid));
		    }

	}


