//Steven Kast, katsm
//CSE 271, Dr Bravo
//March 2, 2017
//Project 01, Appointment Program 

import java.util.GregorianCalendar;


public class Onetime extends Appointment{

	public Onetime(String desc, GregorianCalendar date) {
		super(desc, date);
	}

	@Override
	public boolean occursOn(int year, int month, int day) {
		GregorianCalendar temp = new GregorianCalendar(year, month, day);
		return getDate().equals(temp);
	}

	@Override
	public appointmentType getType(Appointment app) {
		return appointmentType.Onetime;
	}

	
	
}
