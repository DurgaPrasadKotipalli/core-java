package com.regular;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Trailing Zeros in factorial of " + num + " is::" + trailingZeroes(num));
    }

    public static int trailingZeroes(int n) {
        if (n < 0) {
            return -1;
        }
        int count = 0;

        for (int i = 5; n / i >= 1; i *= 5) {
            count = count + n / i;
        }
        return count;
    }
}

