package com.se.arrays;

public class RemoveDuplicates {

	public static int removeDuplicate(int[] arrNumbers, int num) {
		if (num == 0 || num == 1) {
			return num;
		}
		int[] arrTemporary = new int[num];
		int b = 0;
		for (int a = 0; a < num - 1; a++) {
			if (arrNumbers[a] != arrNumbers[a + 1]) {
				arrTemporary[b++] = arrNumbers[a];
			}
		}
		arrTemporary[b++] = arrNumbers[num - 1];
		for (int a = 0; a < b; a++) {
			arrNumbers[a] = arrTemporary[a];
		}
		return b;
	}

	public static void main(String[] args) {
		int[] arrInput = { 1, 2, 3, 3, 4, 4, 4, 5};
		int len = arrInput.length;
		len = removeDuplicate(arrInput, len);
		// printing elements
		for (int a = 0; a < len; a++) {
			System.out.print(arrInput[a] + " ");
		}
	}
}