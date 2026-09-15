package week6;

import java.util.ArrayList;
import java.util.List;

public class LC17_LetterCombinations {

    static String[] keypad = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    public static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        generate(digits, 0, "", result);

        return result;
    }

    static void generate(
            String digits,
            int index,
            String current,
            List<String> result) {

        // Base case
        if (index == digits.length()) {

            result.add(current);

            return;
        }

        // Get digit
        int digit = digits.charAt(index) - '0';

        String letters = keypad[digit];

        // Try every letter
        for (int i = 0; i < letters.length(); i++) {

            generate(
                    digits,
                    index + 1,
                    current + letters.charAt(i),
                    result
            );
        }
    }

    public static void main(String[] args) {

        String digits = "23";

        System.out.println(
                letterCombinations(digits)
        );
    }
}