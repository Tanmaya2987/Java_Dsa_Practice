package week7;

import java.util.*;

public class LC401_BinaryWatch {

    static List<String> readBinaryWatch(int turnedOn) {

        List<String> result = new ArrayList<>();

        for (int hour = 0; hour < 12; hour++) {

            for (int minute = 0; minute < 60; minute++) {

                int hourBits = Integer.bitCount(hour);
                int minuteBits = Integer.bitCount(minute);

                if (hourBits + minuteBits == turnedOn) {

                    result.add(
                        String.format("%d:%02d", hour, minute)
                    );
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int turnedOn = 1;

        List<String> result = readBinaryWatch(turnedOn);

        System.out.println(result);
    }
}