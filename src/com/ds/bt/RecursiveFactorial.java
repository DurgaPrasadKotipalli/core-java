package com.ds.bt;

public class RecursiveFactorial {

    public static void main(String args[]){
        RecursiveFactorial factorial = new RecursiveFactorial();
        System.out.println(factorial.factorial(5));
    }

   public int factorial(int number){
        int result = 1;
        while(number >0){
            result = result*number;
            number--;
        }
        return result;
   }




}


