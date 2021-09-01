package com.se.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
//BiPredicate is a functional interface which accepts two arguments and returns boolean.
//syntax 
/*
 * @FunctionalInterface
 * public interface BiPredicate<T, U>{
 *     boolean test(T t, U u);
 *     }
 */
public class PredicateExample {

	public static void main(String[] args) {

        BiPredicate<String, Integer> filter = (x, y) -> {
            return x.length() == y;
        };

        boolean result = filter.test("mkyong", 6);
        System.out.println(result);  // true

        boolean result2 = filter.test("java", 10);
        //System.out.println(result2); 
        
        
        Predicate<String> lengthIs3 = x -> x.length() == 3;
        Predicate<String> startWithA = x -> x.startsWith("A");

        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        List<String> collect = list.stream()
                .filter(lengthIs3.or(startWithA))
                .collect(Collectors.toList());

       // System.out.println(collect);
        
        Optional<Integer> canBeEmpty1 = Optional.ofNullable(null);
        System.out.println(canBeEmpty1);

	}

}
