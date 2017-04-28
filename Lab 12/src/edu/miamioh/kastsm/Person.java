package edu.miamioh.kastsm;

//Steven Kast
//CSE 271, Dr. Bravo
//Lab 12

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Person implements Comparable{

	String name;
	
	/**
	 * Constructs a person object
	 * @param name Name of person
	 */
	public Person(String name){
		this.name = name;
	}
	
	@Override
	public int compareTo(Object per) {
		return per.toString().compareTo(name);
	}
	
	@Override
	public String toString() {
		return name;
	}

	
	public static void main(String[] args){
		ArrayList<Person> personList = new ArrayList<Person>();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter 10 names:");
		
		for(int i = 0; i < 10; i++){
			 personList.add(new Person(in.nextLine()));
		}
		
		Collections.sort(personList);
		System.out.println(personList.get(0));
		System.out.println(personList.get(personList.size() - 1));
		
		in.close();
	}
	
	
	/**
	 * @return Returns name of person
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * @param s String to set the name
	 */
	public void setName(String s){
		name = s;
	}

	
	
}
