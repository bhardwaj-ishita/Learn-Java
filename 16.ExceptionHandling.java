package com.lainlimbo;
import java.util.*;
public class ExceptionHandling {
//catch errors that could crash your program
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		try {
			//surround problematic code with try block
			int badInt = 10/0;
			//you can also put up custom messages for different type of exceptions
			throw new Exception("Bad Stuff");
			
		}
		
		//to catch a specific exception
		catch(ArithmeticException ex) {
			//to catch the particular problem use catch
			//arithmaticException is the problem we are trying to catch here
			//we will use ex to get the message when error rises
			System.out.println("Can't divide by zero");//the message
			System.out.println(ex.getMessage());//automatically generated message
			System.out.println(ex.toString());//to convert it in a string form
		}  
		
		//to catchall exceptions. ANY
		//not preferred
		//still used by lot
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
		//to clean up after any of these codes have been executed
		//any closed files or databases or any other clean ups needed
		//put these inside the finally block
		finally {
			System.out.println("Clean up");//just a message
		}
	}
}
