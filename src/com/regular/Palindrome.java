package com.regular;

public class Palindrome {

    public static void main(String[] args) {
        int num = 1534236469;
        System.out.println("Palindrome of "+num+" is::"+isPalindrome(num));
    }

    public static boolean isPalindrome(int x) {

        if(x <0){
            return false;
        }

        int sum =0;
        int temp = x;
        while(x >0){
            int rem = x%10;
            sum = sum*10 + rem;
            x = x/10;
        }
        return sum==temp;
    }
}
