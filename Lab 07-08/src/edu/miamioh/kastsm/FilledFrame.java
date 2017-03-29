package edu.miamioh.kastsm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FilledFrame extends JFrame{

	private JButton button;
	private JLabel label1;
	private JLabel label2;
	
	private static final int FRAME_WIDTH = 600;
	private static final int FRAME_HEIGHT = 400;
	
	public FilledFrame(){
		createComponents();
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	private void createComponents(){
		button = new JButton("View Courses");
		label1 = new JLabel("Instructor:");
		label2 = new JLabel("");
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label1);
		panel.add(label2);
		add(panel);
		
		ActionListener listener = new ClickListener();
		button.addActionListener(listener);
	}
	
	class ClickListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			label2.setText("click");
		}
	}
	
}
