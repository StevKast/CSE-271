//Steven Kast, katsm
//CSE 271, Dr Bravo
//March 2, 2017
//Project 01, Appointment Program 

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Monthly extends Appointment{

	public Monthly(String desc, GregorianCalendar date) {
		super(desc, date);
	}

	@Override
	//I am assuming events are not added retroactively
	public boolean occursOn(int year, int month, int day) {
		if(getDate().get(Calendar.YEAR) > year){
			return false;
		}else if(getDate().get(Calendar.MONTH) > month){
			return false;
		}else{
			return getDate().get(Calendar.DAY_OF_MONTH) == day;
		}
	}

	@Override
	public appointmentType getType(Appointment app) {
		return appointmentType.Monthly;
	}
	
	
}
