package com.lainlimbo;

import java.util.*;

import javax.swing.JOptionPane;

public class UserInput {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter name : ");
		if(sc.hasNextLine()) {
			//Line represents string here
			//we see if the input is a string then....
			//short, integer for diff data types
			
			String userName = sc.nextLine(); //storing the input
			System.out.println("Hello " + userName);
			
		}
		
		//dialog boxes
		String jopName = 
				JOptionPane.showInputDialog("Enter name");
		System.out.println("Helo " + jopName);
		

	}

}
