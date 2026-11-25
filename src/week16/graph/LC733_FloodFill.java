package week16.graph;

public class LC733_FloodFill {

	 public static int[][] floodFill(int[][] image, int sr, int sc, int color) {

	        int originalColor = image[sr][sc];

	        if (originalColor == color) {
	            return image;
	        }

	        dfs(image, sr, sc, originalColor, color);

	        return image;
	    }

	    public static void dfs(int[][] image, int r, int c,
	                           int originalColor, int color) {

	        int rows = image.length;
	        int cols = image[0].length;

	        if (r < 0 || c < 0 || r >= rows || c >= cols) {
	            return;
	        }

	        if (image[r][c] != originalColor) {
	            return;
	        }

	        image[r][c] = color;

	        dfs(image, r + 1, c, originalColor, color);
	        dfs(image, r - 1, c, originalColor, color);
	        dfs(image, r, c + 1, originalColor, color);
	        dfs(image, r, c - 1, originalColor, color);
	    }

	    public static void main(String[] args) {

	        int[][] image = {
	            {1, 1, 1},
	            {1, 1, 0},
	            {1, 0, 1}
	        };

	        int[][] result = floodFill(image, 1, 1, 2);

	        for (int[] row : result) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	    }
}
