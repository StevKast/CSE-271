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
		
		System.out.println("Start VotingMachine check ...");
		
		
		VotingMachine poll = new VotingMachine();
		
		System.out.println("Enter amount of dem votes");
		int demVotes = in.nextInt();
		System.out.println("Enter amount of rep votes");
		int repVotes = in.nextInt();
		
		for(int i = 0; i < demVotes; i++){
			poll.voteDem();
		}
		for(int i = 0; i < repVotes; i++){
			poll.voteRep();
		}
		
		System.out.println(poll.getCounts());
		poll.clearState();
		System.out.println(poll.getCounts());
		
		System.out.println("VotingMaching check ... done");
		
	}
}
