package edu.miamioh.kastsm;

//Steven Kast, kastsm
//Dr. Bravo
//CSE 271 Section F
//Lab 09

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class RingComponent extends JComponent{

	//Draws the olympic rings
	public void paintComponent(Graphics g){
		drawRing(0, 0 , g, Color.blue);
		drawRing(200, 0 , g, Color.black);
		drawRing(400, 0 , g, Color.red);
		drawRing(100, 100 , g, Color.yellow);
		drawRing(300, 100 , g, Color.green);
	}
	
	/**Draws an ring with a thickness of 50
	 * @param x x coordinate 
	 * @param y y coordinate
	 * @param g Graphics
	 * @param c color of the ring
	 */
	public void drawRing(int x, int y, Graphics g, Color c){
		g.setColor(c);
		for(int i = 0; i < 50; i++){
		g.drawOval(x + i/2, y + i/2, 200 - i, 200 - i);
		}
	}
}
