package com.se.strings;

// Java program to find the smallest
// number greater than N, the sum of whose digits is twice as big as the sum of digits of N
class TwiceOfSumOfDigits {

	// Function to get sum of digits
	static int getSum(int n)
	{
		int sum = 0;
		while (n != 0)
		{
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}

	// Function to find the smallest
    // number whose sum of digits is also N
	public void smallestNumber(int N)
	{
		int sum = getSum(N);
		System.out.println("sum ::"+sum);
        int i = N+1;
		while (1 != 0)
		{
			// Checking if number has
			// sum of digits = N
			if (getSum(i) == sum*2)
			{
				System.out.print(i);
				break;
			}
			i++;
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		int N = 99;
		TwiceOfSumOfDigits t = new TwiceOfSumOfDigits();
		t.smallestNumber(N);

	}
}

