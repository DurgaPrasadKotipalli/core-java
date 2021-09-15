package com.se.strings;

import java.util.Arrays;
import java.util.List;

/*
Given an input string and a dictionary of words, find out if the input string can be segmented
into a space-separated sequence of dictionary words. See following examples for more details.
Input:
s = "catsandog"
wordDict = ["cats", "dog", "sand", "and", "cat"]
Output:

Input:
s = "catsanddog"
Output:
[
  "cats and dog",
  "cat sand dog"
]
ref : https://www.techiedelight.com/word-break-problem/
 */
public class WordBreakProblem {
    public static void main(String[] args)
    {
        // List of strings to represent a dictionary
        List<String> dict = Arrays.asList("this", "th", "is", "famous",
                "Word", "break", "b", "r", "e", "a", "k",
                "br", "bre", "brea", "ak", "problem");

        // input string
        String str = "Wordbreakproblem";

        wordBreak(dict, str, "");
    }

    public static void wordBreak(List<String> dict, String str, String out){

        if(str.length() == 0 ){
            System.out.println(out);
            return;
        }

        for(int i=1; i<=str.length(); i++){
            String prefix = str.substring(0,i);

            if(dict.contains(prefix)){
                wordBreak(dict, str.substring(i), out+" "+prefix);
            }
        }
    }
}
