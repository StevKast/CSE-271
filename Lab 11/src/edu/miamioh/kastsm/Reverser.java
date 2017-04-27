package edu.miamioh.kastsm;

//Steven Kast, kastsm
//Dr. Bravo
//CSE 271 Section F
//Lab 09

public class Reverser {

	public static void main(String[] args) {

		System.out.println(reverse("Hello!"));
		System.out.println(reverse("asdfgjklnbvgsadfbnhjklawrghjbkbgreajhbarnjhbkrfakjlnerjnk"));
		System.out.println(reverse("s     k"));
		
	}
	
	/**
	 * Reverses the input string.
	 * @param s Input string.
	 * @return Returns the input string but reversed.
	 */
	public static String reverse(String s){
		if(s.length() == 1){
			return s;
		}else{
			String last = s.substring(s.length() - 1);
			String rev = last + reverse(s.substring(0, s.length() - 1));
			return rev;
		}
	}
}
