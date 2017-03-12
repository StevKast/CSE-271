//Steven Kast, katsm
//CSE 271, Dr Bravo
//March 2, 2017
//Project 01, Appointment Program 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class AppointmentBook {
	
	private ArrayList<Appointment> stor = new ArrayList<Appointment>(); //Assuming ArrayList would work better than an array
	
	public AppointmentBook(File file){
		//No instance vars
	}
	
	//Returns the ArrayList in order to use occursOn
	public ArrayList<Appointment> getStorage(){
		return stor;
	}
	
	//Creates and adds an appointment to the ArrayList
	public void addAppointment(appointmentType type, String desc, GregorianCalendar date){
		if(type == appointmentType.Daily){
			Daily daily = new Daily(desc, date);
			stor.add(daily);
		}else if(type == appointmentType.Monthly){
			Monthly monthly = new Monthly(desc, date);
			stor.add(monthly);
		}else{
			Onetime onetime = new Onetime(desc, date);
			stor.add(onetime);
		}
	}//end addAppointment

	public static void save(Appointment app, File file){
		try {
			PrintWriter out = new PrintWriter(new FileWriter(file, true));
			out.print(app.getType(app) + " ");
			out.print(app.getDate().get(Calendar.YEAR) + " ");
			out.print(app.getDate().get(Calendar.MONTH) + " ");
			out.println(app.getDate().get(Calendar.DAY_OF_MONTH));
			out.println(app.getDesc());

			out.close();
		} catch (IOException exception) {
			System.out.println(file + " not found!");
		}
	}//end save

	public void load(File file){
		String stringType, desc;
		String dataLine;
		int year, month, day;
		appointmentType enumType = null;
		try {
			Scanner in = new Scanner(file);
			while(in.hasNextLine()){
				dataLine = in.nextLine(); //Temp line holder used to parse save format
				
				stringType = dataLine.substring(0, dataLine.indexOf(' '));
				dataLine = dataLine.substring(dataLine.indexOf(' ') + 1); //Trims the already stored information
				year = Integer.parseInt(dataLine.substring(0, dataLine.indexOf(' ')));
				dataLine = dataLine.substring(dataLine.indexOf(' ') + 1);
				month = Integer.parseInt(dataLine.substring(0, dataLine.indexOf(' ')));
				dataLine = dataLine.substring(dataLine.indexOf(' ') + 1);
				day = Integer.parseInt(dataLine.substring(0));

				desc = in.nextLine(); //Grabs the next line which should only contain the description

				if(stringType.equals("Onetime")){
					enumType = appointmentType.Onetime;
				}else if(stringType.equals("Monthly")){
					enumType = appointmentType.Monthly;
				}else if(stringType.equals("Daily")){
					enumType = appointmentType.Daily;
				}else{
					System.out.println("Failed to load type.");
				}

				GregorianCalendar tempCal = new GregorianCalendar(year, month, day);
				addAppointment(enumType, desc, tempCal);

			}
			in.close();
		} catch (FileNotFoundException exception) {
			System.out.println(file + " not found!");
		}
	}//end load

}//end class
