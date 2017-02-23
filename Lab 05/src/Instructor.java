//Steven Kast, kastsm
//CSE 271, Dr Bravo
//February 23, 2017
//Lab 05, Using Classes

public class Instructor extends Person{
	private int salary;
	
	//constructors
	public Instructor(int salary, String name, int yearOfBirth){
		super(name, yearOfBirth);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString(){
		return getName() + getYearOfBirth() + salary;
	}
}
