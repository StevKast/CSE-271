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
		setTitle("n-Queens Problem\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				
				JPanel welcomePanel = new JPanel();
				contentPane.add(welcomePanel);
				welcomePanel.setLayout(new GridLayout(2, 1, 0, 0));
				
				JLabel welcomeTitle = new JLabel("N-Queens Problem Tool:");
				welcomePanel.add(welcomeTitle);
				
				JLabel welcomeParagraph = new JLabel("g");
				welcomePanel.add(welcomeParagraph);
		
				JPanel countPanel = new JPanel();
				contentPane.add(countPanel);
				
						//Label
						JLabel lblNumberOfQueens = new JLabel("Current Number of Placed Queens: ");
						countPanel.add(lblNumberOfQueens);
						
								//TextField that displays current number of queens placed
								currentQueens = new JTextField();
								currentQueens.setEditable(false);
								currentQueens.setText("0");
								countPanel.add(currentQueens);
								currentQueens.setColumns(2);

		JPanel boardGrid = new JPanel();
		boardGrid.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		boardGrid.setBackground(Color.WHITE);
		boardGrid.setBounds(380, 47, 400, 400);
		contentPane.add(boardGrid);
		boardGrid.setLayout(new GridLayout(8, 8, 0, 0));

		gridArray = new JToggleButton[8][8];

		ImageIcon queenIcon = new ImageIcon(MainFrame.class.getResource("Freddie-Mercury.jpg"));
		
		ActionListener buttonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				// Finds which button the event came from
				JToggleButton selectedButton = (JToggleButton) evt.getSource();
				for (int row = 0; row < gridArray.length; row++) {
					for (int col = 0; col < gridArray[row].length; col++) {
						// Just helpful console output---User won't see it
						if (gridArray[row][col] == selectedButton) {
							if (selectedButton.isSelected()) {
								//selectedButton.setIcon(queenIcon);
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
				gridArray[row][col].setSize(50, 50);
				gridArray[row][col].addActionListener(buttonListener);
				boardGrid.add(gridArray[row][col]);
			}
		}

	}

}
