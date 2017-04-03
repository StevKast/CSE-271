package edu.miamioh.kastsm;

//Steven Kast, kastsm
//Dr. Bravo
//CSE 271 Section F
//Lab 09

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FilledFrame extends JFrame{
	
	private ArrayList<restaurantButton> buttonArrayList;
	
	private double totalCost = 0;
	
	private JTextArea display;
	private JTextField customItem;
	private JTextField customPrice;
	private JButton addItem;
	private JButton calculate;
	private JPanel panel;
	
	private static final int FRAME_WIDTH = 400, FRAME_HEIGHT = 400;
	private static final int FIELD_WIDTH_LONG = 15, FIELD_WIDTH_SHORT = 5; 
	
	public FilledFrame(){
		buttonArrayList = new ArrayList<restaurantButton>();
		createComponents();
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Part 1 - Restaurant Bill");
		setVisible(true);
	}//end FilledFrame constructor
	
	/**
	 * Creates all the components and adds them to the panel.
	 */
	private void createComponents(){
		panel = new JPanel();
		ActionListener itemClick = new ItemClick();
		createButtons();
		for(restaurantButton button: buttonArrayList){
			panel.add(button);
			button.addActionListener(itemClick);
			System.out.println("Add Button");
		}
		createCustomItem();

		
		display = new JTextArea(10, 25);
		panel.add(display);
		
		calculate = new JButton("Calculate");
		calculate.addActionListener(itemClick);
		panel.add(calculate);
		
		add(panel);
				
	}//end createComponents
	
	/**
	 * Initializes 10 common item buttons and assigns the name and cost/
	 */
	private void createButtons(){
		buttonArrayList.add(new restaurantButton(12, "Chicken Parmesan"));
		buttonArrayList.add(new restaurantButton(10, "Fish Tacos"));
		buttonArrayList.add(new restaurantButton(9.50, "Cheese Burger"));
		buttonArrayList.add(new restaurantButton(15, "BBQ Ribs"));
		buttonArrayList.add(new restaurantButton(21, "Filet Mignon"));
		buttonArrayList.add(new restaurantButton(5, "Sushi"));
		buttonArrayList.add(new restaurantButton(10, "Wings"));
		buttonArrayList.add(new restaurantButton(1.50, "Tea"));
		buttonArrayList.add(new restaurantButton(1.50, "Lemonade"));
		buttonArrayList.add(new restaurantButton(1.50, "Soda"));	
	}//end createButtons
	
	/**
	 * Creates 2 text fields, one for a custom item name and one for that items 
	 * price. Add both fields to the panel. 
	 */
	private void createCustomItem(){
		customItem = new JTextField(FIELD_WIDTH_LONG);
		customPrice = new JTextField(FIELD_WIDTH_SHORT);

		addItem = new JButton("Add Item");
		addItem.addActionListener(new ItemClick());
		
		panel.add(customItem);
		panel.add(customPrice);
		panel.add(addItem);
	}//end cretCustomItem
	
	class ItemClick implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() instanceof restaurantButton){
				
				restaurantButton button = (restaurantButton) event.getSource();
				totalCost += button.getCost();
				display.append(button.getCost() + " -- " + button.getItemName() + "\n");
				
			}else if(event.getSource().equals(addItem)){
				
				totalCost += Double.parseDouble(customPrice.getText()); //Pull text from cost field and cast as Double
				display.append(customPrice.getText() + " -- " + customItem.getText() + "\n");
				
			}else if(event.getSource().equals(calculate)){
				
				display.append("Subtotal: " + totalCost + "\n");
				totalCost += (totalCost * .20) + (totalCost * .07); //Add 20% tip and 7% tax
				display.append("Total: " + totalCost + "\n");
				
			}
		}//end actionPerformed
	}//end itemClick class
}//end FilledFrame class
