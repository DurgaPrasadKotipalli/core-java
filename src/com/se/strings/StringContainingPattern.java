package com.se.strings;

import java.util.ArrayList;
import java.util.List;

public class StringContainingPattern {
    public static void main(String[] args) {
        String str1 = "this is a test string";
        String pattern1 = "tist";
        System.out.println("Input: string = \"" + str1
                + "\", pattern = \"" + pattern1 + "\"");
        // System.out.println("Output: \""
        //         + findSmallestSubstring(str1, pattern1) + "\"");

        String str2 = "geeks";
        String pattern2 = "eks";
        System.out.println("Input: string = \"" + str2
                + "\", pattern = \"" + pattern2 + "\"");
        //System.out.println("Output: \""
        //        + findSmallestSubstring(str2, pattern2) + "\"");

        String input = "krishna swamy";

        //char ch[] = input.toCharArray();

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {

            list.add(input.charAt(i));
        }

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            {
                if (list.get(i) == 'a') {
                    count++;
                }

            }


        }
        System.out.println(count + " number of times character a is repeated");
    }






}
