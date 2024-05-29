package com.regular;

public class PrimeNumber {
    public static void main(String[] args) {
        int n =100;
        System.out.println("Prime numbers from 1 to "+n+" are ::");
        for(int i=2; i<= n; i++){
            if(isPrimeNumber(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrimeNumber(int n){
        for(int i=2; i< n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
