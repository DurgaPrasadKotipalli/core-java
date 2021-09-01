package com.hacker.test;

import java.util.*;

public class MaxMeetings {

	public static void main (String[] args)
	{
	     
	    // Starting time
	    Integer s[] = { 6, 1, 2, 3};
	     
	    // Finish time
	    Integer f[] = { 8, 9, 4, 7 };  
	    
	    int maxPresentations =  maxMeeting(Arrays.asList(s), Arrays.asList(f));
	   
	   System.out.println("Max presentations :: "+maxPresentations);
	}
	
	
	public static int maxMeeting(List<Integer> s, List<Integer> f)
	{
		
		// Defining an arraylist of meet type
	    ArrayList<meeting> meet = new ArrayList<>();
	    for(int i = 0; i < s.size(); i++) {
	     
	        // Creating object of meeting
	        // and adding in the list
	        meet.add(new meeting(s.get(i), f.get(i), i));
	    }
	     
	    // Initialising an arraylist for storing answer
	    ArrayList<Integer> max = new ArrayList<>();
	     
	    int time_limit = 0;
	     
	    mycomparator mc = new mycomparator();
	    
	    System.out.println(meet);
	     
	    // Sorting of meeting according to
	    // their finish time.
	    //Collections.sort(meet, mc);
	    meet.sort(Comparator.comparing(meeting::getEnd));
	    
	    System.out.println(meet);
	     
	    // Initially select first meeting.
	    max.add(meet.get(0).pos);
	     
	    // time_limit to check whether new 
	    // meeting can be conducted or not.
	    time_limit = meet.get(0).end;
	     
	    // Check for all meeting whether it 
	    // can be selected or not.
	    for(int i = 1; i < meet.size(); i++)
	    {
	        if (meet.get(i).start >= time_limit)
	        {
	             
	            // Add selected meeting to arraylist
	        	max.add(meet.get(i).pos);
	             
	            // Update time limit
	            time_limit = meet.get(i).end;
	        }
	    }
	     
	    // Print final selected meetings.
	     for(int i = 0; i < max.size(); i++)
	        System.out.print(max.get(i) + 1 + " ");
	     
	     System.out.println();
	     return max.size();
	}
}


class meeting
{
    int start;
    int end;
    int pos;
     
    meeting(int start, int end, int pos)
    {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
    
    

	public int getEnd() {
		return end;
	}

    @Override
	public String toString() {
		return "meeting [start=" + start + ", end=" + end + ", pos=" + pos + "]";
	}    
}

class mycomparator implements Comparator<meeting>
{
    @Override
    public int compare(meeting o1, meeting o2)
    {
        if (o1.end < o2.end)
        {
             
            // Return -1 if second object is
            // bigger then first
            return -1;
        }
        else if (o1.end > o2.end)
         
            // Return 1 if second object is
            // smaller then first
            return 1;
             
        return 0;
    }
}
