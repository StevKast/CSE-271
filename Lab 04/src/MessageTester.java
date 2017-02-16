//Steven Kast, kastsm
//CSE 271, Dr Bravo
//February 16, 2017
//Lab 04, Using Classes

public class MessageTester {

	public static void main(String[] args) {
		
		Message message = new Message("user 1", "user 2");
		
		message.append("Line 1");
		message.append("Line 2");
		message.append("Line 3");
		
		System.out.println("---Expected---\nFrom: user 1\nTo: user 2 \nLine 1 \nLine 2 \nLine 3");
		System.out.println("---Actual--- \n" +  message.toString());
		
	}

}
