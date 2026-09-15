package week3;

public class MaximumVowels {
	
	static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    static int maxVowels(String s, int k) {

        int count = 0;
        int maxCount = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        maxCount = count;

        // Slide the window
        for (int i = k; i < s.length(); i++) {

            // Add new character
            if (isVowel(s.charAt(i))) {
                count++;
            }

            // Remove old character
            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    public static void main(String[] args) {

        String s = "abciiidef";
        int k = 3;

        System.out.println("Maximum vowels = " + maxVowels(s, k));
    }

}
