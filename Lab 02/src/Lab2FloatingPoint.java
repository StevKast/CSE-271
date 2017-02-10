//Steven Kast
//CSE 271 F - Dr. Bravo
//Lab 02

import java.util.Scanner;

public class Lab2FloatingPoint {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float input;
		float sum = 0f; 
		boolean failCheck1 = false;
		boolean failCheck2 = false;
		

		while(!failCheck2){
			
			try{
				input = Float.parseFloat(in.next());
				sum += input;
				failCheck1 = false; //Resets possibility of consecutive failures.
			}//end try
			
			catch(NumberFormatException exception){
				if(failCheck1){ //Checks if user has entered input wrong before.
					failCheck2 = true;
				}
				failCheck1 = true;
			}//end catch
		}

		System.out.println("Final sum = " + sum);
	}//end main
}//end class
