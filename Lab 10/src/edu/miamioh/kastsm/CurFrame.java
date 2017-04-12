package edu.miamioh.kastsm;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CurFrame extends JFrame {
	private JButton calc;	
	
	private JComboBox firstCurrency;
	private JComboBox secondCurrency;
	
	private JPanel mainPanel;
	private JPanel inputPanel;
	
	private JTextField firstInput;
	
	private JLabel title;
	private JLabel outputLabel;
	
	double input, output;

	public CurFrame(){

		createComponents();
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Currency Converter");
		setVisible(true);
	}
	
	private void createComponents(){
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(1,3));
		
		firstCurrency = new JComboBox<String>();
		firstCurrency.addItem("(USD) U.S. Dollar");
		firstCurrency.addItem("(EUR) Euro");
		firstCurrency.addItem("(GBP) Great Britian Pound");

		secondCurrency = new JComboBox<String>();
		secondCurrency.addItem("(USD) U.S. Dollar");
		secondCurrency.addItem("(EUR) Euro");
		secondCurrency.addItem("(GBP) Great Britian Pound");
		
		calc = new JButton("Calculate");
		
		calc.addActionListener(new CalcListener());
		
		
		createTitle();
		
		outputLabel = new JLabel(Double.toString(output));
		JLabel outputText = new JLabel("Result: ");
		
		inputPanel.add(firstCurrency);
		inputPanel.add(secondCurrency);
		inputPanel.add(calc);
		
		JPanel outputPanel = new JPanel();
		outputPanel.setLayout(new GridLayout(1,2));
		outputPanel.add(outputText);
		outputPanel.add(outputLabel);
		
		
		mainPanel.add(outputPanel, BorderLayout.SOUTH);
		mainPanel.add(inputPanel, BorderLayout.CENTER);
		add(mainPanel);
		
	}
	private void createTitle(){
		title = new JLabel("Currency Converter");
		mainPanel.add(title, BorderLayout.NORTH);
	}
	
	class CalcListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			System.out.println("CLICKED");
			if(firstCurrency.getSelectedItem().equals("(USD) U.S. Dollar")){
				
			}
		}
		
	}
}
