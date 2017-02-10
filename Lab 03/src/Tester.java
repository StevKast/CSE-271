import java.util.Scanner;

public class Tester {
	
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int houseNumber;
		String street;
		int aptNum;
		String city;
		String state;
		int zipCode;
		
		System.out.print("Enter house number ");
		houseNumber = in.nextInt();
		
		System.out.print("Enter street ");
		street = in.next();
		
		System.out.print("Enter aptNum ");
		aptNum = in.nextInt();
		
		System.out.print("Enter city ");
		city = in.next();
		
		System.out.print("Enter state ");
		state = in.next();
		
		System.out.print("Enter zipCode ");
		zipCode = in.nextInt();
		
		Address place = new Address(houseNumber, street, aptNum, city, state, zipCode);
		
		System.out.print("Enter new zipCode ");
		zipCode = in.nextInt();
		
		Address other = new Address(houseNumber, street, city, state, zipCode);
		
		System.out.println(place.printAddress());
		System.out.println(place.comesBefore(other));
		
		System.out.println("Address check ... done");
		
		
		
	}
}
