//Steven Kast, kastsm
//CSE 271, Dr Bravo
//February 23, 2017
//Lab 05, Using Classes

public class Tester {

	public static void main(String[] args){
		Person gen = new Person("gen", 2017);
		System.out.println(gen.getName());
		System.out.println(gen.getYearOfBirth());
		System.out.println(gen.toString());
		
		Student stu = new Student("SF", "stu", 1023);
		System.out.println(stu.toString());
		
		Instructor ins = new Instructor(55, "ins", 9999);
		System.out.println(ins.toString());
	}
}
