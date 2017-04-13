package edu.miamioh.kastsm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**Application with a menu that has options to change color of it.
 * Can be clicked to cycle through colors.
 * @author Steven Kast, kastsm
 * Dr. Bravo, CSE 271
 * Lab 10
 */
public class ColorMenu extends JFrame{
	
	private JPanel mainPanel;
	
	private JMenuBar menu;
	
	private JMenu colors;
		
	
	/**Constructs the color menu frame and sets the close operation, title,
	 * and .
	 */
	public ColorMenu(){
		
		createComponets();
		
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Color Menu");
		setVisible(true);
	}
	
	/**Constructs the main panel, the menu bar, and creates the menu items.
	 * Adds click to change color behavior to the main panel.
	 * Default color of panel is red.
	 */
	private void createComponets(){
		mainPanel = new JPanel();
		mainPanel.setSize(500, 500);
		
		menu = new JMenuBar();
		colors = new JMenu("Colors");
		
		createItem(Color.red, "Red");
		createItem(Color.green, "Green");
		createItem(Color.blue, "Blue");
		mainPanel.setBackground(Color.red);
		mainPanel.addMouseListener(new ClickListener());
		menu.add(colors);

		setJMenuBar(menu);
		add(mainPanel);
	}
	
	/**Creates a menu item that will change the panel color.
	 * @param color Color to change the panel to
	 * @param name Visible name of the menu item for the color
	 * @return The menu item that represents the color
	 */
	private JMenuItem createItem(final Color color, final String name){
		class ItemListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent event) {
				mainPanel.setBackground(color);
			}
			
		}
		JMenuItem item = new JMenuItem(name);
		ActionListener listener = new ItemListener();
		item.addActionListener(listener);
		colors.add(item);
		return item;
	}
	
	class ClickListener implements MouseListener{
		
		
		//On click it rotates the color of the panel R->G->B.
		@Override
		public void mouseClicked(MouseEvent event) {
			Color bg = mainPanel.getBackground();
			if(bg.equals(Color.red)){
				mainPanel.setBackground(Color.green);
			}else if(bg.equals(Color.green)){
				mainPanel.setBackground(Color.blue);
			}else{
				mainPanel.setBackground(Color.red);
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
		}
		
	}
}
