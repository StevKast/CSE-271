//Steven Kast, kastsm
//CSE 271, Dr Bravo
//February 16, 2017
//Lab 04, Using Classes

import java.util.ArrayList;

public class Mailbox {

	private ArrayList<Message> storage;
	private String signature;

	//Constructors
	public Mailbox(String signature){
		this.signature = signature;
	}
	//End constructors

	//Start Methods
	public void addMessage(Message m){
		m.append(signature);
		storage.add(m);
	}

	public Message getMessage(int i){
		return storage.get(i);
	}
	
	public void removeMessage(int i){
		storage.remove(i);
	}
	//End methods

}