//Steven Kast, kastsm
//CSE 271, Dr Bravo
//February 16, 2017
//Lab 04, Using Classes

import java.util.ArrayList;

public class Mailbox {

	private ArrayList<Message> storage;
	private final String SIGNATURE;

	//Constructors
	public Mailbox(String signature){
		this.SIGNATURE = signature;
		storage = new ArrayList<Message>();
	}
	//End constructors

	//Start Methods
	public void addMessage(Message m){
		m.append(SIGNATURE);
		storage.add(m);
	}

	public Message getMessage(int i) throws IndexOutOfBoundsException{
		try{
			return storage.get(i);
		}
		catch(IndexOutOfBoundsException exception){
			System.out.println("Index out of bounds!");
		}
		return null;
	}
	
	public void removeMessage(int i){
		storage.remove(i);
	}
	//End methods

}