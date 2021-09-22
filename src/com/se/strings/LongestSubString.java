package com.se.strings;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Longest Substring without repeating characters
 Ex1:  input : "abcabcbb";
       output : abc

Ex2: input : "bbbb"
     output : b

Ex: input : "pwwkew"
    output : wke


 */
public class LongestSubString {

    public static void main(String[] args) {
        String str = "abbac";
        System.out.println(longestSubString(str));
    }

    public static String longestSubString(String str) {
        String longestSubString = null;
        int subStringLength = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {

            char ch = arr[i];
            if (!map.containsKey(arr[i])) {
                map.put(ch, i);
            } else {
                i = map.get(ch);
                map.clear();
            }
            if (map.size() > subStringLength) {
                subStringLength = map.size();
                longestSubString = map.keySet().toString();
            }
        }
        return longestSubString;
    }
}
