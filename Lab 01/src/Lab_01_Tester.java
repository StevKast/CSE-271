//Steven Kast - kastsm
//Dr. Bravo, CSE 271 F
//Lab 01

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Lab_01_Tester {

	public static void main(String[] args) throws Exception {
		PrintWriter write = new PrintWriter(new File("Labs_01_nums.txt"));
		
		//Part 1 - Swapping and Sorting
		int[] array = Lab_01_ArrayUtilities.buildIntArray(20, 10, 29);
		int oddCount = 0;
		int consonantCount = 0;
		int vowelCount = 0;
		int otherCount = 0;
		
		System.out.println(Arrays.toString(array));
		write.println(Arrays.toString(array));

		for(int i = 0; i <= array.length - 2; i++){
			if(i % 2 == 0){
				Lab_01_ArrayUtilities.swap(array, i, i + 1);
			}		
		}
		
		System.out.println(Arrays.toString(array));
		write.println(Arrays.toString(array));
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		write.println(Arrays.toString(array));
		
		write.close();
		
		//Part 2 - Counts odd numbers
		for(int num: array){
			if(num % 2 != 0){
				oddCount++;
			}
		}
		System.out.println("Odd values: " + oddCount);
		
		//Part 3 - Counts vowels, consonants, and other chars
		Scanner in = new Scanner(new File("words.txt"));
		
		while(in.hasNext()){
			String word = in.next().toLowerCase();
			for(int count = 0; count < word.length(); count++){
				char letter = word.charAt(count);
				if(Character.isLetter(letter)){
					if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o'
							|| letter == 'u' ){
						vowelCount++;
					}else{
						consonantCount++;
					}
				}else{
					otherCount++;
				}
			}
		}
		
		System.out.printf("There were %d vowels, %d consonants, and %d other characters "
				+ "in this text file.", vowelCount, consonantCount, otherCount);
		
		in.close();
		
	}//end main

}
