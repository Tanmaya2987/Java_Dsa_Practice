package week3;

public class SpiralMatrix {
	 static void printSpiral(int[][] matrix) {

	        int top = 0;
	        int bottom = matrix.length - 1;

	        int left = 0;
	        int right = matrix[0].length - 1;

	        while (top <= bottom && left <= right) {

	            // 1. Move left to right
	            for (int j = left; j <= right; j++) {
	                System.out.print(matrix[top][j] + " ");
	            }

	            top++;

	            // 2. Move top to bottom
	            for (int i = top; i <= bottom; i++) {
	                System.out.print(matrix[i][right] + " ");
	            }

	            right--;

	            // 3. Move right to left
	            if (top <= bottom) {
	                for (int j = right; j >= left; j--) {
	                    System.out.print(matrix[bottom][j] + " ");
	                }

	                bottom--;
	            }

	            // 4. Move bottom to top
	            if (left <= right) {
	                for (int i = bottom; i >= top; i--) {
	                    System.out.print(matrix[i][left] + " ");
	                }

	                left++;
	            }
	        }
	    }

	    public static void main(String[] args) {

	        int[][] matrix = {
	                {1, 2, 3},
	                {4, 5, 6},
	                {7, 8, 9}
	        };

	        printSpiral(matrix);
	    }
}
