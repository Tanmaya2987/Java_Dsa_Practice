package week2;

public class MaximumSubarraySum {
	
	 static int maxSum(int[] arr, int k) {

	        int windowSum = 0;
	        int maxSum = Integer.MIN_VALUE;

	        // First window
	        for (int i = 0; i < k; i++) {
	            windowSum += arr[i];
	        }

	        maxSum = windowSum;

	        // Slide the window
	        for (int i = k; i < arr.length; i++) {

	            // Add new element
	            windowSum += arr[i];

	            // Remove old element
	            windowSum -= arr[i - k];

	            maxSum = Math.max(maxSum, windowSum);
	        }

	        return maxSum;
	    }

	    public static void main(String[] args) {

	        int[] arr = {2, 1, 5, 1, 3, 2};
	        int k = 3;

	        System.out.println("Maximum Sum = " + maxSum(arr, k));
	    }

}
