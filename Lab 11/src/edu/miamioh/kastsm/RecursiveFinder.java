package edu.miamioh.kastsm;

import java.util.Arrays;

public class RecursiveFinder {
	
	public static void main(String args[]){
		int[] testArray1 = {1, 2, 5, 4};
		
		System.out.println(largestElement(testArray1));
	}
	
	public static int largestElement(int[] array){
		System.out.println(array.length);
		
		if(array.length == 1){
			System.out.println("End");
			return array[0];
		}else{
			int last = array[array.length - 1];
			int max = largestElement(Arrays.copyOf(array, array.length - 1));
			return Math.max(last, max);
		}
		
	}
}
