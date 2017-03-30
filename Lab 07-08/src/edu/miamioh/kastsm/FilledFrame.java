package edu.miamioh.kastsm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class FilledFrame extends JFrame{

	private JButton newInsButton;
	private JLabel newInstructorLabel;
	private JLabel label2;
	private JComboBox<Person> dropDownPersons;
	private JComboBox<String> dropDownCreate;
	private JTextArea view;

	private ArrayList<Instructor> instructorList = new ArrayList<Instructor>();
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<AdminStaff> adminStaffList = new ArrayList<AdminStaff>();

	private static final int FRAME_WIDTH = 600;
	private static final int FRAME_HEIGHT = 400;
	private String[] createList = {"AdminStaff", "Instructor", "Student"};

	public FilledFrame(){
		createComponents();

		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Univeristy Management");
		setVisible(true);
	}

	private void createComponents(){
		newInsButton = new JButton("Create");
		newInstructorLabel = new JLabel("Current ID:");
		dropDownPersons = new JComboBox<Person>();
		dropDownCreate = new JComboBox<String>(createList);
		label2 = new JLabel("");
		JPanel panel = new JPanel();
		panel.add(dropDownCreate);
		panel.add(newInsButton);
		panel.add(newInstructorLabel);
		panel.add(label2);
		panel.add(dropDownPersons);		

		view = new JTextArea(20, 50);
		panel.add(view);

		add(panel);

		ActionListener createListener = new createListener();
		newInsButton.addActionListener(createListener);
		
		ActionListener viewPerson = new viewPerson();
		dropDownPersons.addActionListener(viewPerson);
	}

	class createListener implements ActionListener{
		int idNum = 100;
		@Override
		public void actionPerformed(ActionEvent event) {
			if(dropDownCreate.getSelectedItem().equals("Instructor")){
				idNum++;
				Instructor ins = new Instructor(idNum, idNum + "ins@unv.edu", 40000);
				instructorList.add(ins);
				label2.setText(Integer.toString(ins.getId()));
				dropDownPersons.addItem(ins);
			}else if(dropDownCreate.getSelectedItem().equals("Student")){
				idNum++;
				Student stu = new Student(idNum, idNum + "stu@unv.edu", "Temp Major");
				studentList.add(stu);
				label2.setText(Integer.toString(stu.getId()));
				dropDownPersons.addItem(stu);
			}else if(dropDownCreate.getSelectedItem().equals("AdminStaff")){
				idNum++;
				AdminStaff admin = new AdminStaff(idNum, idNum + "admin@unv.edu", 80000);
				adminStaffList.add(admin);
				label2.setText(Integer.toString(admin.getId()));
				dropDownPersons.addItem(admin);
			}
		}
	}
	
	class viewPerson implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			String viewText = dropDownPersons.getSelectedItem().toString();
			if(dropDownPersons.getSelectedItem().getClass().toString().equals("class edu.miamioh.kastsm.Instructor")){
				view.setText(((Instructor)dropDownPersons.getSelectedItem()).viewCourses());
				view.append("This is technically the course list but there are no courses");
				
			}else if(dropDownPersons.getSelectedItem().getClass().toString().equals("class edu.miamioh.kastsm.AdminStaff")){
				view.setText(viewText);
				
			}else if(dropDownPersons.getSelectedItem().getClass().toString().equals("class edu.miamioh.kastsm.Student")){
				view.setText((dropDownPersons.getSelectedItem()).toString());
				
			}
			
		}
		
	}
}
