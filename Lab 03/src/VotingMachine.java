//Steven Kast
//CSE 271, Dr. Bravo
//February 9, 2016
//Lab 03, Implementing Classes

public class VotingMachine {

	private int democratCount;
	private int republicanCount;

	//Constructors
	public VotingMachine(int democratCount, int republicanCount){
		this.democratCount = democratCount;
		this.republicanCount = republicanCount;
	}

	public VotingMachine(){
		democratCount = 0;
		republicanCount = 0;
	}
	//end constructors

	//Getters and setters
	public int getDemocratCount() {
		return democratCount;
	}

	public void setDemocratCount(int democratCount) {
		this.democratCount = democratCount;
	}

	public int getRepublicanCount() {
		return republicanCount;
	}

	public void setRepublicanCount(int republicanCount) {
		this.republicanCount = republicanCount;
	}
	//end Getters and setters

	//Methods
	public void clearState(){
		democratCount = 0;
		republicanCount = 0;
	}

	public void voteDem(){
		democratCount++;
	}

	public void voteRep(){
		republicanCount++;
	}

	public String getCounts(){
		return Integer.toString(democratCount) + ", " + Integer.toString(republicanCount);
	}
	//End methods

}//end class
