package com.regular;

public class ArmStrongNumber {
    public static void main(String[] args) {
         int num = 153;
         System.out.println("is "+num+" armstrong number? "+isArmStrong(num));
    }

    public static boolean isArmStrong(int n){
        int sum = 0;
        int temp = n;
        while(n != 0){
            int rem = n%10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        return (temp == sum);
    }
}
