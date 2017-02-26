//Steven Kast, kastsm
//CSE 271, Dr Bravo
//February 23, 2017
//Lab 05, Using Classes

public class TesterPart1 {

	public static void main(String[] args){
		System.out.println("Expected:");
		System.out.println("Name: Generic Year: 2017");
		
		System.out.println("Actual:");
		Person gen = new Person("Generic", 2017);;
		System.out.println(gen.toString());
		
		System.out.println("Expected:");
		System.out.println("Name: Student Year: 2017 Major: CSE");
		
		System.out.println("Actual: ");
		Student stu = new Student("Student", 2017, "CSE");
		System.out.println(stu.toString());
		
		System.out.println("Expected:");
		System.out.println("Name: Instuctor Year: 2017 Salary: 40000");
		
		System.out.println("Actual:");
		Instructor ins = new Instructor("Instructor", 2017, 40000);
		System.out.println(ins.toString());
		
	}
}
