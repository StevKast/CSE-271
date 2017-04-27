package edu.miamioh.kastsm;

public class SelectionSorter {
	
	public static void sort(int[] array){
		
		for(int i = 0; i < array.length - 1; i++){
			int maxPos = maximumPostiton(array, i);
			ArrayUtil.swap(array, maxPos, i);
		}
	}
	
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
