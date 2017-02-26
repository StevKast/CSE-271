//Steven Kast, kastsm
//CSE 271, Dr Bravo
//February 23, 2017
//Lab 05, Using Classes

public class TesterPart2 {

	public static void main(String[] args){
		System.out.println("Expected:");
		System.out.println("Name: Employee Salary: 10000");
		
		System.out.println("Actual:");
		Employee emp = new Employee("Employee", 10000);
		System.out.println(emp.toString());
		
		System.out.println("Expected:");
		System.out.println("Name: Manager Salary: 20000 Department: IT");
		
		System.out.println("Actual:");
		Manager man = new Manager("Manager", 20000, "IT");
		System.out.println(man.toString());
		
		System.out.println("Expected:");
		System.out.println("Name: Executive Salary: 400000 Department: IT Office: Main St");

		System.out.println("Actual:");
		Executive exe = new Executive("Executive", 400000, "IT", "Main St");
		System.out.println(exe.toString());
	}
}
