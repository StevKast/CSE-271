//Steven Kast, katsm
//CSE 271, Dr Bravo
//March 2, 2017
//Project 01, Appointment Program 

import java.io.File;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args){
		GregorianCalendar cal01 = new GregorianCalendar(2017, 03, 14); //Calendar variable placeholder
		GregorianCalendar cal02 = new GregorianCalendar(2017, 04, 20);
		Scanner in = new Scanner(System.in);

		Onetime ot01 = new Onetime("A onetime event, turn in Project 01", cal01);
		Monthly m01 = new Monthly("A monthly event, pay Netflix subscription", cal01);
		Daily d01 = new Daily("A daily event, Lunch with xxx", cal01);
		Onetime ot02 = new Onetime("A onetime event, file taxes", cal02);
		Monthly m02 = new Monthly("A monthly event, meeting with Exec", cal02);
		Daily d02 = new Daily("A daily event, wake up", cal02);

		File saveFile = new File("save01.txt");
		AppointmentBook book = new AppointmentBook(saveFile);

		AppointmentBook.save(d01, saveFile);
		AppointmentBook.save(m01, saveFile);
		AppointmentBook.save(ot01, saveFile);
		AppointmentBook.save(d02, saveFile);
		AppointmentBook.save(m02, saveFile);
		AppointmentBook.save(ot02, saveFile);

		book.load(saveFile);

		System.out.print("Enter a date, YYYY MM DD:");
		int year = in.nextInt();
		int month = in.nextInt();
		int day = in.nextInt();

		System.out.println("Events on this date:");
		for(Appointment app: book.getStorage()){
			if(app.occursOn(year, month, day)){
				System.out.println(app.getDesc());
			}
		}
		
		in.close();

	}//End main
}//End class
