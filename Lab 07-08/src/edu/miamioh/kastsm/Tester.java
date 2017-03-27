package edu.miamioh.kastsm;

public class Tester {

	public static void main(String[] args){
		
		AdminStaff admin = new AdminStaff(101, "admin@unv.edu", 60000);
		Instructor instructor = new Instructor(102, "instructor@unv.edu", 50000);
		Student student = new Student(103, "student@unv.edu", "software", 3.9);
		LectureHall hall1 = new LectureHall("Benton", 44);
		LectureHall hall2 = new LectureHall("Garland", 100);
		
		Course course1 = new Course();
		admin.assignHall(course1, hall1);
		admin.assignInstructor(course1, instructor);
		admin.enrollStudent(student, course1);
		
		Course course2 = new Course();
		admin.assignInstructor(course2, instructor);
		admin.assignHall(course2, hall2);
		
		Course course3 = new Course();
		admin.assignInstructor(course3, instructor);
		admin.assignHall(course3, hall1);
		
		System.out.println(course1.toString());
		System.out.println();
		System.out.println(instructor.viewCourses());
		
		System.out.println(hall1.getName() + " " + hall1.getCapacity());
		
	}
	
}
