//Steven Kast, kastsm
//CSE 271, Dr Bravo
//February 23, 2017
//Lab 05, Using Classes

public class Student extends Person{
	
	private String major;
	
	public Student(String major, String name, int yearOfBirth){
		super(name, yearOfBirth);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString(){
		return getName() + getYearOfBirth() + major;
	}
}
