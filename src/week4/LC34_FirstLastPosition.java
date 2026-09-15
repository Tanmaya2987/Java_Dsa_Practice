package week4;
import java.util.Arrays;

public class LC34_FirstLastPosition {
	 static int findFirst(int[] nums, int target) {

	        int left = 0;
	        int right = nums.length - 1;

	        int answer = -1;

	        while (left <= right) {

	            int mid = left + (right - left) / 2;

	            if (nums[mid] == target) {

	                answer = mid;

	                // Continue searching left
	                right = mid - 1;
	            }

	            else if (nums[mid] < target) {
	                left = mid + 1;
	            }

	            else {
	                right = mid - 1;
	            }
	        }

	        return answer;
	 }
	 
	 static int findLast(int[] nums, int target) {

	        int left = 0;
	        int right = nums.length - 1;

	        int answer = -1;

	        while (left <= right) {

	            int mid = left + (right - left) / 2;

	            if (nums[mid] == target) {

	                answer = mid;

	                // Continue searching right
	                left = mid + 1;
	            }

	            else if (nums[mid] < target) {
	                left = mid + 1;
	            }

	            else {
	                right = mid - 1;
	            }
	        }

	        return answer;
	    }

	    public static int[] searchRange(int[] nums, int target) {

	        int first = findFirst(nums, target);
	        int last = findLast(nums, target);

	        return new int[]{first, last};
	    }

	    public static void main(String[] args) {

	        int[] nums = {5, 7, 7, 8, 8, 10};

	        int target = 8;

	        System.out.println(
	                Arrays.toString(searchRange(nums, target))
	        );
	    }

}
