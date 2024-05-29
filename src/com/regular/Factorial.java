package com.regular;

public class Factorial {

    public static void main(String[] args) {
        int num = 10;
        System.out.println("factorial of "+num+" is::"+factorial(num));

    }

    public static int factorial(int n){
        int fact =1;
        for(int i=1;i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
}
