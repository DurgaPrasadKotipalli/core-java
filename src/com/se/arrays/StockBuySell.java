package com.se.arrays;

public class StockBuySell {
    public static void main(String[] args) {
        int arr[] = {14, 12, 70, 15, 99, 65, 21, 90};
        System.out.println(calculateMaxProfit(arr));
    }

    public static int calculateMaxProfit(int arr[]){

        int n = arr.length;
        int maxProfit = Integer.MIN_VALUE;
        int lowestValue = arr[0];
        for(int i=0; i<arr.length; i++){
            int profit =0;
            if(arr[i] >lowestValue){
                 profit = arr[i]-lowestValue;
                 if(profit > maxProfit){
                     maxProfit = profit;
                 }
            }else{
               lowestValue = arr[i];
            }
        }

        return maxProfit;
    }
}
