package week4;

public class CountValidSubarrays {
	static int countSubarrays(int[] arr, int limit) {

        int left = 0;
        int sum = 0;
        int count = 0;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            // Shrink if sum exceeds limit
            while (sum > limit) {
                sum -= arr[left];
                left++;
            }

            // Every subarray ending at right
            // from left to right is valid
            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1};
        int limit = 3;

        System.out.println(
                "Valid subarrays = "
                        + countSubarrays(arr, limit)
        );
    }

}
