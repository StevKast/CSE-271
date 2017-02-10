//Steven Kast
//CSE 271, Dr. Bravo
//February 9, 2016
//Lab 03, Implementing Classes

public class Address {

	private int houseNumber;
	private String street;
	private int aptNum;
	private String city;
	private String state;
	private int zipCode;

	//Constructors
	public Address(int houseNum, String street, int aptNum, String city,
			String state, int zipCode){
		this.houseNumber = houseNum;
		this.street = street;
		this.aptNum = aptNum;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public Address(int houseNum, String street, String city,
			String state, int zipCode){
		this.houseNumber = houseNum;
		this.street = street;
		this.aptNum = -1;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	//End Constructors

	//Getters and Setters
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		if(houseNumber > 0){
			this.houseNumber = houseNumber;
		}
	}

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

	public int getAptNum() {
		return aptNum;
	}
	public void setAptNum(int aptNum) {
		if(aptNum > 0){
			this.aptNum = aptNum;
		}
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		if(zipCode > 0){
			this.zipCode = zipCode;
		}
	}
	//End Getters and Setters

	//Methods
	public String printAddress(){
		return street + "\n" + city + " " + state + 
				" " + Integer.toString(zipCode);
	}//end printAdress

	public boolean comesBefore(Address other){
		return zipCode < other.getZipCode();
	}//end comesBefore
	//End Methods

}//end Class
