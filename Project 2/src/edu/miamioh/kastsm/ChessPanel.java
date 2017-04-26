package edu.miamioh.kastsm;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.StrokeBorder;

public class ChessPanel extends JPanel {
	
	
	private boolean isQueen = false;
	
	public ChessPanel(Color color){
		this.setBackground(color);
		this.setBounds(0, 0, 10, 10);
		//this.setBorder();
	}
	
}
