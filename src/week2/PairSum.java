package week2;

public class PairSum {
	 static void findPair(int[] arr, int target) {

	        int left = 0;
	        int right = arr.length - 1;

	        while (left < right) {

	            int sum = arr[left] + arr[right];

	            if (sum == target) {

	                System.out.println(
	                    "Pair: " + arr[left] + " + " + arr[right]
	                );

	                return;
	            }

	            else if (sum < target) {
	                left++;
	            }

	            else {
	                right--;
	            }
	        }

	        System.out.println("No pair found.");
	    }

	    public static void main(String[] args) {

	        int[] arr = {1, 2, 3, 4, 6};

	        int target = 6;

	        findPair(arr, target);
	    }

}
