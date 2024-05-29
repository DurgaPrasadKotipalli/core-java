package com.ds.bt;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.se.inheritance.B;


import java.math.BigDecimal;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Stream.*;
import static java.util.stream.Collectors.*;

class Base implements Comparable {
    public String name;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Base{" +
                "name='" + name + '\'' +
                '}';
    }
}


public class Test {
    public static void main(String[] args) {


      List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
      List<Integer> output = list.stream().collect(Collectors.toList());
        System.out.println(output);


    }


}








