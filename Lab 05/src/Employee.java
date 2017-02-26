//Steven Kast, katsm
//CSE 271, Dr Bravo
//February 23, 2017
//Lab 05, Using Classes

public class Employee {
	private String name;
	private int salary;

	//Constructors
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	//End constructors

	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if(salary >= 0){
			this.salary = salary;
		}
	}
	//End getters and setter

	public String toString(){
		return "Name: " + getName() + " Salary: " + getSalary();
	}


}
