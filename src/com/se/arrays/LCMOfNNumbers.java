package com.se.arrays;

public class LCMOfNNumbers {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 8, 15, 3, 7};
        lcm(a);
    }

    public static void lcm(int a[]) {

        int divisor = 2;
        int lcm = 1;
        while (true) {
            boolean isDivisible = false;
            int count=0;
            for (int i = 0; i < a.length; i++) {
                if(a[i] == 1){
                    count++;
                }
                if (a[i] % divisor == 0) {
                    isDivisible = true;
                    a[i] = a[i] / divisor;
                }
            }
            if (isDivisible) {
                lcm = lcm * divisor;
            } else {
                divisor++;
            }
            if(count == a.length){
                break;
            }

        }//while
        System.out.println("lcm "+lcm);
    }
}
