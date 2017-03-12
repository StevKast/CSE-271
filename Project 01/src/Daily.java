//Steven Kast, katsm
//CSE 271, Dr Bravo
//March 2, 2017
//Project 01, Appointment Program 

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Daily extends Appointment{

	public Daily(String desc, GregorianCalendar date) {
		super(desc, date);	
	}
	
	@Override
	//I am assuming events are not added retroactively
	public boolean occursOn(int year, int month, int day) {
		if(getDate().get(Calendar.YEAR) > year){
			return false;
		}else if(getDate().get(Calendar.MONTH) > month){
			return false;
		}else if(getDate().get(Calendar.YEAR) >= year && getDate().get(Calendar.MONTH) >= month
				&& getDate().get(Calendar.DAY_OF_MONTH) > day){ //Checks if day before in same month & year
			return false;
		}else{
			return true;
		}
	}
	
	@Override
	public appointmentType getType(Appointment app) {
		return appointmentType.Daily;
	}
}
