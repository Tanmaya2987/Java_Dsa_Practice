package week5;

import java.util.Arrays;

public class LC2418_SortThePeople {

    public static String[] sortPeople(
            String[] names,
            int[] heights) {

        for (int i = 0; i < heights.length - 1; i++) {

            int maxIndex = i;

            for (int j = i + 1; j < heights.length; j++) {

                if (heights[j] > heights[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap heights
            int tempHeight = heights[i];
            heights[i] = heights[maxIndex];
            heights[maxIndex] = tempHeight;

            // Swap corresponding names
            String tempName = names[i];
            names[i] = names[maxIndex];
            names[maxIndex] = tempName;
        }

        return names;
    }

    public static void main(String[] args) {

        String[] names = {"Mary", "John", "Emma"};

        int[] heights = {180, 165, 170};

        System.out.println(
                Arrays.toString(sortPeople(names, heights))
        );
    }
}