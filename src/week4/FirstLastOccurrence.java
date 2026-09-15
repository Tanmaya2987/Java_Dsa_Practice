package week4;

public class FirstLastOccurrence {
	 static int firstOccurrence(int[] arr, int target) {

	        int left = 0;
	        int right = arr.length - 1;
	        int answer = -1;

	        while (left <= right) {

	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {

	                answer = mid;

	                // Search further left
	                right = mid - 1;
	            }

	            else if (arr[mid] < target) {
	                left = mid + 1;
	            }

	            else {
	                right = mid - 1;
	            }
	        }

	        return answer;
	    }

	    static int lastOccurrence(int[] arr, int target) {

	        int left = 0;
	        int right = arr.length - 1;
	        int answer = -1;

	        while (left <= right) {

	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {

	                answer = mid;

	                // Search further right
	                left = mid + 1;
	            }

	            else if (arr[mid] < target) {
	                left = mid + 1;
	            }

	            else {
	                right = mid - 1;
	            }
	        }

	        return answer;
	    }

	    public static void main(String[] args) {

	        int[] arr = {1, 2, 2, 2, 3, 4};

	        int target = 2;

	        int first = firstOccurrence(arr, target);
	        int last = lastOccurrence(arr, target);

	        int frequency = 0;

	        if (first != -1) {
	            frequency = last - first + 1;
	        }

	        System.out.println("First occurrence = " + first);
	        System.out.println("Last occurrence = " + last);
	        System.out.println("Frequency = " + frequency);
	    }
}
