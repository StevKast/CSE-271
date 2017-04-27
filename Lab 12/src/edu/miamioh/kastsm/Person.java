package edu.miamioh.kastsm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Person implements Comparable{

	String name;
	
	public Person(String name){
		this.name = name;
	}
	
	@Override
	public int compareTo(Object per) {
		return (-1) * per.toString().compareTo(name);
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
		System.out.println(personList.get(9));
		System.out.println(personList);
	}
	
	
	public String getName(){
		return name;
	}
	
	public void setName(String s){
		name = s;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
