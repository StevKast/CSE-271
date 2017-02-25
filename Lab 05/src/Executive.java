//Steven Kast, kastsm
//CSE 271, Dr Bravo
//February 23, 2017
//Lab 05, Using Classes

public class Executive extends Manager{
	private String office;
	
	//Constructors
	public Executive(String name, int salary, String department, String office){
		super(name, salary, department);
		this.office = office;
	}
	//End constructors

	//Getters and setters
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}
	//End getters and setters
	
	public String toString(){
		return super.toString() + getOffice();
	}
	

}
