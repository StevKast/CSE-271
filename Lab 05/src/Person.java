//Steven Kast, kastsm
//CSE 271, Dr Bravo
//February 23, 2017
//Lab 05, Using super classes

public class Person {
	private String name;
	private int yearOfBirth;
	
	//Constructors
	public Person(String name, int year){
		this.name = name;
		yearOfBirth = year;
	}
	
	public Person(){
		this.name = getName();
		this.yearOfBirth = getYearOfBirth();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	public String toString(){
		return getName() + getYearOfBirth();
	}
}
