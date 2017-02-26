//Steven Kast, kastsm
//CSE 271, Dr Bravo
//February 23, 2017
//Lab 05, Using Classes

public class Student extends Person{
	
	private String major;
	
	//Constructors
	public Student(String name, int yearOfBirth, String major){
		super(name, yearOfBirth);
		this.major = major;
	}
	//End constructors

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString(){
		return super.toString() + " Major: " + major;
	}
}
