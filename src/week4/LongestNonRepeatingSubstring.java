package week4;
import java.util.HashSet;

public class LongestNonRepeatingSubstring {
	 static int longestSubstring(String s) {

	        HashSet<Character> set = new HashSet<>();

	        int left = 0;
	        int maxLength = 0;

	        for (int right = 0; right < s.length(); right++) {

	            // If duplicate found, remove from left
	            while (set.contains(s.charAt(right))) {
	                set.remove(s.charAt(left));
	                left++;
	            }

	            // Add current character
	            set.add(s.charAt(right));

	            // Calculate window length
	            int length = right - left + 1;

	            maxLength = Math.max(maxLength, length);
	        }

	        return maxLength;
	    }

	    public static void main(String[] args) {

	        String s = "abcabcbb";

	        System.out.println(
	                "Longest length = " + longestSubstring(s)
	        );
	    }

}
