package edu.miamioh.kastsm;

//Steven Kast, kastsm
//Dr. Bravo
//CSE 271 Section F
//Lab 09

import javax.swing.JComponent;
import javax.swing.JFrame;

public class OlympicRings {

	private static JFrame frame;
	private static final int FRAME_WIDTH = 800, FRAME_HEIGHT = 600;
	
	public static void main(String[] args) {
		createFrame();

	}
	
	//Initializes the frame and add the components to it.
	private static void createFrame(){
		frame = new JFrame();
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Olympic Rings");
		frame.setVisible(true);

		JComponent component = new RingComponent();
		frame.add(component);
	}

}

