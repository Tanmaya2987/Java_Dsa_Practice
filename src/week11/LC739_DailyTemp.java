package week11;

import java.util.Stack;
import java.util.Arrays;

public class LC739_DailyTemp {

    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() &&
                   temperatures[i] > temperatures[st.peek()]) {

                int pday = st.pop();
                ans[pday] = i - pday;
            }

            st.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        LC739_DailyTemp obj = new LC739_DailyTemp();

        int[] result = obj.dailyTemperatures(temperatures);

        System.out.println("Temperatures: " + Arrays.toString(temperatures));
        System.out.println("Answer:       " + Arrays.toString(result));
    }
}