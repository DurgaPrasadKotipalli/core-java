package com.se.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacters {

    public static void main(String[] args) {
        String str = "my name is Raju";
        System.out.println(NonRepeatingCharacters.secondNonRepeatingCharacter(str));
        List<Integer> list= Arrays.asList(1, 2,2, 3,4,4,5,6,6,7,8,9);
        System.out.println(NonRepeatingCharacters.findNonRepeatingNumbers(list));

    }

    public static Character secondNonRepeatingCharacter(String input){
        return input.chars()
                 .mapToObj(i->Character.toLowerCase(Character.valueOf((char)i)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry ->entry.getValue()==1)
                .map(entry->entry.getKey())
                .skip(1)
                .findFirst()
                .get();
    }

    public static List<Integer> findNonRepeatingNumbers(List<Integer> nums){
        return nums.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry ->entry.getValue() == 1)
                .map(entry ->entry.getKey())
                .collect(Collectors.toList());

    }
}
