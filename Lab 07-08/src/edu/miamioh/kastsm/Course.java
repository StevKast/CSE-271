package edu.miamioh.kastsm;

import java.util.ArrayList;

public class Course {
	
	private Instructor instructor;
	private LectureHall hall;
	private ArrayList<Student> roster = new ArrayList<Student>();
	
	
	/**
	 * Constructs a Course object.
	 * @param instructor Instructor of course.
	 * @param hall Lecture hall that course will be taught.
	 * @param roster List of students in the course.
	 */
	public Course(Instructor instructor, LectureHall hall, ArrayList<Student> roster){
		this.instructor = instructor;
		this.hall = hall;
		this.roster = roster;
	}

	/**
	 * Returns the instructor teaching the course.
	 * @return instructor teaching the course.
	 */
	public Instructor getInstructor() {
		return instructor;
	}

	/**
	 * Sets the instructor teaching the course.
	 * @param instructor instructor teaching the course.
	 */
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	/**
	 * Returns the lecture hall where the course is being taught.
	 * @return Returns the lecture hall name.
	 */
	public LectureHall getHall() {
		return hall;
	}

	/**
	 * Sets the hall where the course is being taught.
	 * @param hall the lecture hall where the course is being taught.
	 */
	public void setHall(LectureHall hall) {
		this.hall = hall;
	}

	/**
	 * Returns the list of students in the course.
	 * @return the lists of students in the course.
	 */
	public ArrayList<Student> getRoster() {
		return roster;
	}

	/**
	 * Sets the list of students in the course.
	 * @param roster the list of students in the course.
	 */
	public void setRoster(ArrayList<Student> roster) {
		this.roster = roster;
	}
	
	/**
	 * Adds a student to the list of students in the course..
	 * @param student Student to be added to the course.
	 */
	public void addStudent(Student student){
		roster.add(student);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Course: instructor=" + instructor + ", hall=" + hall + ";";
	}
	
	
	
}
