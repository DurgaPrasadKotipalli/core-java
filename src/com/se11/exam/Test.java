package com.se11.exam;

import java.util.Stack;

public class Test {

    public static void main(String[] args) {

        String str1 = "capsule";
        String str2 = "capture";

        int arr[] = {10, 5, 6, 3, 2, 20, 100, 80};

        int newArry[]=new int[arr.length];

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
                newArry[i]=arr[i];
            else
                newArry[i]=arr[i+1];

        }

        for(int i=0; i<newArry.length; i++){
            System.out.print(" "+newArry[i]);
        }
       



    }

    public static int findDifference(String str1, String str2) {
        int count = 0;

        if(str1.length()== str2.length()){
            for(int i=0; i<str1.length(); i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    count++;
                }
            }
        }
        if(str1.length() != str2.length() ){
           int high = str1.length()>str2.length() ? str1.length() : str2.length();
           int low = str1.length()>str2.length() ? str2.length() : str1.length();

           for(int i=0; i<low; i++){
               if(str1.charAt(i) != str2.charAt(i)){
                   count++;
               }
           }
           count += high-low;

        }
        return count;


    }


}
