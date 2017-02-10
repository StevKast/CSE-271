//Steven Kast
//CSE 271 F - Dr. Bravo
//Lab 02

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Lab2InputOutput {

	public static void main (String[] args) throws FileNotFoundException{

		System.out.print(args[0]);
		
		Scanner read = new Scanner(new File(args[0]));
		Scanner in = new Scanner(System.in);
		
		System.out.print("What do you want to name the output file?");
		String outFileName = in.next();

		PrintWriter out = new PrintWriter(new File(outFileName));
		
		//Crawls through the input file line by line sending it to a string
		//String gets reformatted and written to the output file
		int counter = 1;
		while(read.hasNextLine()){
			String currentLine = read.nextLine();
			out.println("/* " + counter + " */ " + currentLine);
			counter++;
		}
		
		read.close();
		in.close();
		out.close();
		
	}//end main
}//end Class Lab2InputOutput
