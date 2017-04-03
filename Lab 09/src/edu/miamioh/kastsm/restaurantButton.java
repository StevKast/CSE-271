package edu.miamioh.kastsm;

//Steven Kast, kastsm
//Dr. Bravo
//CSE 271 Section F
//Lab 09

import javax.swing.JButton;

public class restaurantButton extends JButton{

	private double cost;
	private String itemName = "";
	
	//Constructs a restaurantButton which stores the name and cost of an item.
	//Also sets the text of the button to the item name.
	public restaurantButton(double cost, String itemName){
		this.setCost(cost);
		this.itemName = itemName;
		setText(itemName);
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
}