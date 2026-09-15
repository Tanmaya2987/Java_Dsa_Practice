package week6;

public class LC198_HouseRobber {

    public static int rob(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int prev2 = 0;
        int prev1 = 0;

        for (int money : nums) {

            // If we rob current house
            int robCurrent = prev2 + money;

            // If we skip current house
            int skipCurrent = prev1;

            int current = Math.max(robCurrent, skipCurrent);

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 9, 3, 1};

        System.out.println(
                "Maximum money = " + rob(nums)
        );
    }
}