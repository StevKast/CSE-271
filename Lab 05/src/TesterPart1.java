//Steven Kast, kastsm
//CSE 271, Dr Bravo
//February 23, 2017
//Lab 05, Using Classes

public class TesterPart1 {

	public static void main(String[] args){
		Person gen = new Person("Generic", 2017);;
		System.out.println(gen.toString());
		
		Student stu = new Student("Student", 2017, "CSE");
		System.out.println(stu.toString());
		
		Instructor ins = new Instructor("Instructor", 2017, 40000);
		System.out.println(ins.toString());
		
	}
}
