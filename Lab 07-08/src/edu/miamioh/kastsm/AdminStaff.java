package edu.miamioh.kastsm;

public class AdminStaff extends Person{

	private double salary;
	
	/**
	 * Constructs an AdminStaff object. 
	 * @param id ID number of staff member.
	 * @param email Staff email address.
	 * @param salary Salary of the staff member.
	 */
	public AdminStaff(int id, String email, double salary){
		super(id, email);
		this.salary = salary;
	}

	/**
	 * Returns the AdminStaffs salary.
	 * @return Salary of the AdminStaff.
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Sets the salary for the AdminStaff.
	 * @param salary Salary to be set.
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/**
	 * Enrolls a student in a course.
	 * @param student Student to be enrolled in the course.
	 * @param course Course student will be enrolled in.
	 */
	public void enrollStudent(Student student, Course course){
		student.addCourse(course);
		course.addStudent(student);
	}
	
	/**
	 * Assigns a hall to a course.
	 * @param course Course to be assigned to a hall.
	 * @param hall Hall where course will be assigned.
	 */
	public void assignHall(Course course, LectureHall hall){
		course.setHall(hall);
	}
	
	/**
	 * Assigns an instructor to a course.
	 * @param course Course where instructor will be assigned.
	 * @param instructor Instructor to be assigned.
	 */
	public void assignInstructor(Course course, Instructor instructor){
		course.setInstructor(instructor);
	}
}
