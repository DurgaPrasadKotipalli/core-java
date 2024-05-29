package com.se.strings;

public class LongestMessage {

    public static void main(String[] args) {
        String input = "aaabbccdddeeffgg";

        String output = longestStringMessage(input);
        System.out.println(output.length() + ": " + output);
    }

    public static String longestStringMessage(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        int maxLength = 0;
        int currentLength = 1;
        String longestMessage = String.valueOf(input.charAt(0));

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    longestMessage = input.substring(i - currentLength, i);
                }
                currentLength = 1;
            }//else
        }//for
        if (currentLength > maxLength) {
            maxLength = currentLength;
            longestMessage = input.substring(input.length() - currentLength);
        }

        return longestMessage;
    }
}
