//Steven Kast, kastsm
//CSE 271, Dr Bravo
//February 16, 2017
//Lab 04, Using Classes

import java.util.Scanner;

public class MessageTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Message message = new Message("user 1", "user 2");
		
		message.append("Line 1");
		message.append("Line 2");
		message.append("Line 3");
		message.append("Line 4");
		message.append("Line 5");
		message.append("Line 6");
		message.append("Line 7");
		
		System.out.println(message.toString());
		
	}

}
