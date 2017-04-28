package edu.miamioh.kastsm;

//Steven Kast
//CSE 271, Dr. Bravo
//Lab 12

public class SelectionSorter {
	
	
	/**
	 * Sorts an array high to low
	 * @param array Array to be sorted
	 */
	public static void sort(int[] array){
		for(int i = 0; i < array.length - 1; i++){
			int maxPos = maximumPostiton(array, i);
			ArrayUtil.swap(array, maxPos, i);
		}
	}
	
	/**
	 * Find the position of the maximum value of an array
	 * @param array Array to be sorted from
	 * @param from Start position of the unsorted array
	 * @return position in the array with the maximum value
	 */
	private static int maximumPostiton(int[] array, int from){
		int maxPos = from;
		for(int i = from + 1; i < array.length; i++){
			if(array[i] > array[maxPos]) {
				maxPos = i;
			}
		}
		return maxPos;
	}
}
