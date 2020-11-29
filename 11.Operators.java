package com.lainlimbo;

import java.util.*;

public class Operators {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	
		//Relational Operators : == != > < >= <=
		//Logical operators : !(not) &&(and) ||(or)
		
		
		//relational
		int age = 12;
		if((age >= 5) && (age <= 6)) {
			System.out.println("Go to Kinergarten");
		} else if ((age >= 7) && (age <= 13)) {
			System.out.println("Go to Middle School");
		} else if ((age >= 14) && (age <= 18)) {
			System.out.println("Go to High School");
		} else {
			System.out.println("Stay Home");
		}

		
		//logical
		System.out.println("true || fakse = " + (true || false));
		System.out.println("!true = " + (!true));
		
		
		//boolean
		boolean canVote = (age >= 18) ? true : false;
		System.out.println("Can vote : " + canVote);
		
		
		//switch case
		String lang = "France";
		
		switch(lang) {
		case "Chile" : case "Cuba" :
				System.out.println("Hola");
				break;
		case "France" :
			System.out.println("Bonjour");
			break;
		case "Japan" :
			System.out.println("Konnichiwa");
			break;
		default:
			System.out.println("Hello");
			
		
		}
		
		
		
		
		

	}

}
