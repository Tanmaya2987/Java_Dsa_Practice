package week4;

public class MinimumSubarrayLength {
	 static int minSubArrayLen(int target, int[] arr) {

	        int left = 0;
	        int sum = 0;
	        int minLength = Integer.MAX_VALUE;

	        for (int right = 0; right < arr.length; right++) {

	            // Expand window
	            sum += arr[right];

	            // Shrink while condition is satisfied
	            while (sum >= target) {

	                int length = right - left + 1;

	                minLength = Math.min(minLength, length);

	                sum -= arr[left];
	                left++;
	            }
	        }

	        if (minLength == Integer.MAX_VALUE) {
	            return 0;
	        }

	        return minLength;
	    }

	    public static void main(String[] args) {

	        int target = 7;

	        int[] arr = {2, 3, 1, 2, 4, 3};

	        System.out.println(
	                "Minimum length = "
	                        + minSubArrayLen(target, arr)
	        );
	    }

}
