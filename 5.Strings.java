package com.lainlimbo;

import java.util.*;

import java.util.stream.IntStream;

public class Strings {
	
	//objects or reference types
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String name = "Derek ";
		String wName = name + "Banas "; //add to a string later
		wName += "is my name"; //use shortcut arithmetics too
		String drsDog = "K" +9;//conversion
		
		System.out.println(drsDog);
		System.out.println(wName.charAt(0));
		//to see the character stored in index 0
		/* each charachter would be stored starting from
		 * index 0,1,2 and so on 
		 */
		
		
		//see if the whole string contains the string derek
		System.out.println(wName.contains("Derek"));
		//index of that string
		System.out.println(wName.indexOf("Derek"));
		//length of string
		System.out.println(wName.length());
		
		//whenever comparing strings
		//never use == for equals with strings
		//but use the word 'equals' for string comparison
		System.out.println("dogs equals cut : " +
		("dog".equals("cat")));
		
		//if you want to compare two strings without including the Case
		//hence not being case sensitive
		System.out.println("DOGS equals dogs : " +
		("DOGS".equalsIgnoreCase("dogs")));
		
		System.out.println(wName.compareTo("ABC"));
		//compareTo compares two strings lexogeographically
		//that is if the strings are same ans=0
		//if ABC comes before wName ans=negetive
		//if come after then ans=positive
		
		//to replace a string
		System.out.println(wName.replace("Derek", "Bob "));
		//get a string using indexes (from,to)
		System.out.println(wName.substring(0,5));
		
		//turn strings in arrays
		//basically divide the string in single strings
		//and stick each word in a different box in an array
		for(String x: wName.split(" ")) System.out.println(x);
		
		//trim - delete whitespaces
		//toUpperCase - convert all character to upper case
		//toLowerCase
		
		
	}

}
