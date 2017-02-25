//Steven Kast, kastsm
//CSE 271, Dr Bravo
//February 23, 2017
//Lab 05, Using Classes

public class TesterPart2 {

	public static void main(String[] args){
		Employee emp = new Employee("Employee", 10000);
		System.out.println(emp.toString());
		
		Manager man = new Manager("Manager", 20000, "IT");
		System.out.println(man.toString());
		
		Executive exe = new Executive("Executive", 400000, "IT", "Main St");
		System.out.println(exe.toString());
	}
}
