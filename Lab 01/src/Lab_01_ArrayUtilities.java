//Steven Kast - kastsm
//Dr. Bravo, CSE 271 F
//Lab 01

public class Lab_01_ArrayUtilities {

	//Builds an array filled with random numbers with each number having a min of
	//fromNum and a max of toNum. The length parameter is the length of the array
	public static int[] buildIntArray(int length, int fromNum, int toNum){
		int[] array = new int[length];
		for(int i = 0; i < length; i++){
			array[i] = (int)(Math.random() * (toNum + 1 - fromNum) + fromNum);
		}
		return array;
		
	}//end buildIntArray

	//Swaps to ints in an array
	public static void swap(int[] nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}//end swap
	
}//end class
