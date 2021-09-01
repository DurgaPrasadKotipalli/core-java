package com.ds.bt;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class BalancedSymbol {

	static boolean isBalanced(String expr)
    {
        Deque<Character> stack = new ArrayDeque<>();
 
        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                continue;
            }
 
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        return (stack.isEmpty());
    }
 
    public static void main(String[] args)
    {
    	try (Scanner source = new Scanner(System.in)) {
			System.out.println("Enter your input ::");
			
			//String expr = source.nextLine();
			
			String expr = "([{}])";
 
			if (isBalanced(expr))
			    System.out.println("Balanced ");
			else
			    System.out.println("Not Balanced ");
			
			
		
		
		}
    }

}
