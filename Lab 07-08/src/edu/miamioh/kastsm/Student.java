package edu.miamioh.kastsm;

import java.util.ArrayList;

public class Student extends Person{

	private String major;
	private ArrayList<Course> courses = new ArrayList<Course>();
	private double GPA;
	
	/**
	 * Constructs a Student object.
	 * @param id Students ID number.
	 * @param email Students email address.
	 * @param major Students major.

	 */
	public Student(int id, String email, String major) {
		super(id, email);
		this.major = major;
		GPA = 0;
	}
	
	/**
	 * Returns the students major.
	 * @return students major.
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * Sets the students major.
	 * @param major students major.
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * Returns the list of courses the student is in.
	 * @return students list of courses.
	 */
	public ArrayList<Course> getCourses() {
		return courses;
	}

	/**
	 * Sets the list of the students courses.
	 * @param courses the list of students courses.
	 */
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	/**
	 * Returns the students GPA.
	 * @return Students GPA.
	 */
	public double getGPA() {
		return GPA;
	}

	/**
	 * Sets the students GPA.
	 * @param GPA students GPA
	 */
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	/**
	 * Adds a course to the students list.
	 * @param course course to add.
	 */
	public void addCourse(Course course){
		courses.add(course);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + " " + major + " " + GPA;
	}
	
	
}
