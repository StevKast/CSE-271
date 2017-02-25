//Steven Kast, kastsm
//CSE 271, Dr Bravo
//February 16, 2017
//Lab 04, Using Classes

public class MailboxTester {

	public static void main(String[] args) {
		Mailbox box = new Mailbox("End of message");
		
		Message mess1 = new Message("user 1 sent", "user 2 receive");
		mess1.append("mess1");
		
		box.addMessage(mess1);

		System.out.println("---Expected--- \nFrom: user 1 sent\nTo: user 2 receive\nmess1\nEnd of message");
		System.out.println("---Actual---\n" + box.getMessage(0));
		
		box.removeMessage(0);
		
		System.out.println("---Expected---\nIndex out of bounds!\nnull");
		System.out.println("---Actual---");
		System.out.println(box.getMessage(0));
		
		
		
	}

}
