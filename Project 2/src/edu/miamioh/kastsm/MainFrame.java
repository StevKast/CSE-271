package edu.miamioh.kastsm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JToggleButton[][] gridArray;
	private int queens = 0;
	private JTextField currentQueens;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
					frame.setSize(850, 500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the main frame.
	 */
	public MainFrame() {
		setBackground(Color.WHITE);
		setResizable(false);
		setTitle("N-Queens Problem\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		//setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
				contentPane.setLayout(null);
		
				JLabel welcomeTitle = new JLabel("N-Queens Problem Tool");
				welcomeTitle.setBounds(5, 5, 784, 27);
				welcomeTitle.setHorizontalAlignment(SwingConstants.CENTER);
				contentPane.add(welcomeTitle);
				welcomeTitle.setFont(new Font("Tahoma", Font.PLAIN, 22));

		JPanel boardGrid = new JPanel();
		boardGrid.setBounds(new Rectangle(5, 32, 400, 400));
		boardGrid.setPreferredSize(new Dimension(400, 400));
		boardGrid.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		boardGrid.setBackground(Color.WHITE);
		contentPane.add(boardGrid);
		boardGrid.setLayout(new GridLayout(8, 8, 0, 0));

		//Panel to display the current amount of queens placed
		JPanel countPanel = new JPanel();
		countPanel.setLocation(32, 431);
		contentPane.add(countPanel);
		countPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JLabel lblNumberOfQueens = new JLabel("Current Number of Placed Queens: ");
		countPanel.add(lblNumberOfQueens);
		countPanel.setSize(350, 30);
		currentQueens = new JTextField();
		currentQueens.setEditable(false);
		currentQueens.setText("0");
		countPanel.add(currentQueens);
		currentQueens.setColumns(2);
		
		JButton checkSolution = new JButton("Check Solution");
		checkSolution.setBounds(534, 372, 138, 60);
		contentPane.add(checkSolution);
		
		JTextArea instructionTextArea = new JTextArea();
		instructionTextArea.setEditable(false);
		instructionTextArea.setBounds(425, 40, 300, 300);
		contentPane.add(instructionTextArea);

		gridArray = new JToggleButton[8][8];

		ImageIcon queenIcon = new ImageIcon(MainFrame.class.getResource("Freddie-Mercury.jpg"));

		ActionListener buttonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				//Creates a temp button that represents the clicked one.
				JToggleButton selectedButton = (JToggleButton) event.getSource();
				
				for (int row = 0; row < gridArray.length; row++) {
					for (int col = 0; col < gridArray[row].length; col++) {
						// Just helpful console output---User won't see it
						if (gridArray[row][col] == selectedButton) {
							if (selectedButton.isSelected()) {
								selectedButton.setIcon(queenIcon);
								System.out.printf("Selected row and column: (%d, %d)%n", row + 1, col + 1);
								queens++;
								currentQueens.setText(Integer.toString(queens));
							} else {
								selectedButton.setIcon(null);
								System.out.printf("Deselected row and column: (%d, %d)%n", row + 1, col + 1);
								queens--;
								currentQueens.setText(Integer.toString(queens));
							}
						}
					}
				}
			}
		};
		

		for (int row = 0; row < gridArray.length; row++) {
			for (int col = 0; col < gridArray[row].length; col++) {
				if ((col % 2 == 1 && row % 2 == 1) || (col % 2 == 0 && row % 2 == 0)) {
					gridArray[row][col] = new JToggleButton();
					gridArray[row][col].setBackground(Color.BLACK);
				} else {
					gridArray[row][col] = new JToggleButton();
					gridArray[row][col].setBackground(Color.WHITE);
				}
				gridArray[row][col].addActionListener(buttonListener);
				boardGrid.add(gridArray[row][col]);
			}
		}

	}
}
