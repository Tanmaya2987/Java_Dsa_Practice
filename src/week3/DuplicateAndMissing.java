package week3;

public class DuplicateAndMissing {

    static void findDuplicateAndMissing(int[] arr) {

        int duplicate = -1;
        int missing = -1;

        // Find duplicate
        for (int i = 0; i < arr.length; i++) {

            int value = Math.abs(arr[i]);
            int index = value - 1;

            if (arr[index] < 0) {
                duplicate = value;
            } else {
                arr[index] = -arr[index];
            }
        }

        // Find missing
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        System.out.println("Duplicate = " + duplicate);
        System.out.println("Missing = " + missing);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 4};

        findDuplicateAndMissing(arr);
    }


}
