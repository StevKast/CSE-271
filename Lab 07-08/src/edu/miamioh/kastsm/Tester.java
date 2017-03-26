package edu.miamioh.kastsm;

public class Tester {

	public static void main(String[] args){
		AdminStaff admin = new AdminStaff(0001, "admin@unv.edu", 60000);
		Instructor instructor = new Instructor(0002, "instructor@unv.edu", 50000);
		Student student = new Student(0003, "student@unv.edu", "software", null, 3.9);
		LectureHall hall = new LectureHall("Benton", 44);
		
		Course course1 = new Course(instructor, hall, null);
		Course course2 = new Course(instructor, hall, null);
		Course course3 = new Course(instructor, hall, null);
		
		
		instructor.addCourse(course1);
		System.out.println(instructor.viewCourses());

		
	}
	
}
