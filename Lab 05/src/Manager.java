//Steven Kast, kastsm
//CSE 271, Dr Bravo
//February 23, 2017
//Lab 05, Using Classes

public class Manager extends Employee{
	private String department;
	
	//Constructors
	public Manager(String name, int salary, String department){
		super(name,salary);
		this.department = department;
	}
	//End constructors

	//Getters and setters
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	//End getters and setters
	
	public String toString(){
		return super.toString() + getDepartment();
	}
	
	
	
}
