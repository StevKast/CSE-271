package edu.miamioh.kastsm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
import javax.swing.JScrollBar;

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

		JTextArea instructionTextArea = new JTextArea();
		instructionTextArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		instructionTextArea.setText("Welcome to the N-Queens Problem tool.\r\n- Place queens by clicking on squares, get rid \r\n   of them by clicking again\r\n- Queens cannot be in the same row, column,\r\n   or diagonal.\r\n- Check your answer by clicking the check \r\n   solution button");
		instructionTextArea.setEditable(false);
		instructionTextArea.setBounds(425, 40, 350, 150);
		contentPane.add(instructionTextArea);

		JTextArea checkerOutput = new JTextArea();
		checkerOutput.setBounds(425, 200, 350, 150);
		contentPane.add(checkerOutput);
		
		JButton checkSolution = new JButton("Check Solution");
		checkSolution.setBounds(524, 363, 140, 60);
		contentPane.add(checkSolution);
		
		ImageIcon queenIcon = new ImageIcon(MainFrame.class.getResource("Freddie-Mercury.jpg"));
		ImageIcon badQueenIcon = new ImageIcon(MainFrame.class.getResource("Freddie-Mercury-Angry.jpg"));

		ActionListener checkListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {

				ArrayList<Integer> rowList = new ArrayList<Integer>();
				ArrayList<Integer> colList = new ArrayList<Integer>();

				boolean rowCheck = true;
				boolean colCheck = true;
				boolean diaCheck = true;

				for (int row = 0; row < gridArray.length; row++) {
					for (int col = 0; col < gridArray[row].length; col++) {
						if(gridArray[row][col].isSelected()){
							rowList.add(row);
							colList.add(col);
							//Resets the icon in case it was marked from from a
							//previous check.
							gridArray[row][col].setIcon(queenIcon);
						}
					}
				}
				System.out.println(rowList);
				System.out.println(colList);

				checkerOutput.setText("");
				for(int i = 0; i < rowList.size(); i++){
					for(int j = 0; j < rowList.size(); j++){
						if(rowList.get(i).compareTo(rowList.get(j)) == 0 && (i != j)){
							rowCheck = false;
							checkerOutput.append("(" + rowList.get(i) + "," + colList.get(i) + ") conflicts with ("
									+ rowList.get(j) + "," + colList.get(j) + ")\n");
							gridArray[rowList.get(i)][colList.get(j)].setIcon(badQueenIcon);
						}
						if(colList.get(i).compareTo(colList.get(j)) == 0 && (i != j)){
							colCheck = false;
							checkerOutput.append("(" + rowList.get(i) + "," + colList.get(i) + ") conflicts with ("
									+ rowList.get(j) + "," + colList.get(j) + ")\n");
							gridArray[rowList.get(i)][colList.get(j)].setIcon(badQueenIcon);
						}
					}
				}
			}
		};
		checkSolution.addActionListener(checkListener);




		gridArray = new JToggleButton[8][8];

		ActionListener boardListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				//Creates a temp button that represents the clicked one.
				JToggleButton selectedButton = (JToggleButton) event.getSource();

				for (int row = 0; row < gridArray.length; row++) {
					for (int col = 0; col < gridArray[row].length; col++) {
						//Reference console output, user won't see this
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

		//Populate the chess board with toggle buttons
		for (int row = 0; row < gridArray.length; row++) {
			for (int col = 0; col < gridArray[row].length; col++) {
				if ((col % 2 == 1 && row % 2 == 1) || (col % 2 == 0 && row % 2 == 0)) {
					gridArray[row][col] = new JToggleButton();
					gridArray[row][col].setBackground(Color.BLACK);
				} else {
					gridArray[row][col] = new JToggleButton();
					gridArray[row][col].setBackground(Color.WHITE);
				}
				gridArray[row][col].addActionListener(boardListener);
				boardGrid.add(gridArray[row][col]);
			}
		}

	}
}
