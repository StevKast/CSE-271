package edu.miamioh.kastsm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FilledFrame extends JFrame{
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private ArrayList<JButton> buttonArrayList;
	
	private JPanel panel;
	
	private static final int FRAME_WIDTH = 400, FRAME_HEIGHT = 400; 
	
	public FilledFrame(){
		buttonArrayList = new ArrayList<JButton>();
		createComponents();
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Part 1 - Restaurant Bill");
		setVisible(true);
	}
	private void createComponents(){
		panel = new JPanel();
		createButtons();
		for(JButton button: buttonArrayList){
			panel.add(button);
			System.out.println("Add Button");
		}
		add(panel);
		
		ActionListener itemClick = new itemClick();
		//button1.addActionListener(itemClick);
		//button2.addActionListener(itemClick);
		
	}
	
	private void createButtons(){
		for(int i = 0; i < 10; i++){
			buttonArrayList.add(new JButton());
			System.out.println("Create Button");
		}
		button1 = new JButton("");
		System.out.println(buttonArrayList.size());
		
	}
	class itemClick implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			System.out.println("Test");
		}	
	}
	
}
