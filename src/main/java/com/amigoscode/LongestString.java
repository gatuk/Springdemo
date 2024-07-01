package com.amigoscode;

public class LongestString {

    public static String find(String[] arr) {
        int maxLength = 0;
        String longestString = null;

        longestString = getString(arr, maxLength, longestString);

        return longestString;
    }

    private static String getString(String[] arr, int maxLength, String longestString) {
        for (String s : arr) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;
    }
}
