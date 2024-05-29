package com.se.java8;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28);

        //List<Integer> primeNumbers = numbers.stream().filter(x ->PrimeNumbers.isPrimeNumber(x)).collect(Collectors.toList());
        List<Integer> primeNumbers = primeNumbers(numbers);
        System.out.println(primeNumbers);
    }

    public static List<Integer> primeNumbers(List<Integer> list) {
        return list.stream()
                .filter(i -> BigInteger.valueOf(i).isProbablePrime(1))
                .collect(Collectors.toList());
    }

    public static boolean isPrimeNumber(int number){

        if(number ==0 || number ==1){
            return false;
        }
        for(int i=2; i<=number/2; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }

}
