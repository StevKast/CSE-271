//Steven Kast, kastsm
//CSE 271, Dr Bravo
//February 23, 2017
//Lab 05, Using Classes

public class Instructor extends Person{
	private int salary;
	
	//Constructors
	public Instructor(String name, int yearOfBirth, int salary){
		super(name, yearOfBirth);
		this.salary = salary;
	}
	//End constructors

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString(){
		return super.toString() + "\nSalary: " + salary;
	}
}
