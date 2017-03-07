//Steven Kast, katsm
//CSE 271, Dr Bravo
//March 2, 2017
//Project 01, Appointment Program 

import java.util.GregorianCalendar;

public class Appointment {
	
	private String desc;
	private GregorianCalendar date;
	
	public Appointment(String desc, GregorianCalendar date){
		this.desc = desc;
		this.date = date;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}
	
}
