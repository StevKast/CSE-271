package edu.miamioh.kastsm;

public class Person {

	private int id;
	private String email;
	
	/**
	 * Constructs a Person object.
	 * @param id ID number of person.
	 * @param email Email address of person.
	 */
	public Person(int id, String email){
		this.id = id;
		this.email = email;
	}
	
	/**
	 * Returns the persons ID number.
	 * @return ID number of the person.
	 */
	public int getId() {
		return id;
	}
	/**
	 * Sets a persons ID number.
	 * @param id Persons ID number.
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Returns a persons email address.
	 * @return email address of the person.
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Sets the email address of the person.
	 * @param email email address of the person.
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
