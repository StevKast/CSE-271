package edu.miamioh.kastsm;

public class LectureHall {

	private String name;
	private int capacity;
	
	/**
	 * Constructs a LectureHall object.
	 * @param name Name of lecture hall
	 * @param capacity Maximum capacity of lecture hall
	 */
	public LectureHall(String name, int capacity){
		this.name = name;
		this.capacity = capacity;
	}

	/**
	 * Returns the name of the lecture hall.
	 * @return name of the lecture hall.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the lecture hall.
	 * @param name name of the lecture hall.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the lecture hall capacity.
	 * @return lecture hall capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * Sets the capacity of the lecture hall.
	 * @param capacity capacity of the lecture hall.
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	
}
