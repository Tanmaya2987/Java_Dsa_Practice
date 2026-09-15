package week6;

import java.util.ArrayList;
import java.util.List;

public class LC78_Subsets {

    static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> subsets(int[] nums) {

        result.clear();

        generate(nums, 0, new ArrayList<>());

        return result;
    }

    static void generate(
            int[] nums,
            int index,
            List<Integer> current) {

        // Base case
        if (index == nums.length) {

            result.add(new ArrayList<>(current));

            return;
        }

        // Include current element
        current.add(nums[index]);

        generate(nums, index + 1, current);

        // Backtrack
        current.remove(current.size() - 1);

        // Don't include current element
        generate(nums, index + 1, current);
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        System.out.println(subsets(nums));
    }
}