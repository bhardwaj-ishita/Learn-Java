package com.lainlimbo;

import java.util.*;

import java.util.stream.IntStream;

public class DataTypes {
// data type is how much memory we are storing aside for a value
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//byte, short, char, boolean, int, float
		//double, long
		
		//to find the range of a data type use MAX_VALUE and MIN_VALUE

		System.out.println("Byte Max:" + Byte.MAX_VALUE);
		System.out.println("Byte Min:" + Byte.MIN_VALUE);
		System.out.println("Short Max:" + Short.MAX_VALUE);
		System.out.println("Short Min:" + Short.MIN_VALUE);
		System.out.println("Char Max:" + (Character.MAX_VALUE+0));
		System.out.println("Char Min:" + (Character.MIN_VALUE+0));
		System.out.println("Int Max:" +	Integer.MAX_VALUE);
		System.out.println("Int Min:" +	Integer.MIN_VALUE);
		System.out.println("Float Max:" + Float.MAX_VALUE);
		System.out.println("Float Min:" + Float.MIN_VALUE);
		System.out.println("Double Max:" + Double.MAX_VALUE);
		System.out.println("Double Min:" + Double.MIN_VALUE);
		System.out.println("Long Max:" + Long.MAX_VALUE);
		System.out.println("Long Min:" + Long.MIN_VALUE);
	
		//use + in println when want to add more things after " "
				
		boolean happy = true;
		//value either true or false
		//can't use 0 or 1 like in other languages
		
		char a = 'a';
		//only save single character
		//char can also save below things too
		// \n new line \t tab \b backspace \f form feeds \r returns
		// \" double quote \' single quote \\ back slash
		
		float fNUM = 1.645245665464656F;
		float fNUM2 = 1.8838758375535F;
		//precision = 6 decimal places
		//use F to denote it as a float
		
		System.out.println("FLoat : " + (fNUM + fNUM2));
		
		double dblNUM = 1.645245665464656;
		double dblNUM2 = 1.8838758375535;
		//precision upto 15 decimal places
		
		System.out.println("Double : " + (dblNUM + dblNUM2));
		
		double thousand = 1e+3;
		System.out.print(thousand);
		//can also use scientific notation
		
		long bigNUM = 123_456_789;
		//use underscore to write big numbers
		
		//MORE INFO
		int myValue = 10000;

       		int myMinIntValue = Integer.MIN_VALUE;
        	int myMaxIntValue = Integer.MAX_VALUE;
       		//wrapper class is for all 8 primitive types
        	//int, long, shor, double, float, char, byte, boolean
        	//helps in performing operations on the type

        	System.out.println("Int Min value = " + myMinIntValue);
        	System.out.println("Int Max Value = " + myMaxIntValue);

        	System.out.println(myMaxIntValue + 1);
        	//overflow: by adding value larger than the max value
        	//the computer tried to fit it and took it to negatives
        	//same happens for (min value - 1); this is called underflow

        	//2_147_483_647

        	//size and width of primitive types
        	/*
        	byte =  bits
		short = 16 bits
       		integer = 32 bits
        	long = 64 bit
        	*/

        	long myLongValue = 100L;
       		long intMaxValue = 2_147_483_647_657;
        	long intLongValue = 2_147_483_647_657L;
        	//any whole number is by default taken as integer
        	//that's why you need to specify if a number taken is long
        	//by putting an L at the end
		
	}
	

}
