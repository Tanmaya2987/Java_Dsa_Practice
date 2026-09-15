package week7;

public class SubstringsAndSubsequences {

    // Print all substrings
    static void printSubstrings(String str, int start, int end) {

        if (start == str.length()) {
            return;
        }

        if (end == str.length()) {
            printSubstrings(str, start + 1, start + 1);
            return;
        }

        System.out.println(str.substring(start, end + 1));

        printSubstrings(str, start, end + 1);
    }

    // Print all subsequences
    static void printSubsequences(String str, int index, String current) {

        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // Include current character
        printSubsequences(
            str,
            index + 1,
            current + str.charAt(index)
        );

        // Exclude current character
        printSubsequences(
            str,
            index + 1,
            current
        );
    }

    public static void main(String[] args) {

        String str = "ABC";

        System.out.println("Substrings:");

        printSubstrings(str, 0, 0);

        System.out.println("\nSubsequences:");

        printSubsequences(str, 0, "");
    }
}