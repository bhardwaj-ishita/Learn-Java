package com.lainlimbo;
import java.util.*;
public class ExceptionHandling {
//catch errors that could crash your program
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		try {
			int badInt = 10/0;
		}
		
		catch(ArithmeticException ex) {
			System.out.println("Can't divide by zero");
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
		}
		
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}
		
		finally {
			System.out.println("Clean up");
		}
	}
	
}
