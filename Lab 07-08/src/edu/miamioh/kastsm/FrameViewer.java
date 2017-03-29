package edu.miamioh.kastsm;

import javax.swing.JFrame;

public class FrameViewer {

	public static void main(String[] args){
		JFrame frame = new FilledFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Univeristy Management");
		frame.setVisible(true);
		
	}
}
