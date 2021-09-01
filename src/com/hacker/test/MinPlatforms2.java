package com.hacker.test;

import java.util.Arrays;

public class MinPlatforms2 {

	public static void main(String[] args) {
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1020, 1130, 1900, 2000 };
        int n = arr.length;
        System.out.println("Minimum Number of Platforms Required = "
                           + findMinPlatforms(arr, dep));

	}
	
	public static int findMinPlatforms(int[] arrival, int[] departure)
    {
        // sort arrival time of trains
        Arrays.sort(arrival);
 
        // sort departure time of trains
        Arrays.sort(departure);
        
        //int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        //int dep[] = { 910, 1020, 1130, 1200, 1900, 2000 };
 
        // maintains the count of trains
        int count = 0;
 
        // stores minimum platforms needed
        int platforms = 0;
 
        // take two indices for arrival and departure time
        int i = 0, j = 0;
 
        // run till all trains have arrived
        while (i < arrival.length)
        {
            // if a train is scheduled to arrive next
            if (arrival[i] < departure[j])
            {
                // increase the count of trains and update minimum
                // platforms if required
                platforms = Integer.max(platforms, ++count);
 
                // move the pointer to the next arrival
                i++;
            }
 
            // if the train is scheduled to depart next i.e.
            // `departure[j] < arrival[i]`, decrease trains' count
            // and move pointer `j` to the next departure.
 
            // If two trains are arriving and departing simultaneously,
            // i.e., `arrival[i] == departure[j]`, depart the train first
            else {
                count--;
                j++;
            }
        }
 
        return platforms;
    }
 
   

}
