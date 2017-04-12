package edu.miamioh.kastsm;

import java.awt.BorderLayout;
import java.awt.GridLayout;
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
		
		firstCurrency = new JComboBox();
		firstCurrency.addItem("Test");
		secondCurrency = new JComboBox();
		
		calc = new JButton("Calculate");
		
		calc.addActionListener(new CalcListener());
		
		
		createTitle();
		
		outputLabel = new JLabel(Double.toString(output));
		
		inputPanel.add(firstCurrency);
		inputPanel.add(secondCurrency);
		inputPanel.add(calc);
		
		mainPanel.add(outputLabel, BorderLayout.SOUTH);
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
		}
		
	}
}
