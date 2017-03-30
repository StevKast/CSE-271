package edu.miamioh.kastsm;

import java.util.ArrayList;

public class Instructor extends Person{

	private double salary;
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	/**
	 * Constructs an Instructor object with an imported list of courses being taught.
	 * @param id Instructors ID number.
	 * @param email Instructors email address.
	 * @param salary Instructors salary.
	 * @param courses List of classes the instructor is teaching. 
	 */
	public Instructor(int id, String email, int salary, ArrayList<Course> courses) {
		super(id, email);
		this.salary = salary;
		this.courses = courses;
	}
	
	/**
	 * Constructs an Instructor object.
	 * @param id Instructors ID number.
	 * @param email Instructors email address.
	 * @param salary Instructors salary.
	 */
	public Instructor(int id, String email, int salary) {
		super(id, email);
		this.salary = salary;
	}
	
	/**
	 * Returns the instructors salary.
	 * @return the instructors salary.
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Sets the instructors salary.
	 * @param salary salary of the instructor.
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/**
	 * Returns the list of courses the instructor is teaching.
	 * @return list of courses the instructor is teaching.
	 */
	public ArrayList<Course> getCourses() {
		return courses;
	}

	/**
	 * Sets the list of courses the instructor is teaching.
	 * @param courses list of courses the instructor is teaching.
	 */
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	/**
	 * Modifies a students GPA.
	 * @param student Student to be modified.
	 * @param GPA Value to change the GPA.
	 */
	public void modifyGPA(Student student, double GPA){
		student.setGPA(GPA);
	}
	
	/**
	 * View the list of courses the instructor is teaching.
	 * @return List of courses being taught.
	 */
	public String viewCourses(){
		String temp = "";
		for(Course course: courses){
			temp += course.toString() + "\n";
		}
		return temp;
	}
	
	/**
	 * Adds a course to the list of courses being taught.
	 * @param course Course to be added to the list.
	 */
	public void addCourse(Course course){
		courses.add(course);
	}
	
}
