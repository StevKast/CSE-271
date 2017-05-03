package edu.miamioh.kastsm;


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
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.SwingConstants;
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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//Welcome title for main panel
		JLabel welcomeTitle = new JLabel("N-Queens Problem Tool");
		welcomeTitle.setBounds(5, 5, 784, 27);
		welcomeTitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(welcomeTitle);
		welcomeTitle.setFont(new Font("Tahoma", Font.PLAIN, 22));

		//Creates the panel with a grid layout for the chess board
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

		//Creates a text displaying the instructions
		JTextArea instructionTextArea = new JTextArea();
		instructionTextArea.setEditable(false);
		instructionTextArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		instructionTextArea.setText("Welcome to the N-Queens Problem tool.\r\n-"
				+ " Place queens by clicking on squares, get rid \r\n"
				+ "   of them by clicking again\r\n- Queens cannot be in the same row, "
				+ "column,\r\n   or diagonal.\r\n- Check your answer by clicking the check \r\n   "
				+ "solution button");
		instructionTextArea.setBounds(425, 40, 350, 150);
		contentPane.add(instructionTextArea);

		//Creates a text area displaying current game information
		JTextArea checkerOutput = new JTextArea();
		checkerOutput.setLineWrap(true);
		checkerOutput.setEditable(false);
		checkerOutput.setBounds(425, 200, 350, 150);
		contentPane.add(checkerOutput);

		//Creates button to check solution
		JButton checkSolution = new JButton("Check Solution");
		checkSolution.setBounds(435, 372, 140, 60);
		contentPane.add(checkSolution);

		//Image icon objects for queens
		ImageIcon queenIcon = new ImageIcon(MainFrame.class.getResource("Freddie-Mercury.jpg"));
		ImageIcon badQueenIcon = new ImageIcon(MainFrame.class.getResource("Freddie-Mercury-Angry.jpg"));

		//Actions listener for check soultion button
		ActionListener checkListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {

				ArrayList<Integer> rowList = new ArrayList<Integer>();
				ArrayList<Integer> colList = new ArrayList<Integer>();

				boolean rowCheck = true;
				boolean colCheck = true;
				boolean diaCheck = true;

				if(queens <= 8){
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
					//Clear text from previous output
					checkerOutput.setText("");
					for(int i = 0; i < rowList.size(); i++){
						for(int j = 0; j < rowList.size(); j++){
							//Checks for row conflicts
							if(rowList.get(i).compareTo(rowList.get(j)) == 0 && (i != j)){
								rowCheck = false;
								checkerOutput.append("(" + (rowList.get(i) + 1) + "," + (colList.get(i) 
										+ 1) + ") conflicts with (" + (rowList.get(j) + 1) + "," + (colList.get(j)
												+ 1) + ")\n");
								gridArray[rowList.get(i)][colList.get(j)].setIcon(badQueenIcon);
							}
							//Checks for column conflicts
							if(colList.get(i).compareTo(colList.get(j)) == 0 && (i != j)){
								colCheck = false;
								checkerOutput.append("(" + (rowList.get(i) + 1) + "," + (colList.get(i) 
										+ 1) + ") conflicts with (" + (rowList.get(j) + 1) + "," + (colList.get(j)
												+ 1) + ")\n");

								gridArray[rowList.get(i)][colList.get(j)].setIcon(badQueenIcon);
							}
							//Check diagonal conflicts using the row and the column deltas
							if(Math.abs(rowList.get(i) - rowList.get(j)) == 
									Math.abs(colList.get(i) - colList.get(j)) && (i != j)){
								diaCheck = false;
								checkerOutput.append("(" + (rowList.get(i) + 1) + "," + (colList.get(i) 
										+ 1) + ") conflicts with (" + (rowList.get(j) + 1) + "," + (colList.get(j)
												+ 1) + ")\n");
								gridArray[rowList.get(i)][colList.get(i)].setIcon(badQueenIcon);

							}
						}
					}
					if(rowCheck && colCheck && diaCheck){
						checkerOutput.setText("THAT IS CORRECT FOR " + queens + " QUEENS");
					}
				}else{
					checkerOutput.setText("Please use only 8 or less queens!");
				}

			}
		};
		checkSolution.addActionListener(checkListener);

		gridArray = new JToggleButton[8][8];

		//Action listener for selecting where to put queens
		ActionListener boardListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				//Creates a temp button that represents the clicked one.
				JToggleButton selectedButton = (JToggleButton) event.getSource();

				for (int row = 0; row < gridArray.length; row++) {
					for (int col = 0; col < gridArray[row].length; col++) {
						// ** Reference console output, user won't see this
						if (gridArray[row][col] == selectedButton) {
							if (selectedButton.isSelected()) {
								selectedButton.setIcon(queenIcon);
								System.out.printf("Selected row and column: (%d, %d)%n", row + 1, col + 1); // **
								queens++;
								currentQueens.setText(Integer.toString(queens));
							} else {
								selectedButton.setIcon(null);
								System.out.printf("Deselected row and column: (%d, %d)%n", row + 1, col + 1);// **
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

		//Creates a tip button for tips
		JButton tipButton = new JButton("Tip");
		tipButton.setBounds(625, 372, 140, 60);
		contentPane.add(tipButton);

		//Actions for tip button
		ActionListener tipListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {

				ArrayList<Integer> rowFlag = new ArrayList<Integer>();
				ArrayList<Integer> colFlag = new ArrayList<Integer>();
				ArrayList<Integer> potRow = new ArrayList<Integer>();
				ArrayList<Integer> potCol = new ArrayList<Integer>();

				int tipRow = -1;
				int tipCol = -1;

				boolean found = false;

				if(queens < 8 && queens != 0){
					checkerOutput.setText("Tip:\n");

					//Checks all the currently marked spots
					for (int row = 0; row < gridArray.length; row++) {
						for (int col = 0; col < gridArray[row].length; col++) {
							if(gridArray[row][col].isSelected()){
								rowFlag.add(row);
								colFlag.add(col);
							}
						}
					}

					//Checks for potential row and column spots
					for (int row = 0; row < gridArray.length; row++) {
						for (int col = 0; col < gridArray[row].length; col++) {
							if(!(rowFlag.contains(row)) && !(colFlag.contains(col))){
								potRow.add(row);
								potCol.add(col);
							}
						}
					}
					//Checks diagonals 
					for (int i = 0; i < rowFlag.size(); i++) {
						for (int j = 0; j < potRow.size(); j++) {
							if(Math.abs(rowFlag.get(i) - potRow.get(j)) != Math.abs(colFlag.get(i) - potCol.get(j))){
								tipRow = potRow.get(j);
								tipCol = potCol.get(j);
							}
						}
					}
					checkerOutput.append("(" + (tipRow + 1) + "," + (tipCol + 1) + ")");
				}else if(queens == 0){
					checkerOutput.setText("Please place an intial queen!");
				}else{
					checkerOutput.setText("Already have 8 queens!");
				}
			}
		};
		tipButton.addActionListener(tipListener);
	}
}