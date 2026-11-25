package week17.hashmap;
import java.util.*;

public class LC451_SortByFreq {
	  public static String frequencySort(String s) {

	        HashMap<Character, Integer> map = new HashMap<>();

	        // Count frequency of each character
	        for (char ch : s.toCharArray()) {
	            map.put(ch, map.getOrDefault(ch, 0) + 1);
	        }

	        // Sort characters by frequency
	        List<Character> chars = new ArrayList<>(map.keySet());

	        chars.sort((a, b) -> map.get(b) - map.get(a));

	        StringBuilder result = new StringBuilder();

	        // Build result string
	        for (char ch : chars) {

	            int frequency = map.get(ch);

	            for (int i = 0; i < frequency; i++) {
	                result.append(ch);
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {

	        String s = "tree";

	        String result = frequencySort(s);

	        System.out.println("Sorted String: " + result);
	    }

}
