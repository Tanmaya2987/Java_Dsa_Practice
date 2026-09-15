package week3;

public class VariableSlidingWindow {
	
	 static int longestSubarray(int[] arr, int target) {

	        int left = 0;
	        int sum = 0;
	        int maxLength = 0;

	        for (int right = 0; right < arr.length; right++) {

	            // Expand window
	            sum += arr[right];

	            // Shrink window if sum becomes too large
	            while (sum > target && left <= right) {
	                sum -= arr[left];
	                left++;
	            }

	            // Current window length
	            int length = right - left + 1;

	            maxLength = Math.max(maxLength, length);
	        }

	        return maxLength;
	    }

	    public static void main(String[] args) {

	        int[] arr = {1, 2, 1, 0, 1, 1, 0};
	        int target = 4;

	        System.out.println(
	            "Longest subarray length = "
	            + longestSubarray(arr, target)
	        );
	    }

}
