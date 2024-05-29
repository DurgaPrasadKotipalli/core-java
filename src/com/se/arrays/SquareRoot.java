package com.se.arrays;

public class SquareRoot {

    public static void main(String[] args) {
        int x = 27;
        int squareRoot = squareRoot(x);
        System.out.println("Square root of "+x+" is "+squareRoot);
        System.out.println("Math.sqrt---"+Math.sqrt(x));
        System.out.println("-----"+sqrt(x, 1, x/2));
    }



    public static int squareRoot(int x)
    {
        // Base Cases
        if (x == 0 || x == 1)
            return x;

        // Do Binary Search for floor(sqrt(x))
        long start = 1, end = x / 2, ans = 0;
        long mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;

            // If x is a perfect square
            if (mid * mid == x)
                return (int)mid;

            // Since we need floor, we update answer when
            // mid*mid is smaller than x, and move closer to
            // sqrt(x)
            if (mid * mid < x) {
                start = mid + 1;
                ans = mid;
            }
            else // If mid*mid is greater than x
                end = mid - 1;
        }
        System.out.println("mid------------- "+mid);
        return (int)ans;
    }

    static int sqrt(int n,int start,int end) {
        int ans =0;
        if(n==0) {
            return 0;
        }
        int mid = 0;
        while(start<=end) {//4<4
            mid=(start+end)/2;//9/2=4
            if(mid*mid==n) {//16==11
                return mid;
            }
            if(mid*mid<n) {//16<11
                start=mid+1;//start=4

            }else {
                end=mid-1;//end=4
            }
        }
        return mid-1;//3
    }
}
