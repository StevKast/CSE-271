package edu.miamioh.kastsm;

import java.util.Arrays;

//Steven Kast, kastsm
//Dr. Bravo
//CSE 271 Section F
//Lab 11


public class RecursiveFinder {
	
	public static void main(String args[]){
		int[] testArray1 = {1, 2, 5, 4};
		int[] testArray2 = {-1, 1, -10, 1, 1, 1, 0};
		int[] testArray3 = {1000, 3000, Integer.MAX_VALUE, Integer.MIN_VALUE};
		
		System.out.println(largestElement(testArray1));
		System.out.println(largestElement(testArray2));
		System.out.println(largestElement(testArray3));
	}
	
	
	/**
	 * Finds the largest element in the array.
	 * @param array Input array of integers.
	 * @return Returns the largest element in the array.
	 */
	public static int largestElement(int[] array){		
		if(array.length == 1){
			return array[0];
		}else{
			int last = array[array.length - 1];
			int max = largestElement(Arrays.copyOf(array, array.length - 1));
			return Math.max(last, max);
		}
		
	}
}
