package com.se.strings;

import java.util.HashMap;

public class MaxDistanceInArray {

    public static void main(String[] args) {
        String input = "Hello world";
        System.out.println("max distance of same char "+maxDistanceOfChars(input));
    }


    public static int maxDistanceOfChars(String value){
        // Used to store element to first index mapping
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> distanceMap = new HashMap<>();

        // Traverse elements and find maximum distance between
        // same occurrences with the help of map.
        int max_dist = 0;

        for (int i = 0; i < value.length(); i++) {
            // If this is first occurrence of element, insert its
            // index in map
            if (!map.containsKey(value.charAt(i))) {
                map.put(value.charAt(i), i);
                distanceMap.put(value.charAt(i), 0);
            } else {
                max_dist = Math.max(max_dist, i - map.get(value.charAt(i)));
                distanceMap.put(value.charAt(i), max_dist);
            }
        }
        System.out.println(map);
        return max_dist;
    }
}
