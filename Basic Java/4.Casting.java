package com.lainlimbo;

import java.util.*;

import java.util.stream.IntStream;

public class Casting {
	//casting means converting one data type to another
	//by default convert small to larger types
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int smInt = 10;
		long smLong = smInt;
		//conversion from int to long
		
		double cDbl = 1.234;
		int cInt = (int) cDbl;
		System.out.println(cInt);
		//conversion of double to int
		//the decimal values will be lost during this casting

		long bigLong = 2234435454L;
		//L to represent that it's long
		int bInt = (int) bigLong;
		System.out.println(bInt);
		//output weird
		
		String favNum = Double.toString(1.618);
		//toString is a rapper class to convert to a string
		//Byte.parseByte to covert string to Byte
		//Boolean.parseBoolean to convert string to Boolean
		int strInt = Integer.parseInt("10");
		System.out.println(strInt);
		

	}

}
