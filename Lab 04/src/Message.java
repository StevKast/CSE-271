//Steven Kast, kastsm
//CSE 271, Dr Bravo
//February 16, 2017
//Lab 04, Using Classes

public class Message {
	
	private String sender;
	private String receiver;
	private String message;
	private static final String FROM = "From: ";
	private static final String TO = "\nTo ";
	
	//Constructor
	public Message(String sender, String receiver){
		this.sender = sender;
		this.receiver = receiver;
		message = "";
	}
	//End constructor

	//Methods
	@Override
	public String toString() {
		return FROM + sender + TO + receiver + "\n" + message + "\n";
	}
	
	public void append(String message){
		this.message += message + "\n";
	}
	//end Methods
	
}
