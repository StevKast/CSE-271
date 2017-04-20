package edu.miamioh.kastsm;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**Application that converts one currency to another (USD, EUR, GBP)
 * @author Steven Kast, kastsm
 * Dr. Bravo, CSE 271
 * Lab 10
 */
public class CurFrame extends JFrame {
	private JButton calc;	

	private JComboBox<String> firstCurrency;
	private JComboBox<String> secondCurrency;

	private JPanel mainPanel;
	private JPanel inputPanel;

	private JTextField firstInput;

	private JLabel title;
	private JLabel outputLabel;

	private double input, output;
	private final double EUR_USD = 1.42, GBP_USD = 1.64, GBP_EUR = 1.13; //Conversion rates of currency
	//Note: These currency rates are very out of date. I used what was giving not the actual ones.

	/**Frame constructor, creates the components and sets the default close operation, title
	 * and sets it to visible.
	 */
	public CurFrame(){

		createComponents();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Currency Converter");
		setVisible(true);
	}

	/**Constructs the panels and adds them to the frame.
	 * Creates the buttons and dropdowns.
	 */
	private void createComponents(){
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(2,3));

		createOptions();
		createInput();

		inputPanel.add(firstInput);

		createTitle();
		createOutput();

		mainPanel.add(inputPanel, BorderLayout.CENTER);
		add(mainPanel);

	}

	/**Creates the title label and adds it to the main panel.
	 * 
	 */
	private void createTitle(){
		title = new JLabel("Convert currencies to and from USD, EUR, and GBP.");
		mainPanel.add(title, BorderLayout.NORTH);
	}

	/**Creates the labels and handles output formating for the currency.
	 * Adds them to the main panel.
	 */
	private void createOutput(){
		outputLabel = new JLabel(Double.toString(output));
		JLabel outputText = new JLabel("Result: ");

		JPanel outputPanel = new JPanel();
		outputPanel.setLayout(new GridLayout(1,2));
		outputPanel.add(outputText);
		outputPanel.add(outputLabel);

		mainPanel.add(outputPanel, BorderLayout.SOUTH);
	}

	/**Creates the input field and label. Also adds it to the main panel.
	 * 
	 */
	private void createInput(){
		firstInput = new JTextField(15);
		firstInput.setText("0");
		JLabel inputLabel = new JLabel("Input:");
		inputPanel.add(inputLabel);
	}

	/**Create and adds types of currencies to the drop down lists.
	 * Constructs the button that converts the input.
	 */
	private void createOptions(){
		firstCurrency = new JComboBox<String>();
		firstCurrency.addItem("(USD) U.S. Dollar");
		firstCurrency.addItem("(EUR) Euro");
		firstCurrency.addItem("(GBP) British Pound");

		secondCurrency = new JComboBox<String>();
		secondCurrency.addItem("(USD) U.S. Dollar");
		secondCurrency.addItem("(EUR) Euro");
		secondCurrency.addItem("(GBP) British Pound");

		calc = new JButton("Calculate");
		calc.addActionListener(new CalcListener());

		inputPanel.add(firstCurrency);
		inputPanel.add(secondCurrency);
		inputPanel.add(calc);
	}
	
	class CalcListener implements ActionListener{

		//Converts the input currency to the new currency.
		@Override
		public void actionPerformed(ActionEvent event) {
			Object cur1 = firstCurrency.getSelectedItem();
			Object cur2 = secondCurrency.getSelectedItem();
			input = Double.parseDouble(firstInput.getText());
			if(cur1.equals(cur2)){
				JOptionPane.showMessageDialog(mainPanel,
						"You have the same input currency and output currency.",
						"Warning",
						JOptionPane.WARNING_MESSAGE);
			}else if(cur1.equals("(USD) U.S. Dollar")){
				if(cur2.equals("(EUR) Euro")){
					output = input / EUR_USD;
				}else if(cur2.equals("(GBP) British Pound")){
					output = input / GBP_USD;
				}
			}else if(cur1.equals("(EUR) Euro")){
				if(cur2.equals("(USD) U.S. Dollar")){
					output = input * EUR_USD;
				}else if(cur2.equals("(GBP) British Pound")){
					output = input / GBP_EUR;
				}
			}else if(cur1.equals("(GBP) British Pound")){
				if(cur2.equals("(USD) U.S. Dollar")){
					output = input * GBP_USD;
				}else if(cur2.equals("(EUR) Euro")){
					output = input * GBP_EUR;
				}
			}	
			outputLabel.setText(String.format("%.2f", output)); //format output
		}
	}
}
