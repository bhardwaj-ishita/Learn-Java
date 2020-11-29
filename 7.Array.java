package com.lainlimbo;

import java.util.*;

import java.util.stream.IntStream;

public class Array {
//boxes of memory that assign names to multiple values 
//instead of one
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int[] a1 = new int[10];
		a1[0] = 1; //fill values
		Arrays.fill(a1,2);  //fill values in all left spots
		System.out.println(a1[0]); //print values
		System.out.println(a1.length); //length of array
		
		String[] a2 = {"one", "two"}; //string array; can only add strings
		int[] oneTo10 = IntStream.rangeClosed(1,10).toArray();
		/*
		 * make an int array
		 * name of array
		 * rangeClosed=the range of arrays
		 * toArray=make this to an array
		 */
		//generate an array
		
		for(int x: oneTo10) System.out.println(x);
		//enhanced loop
		//will print values of the array
		
		System.out.println(Arrays.binarySearch(oneTo10, 9));
		//find values i arrays
		
		int a3[][]= new int[2][2];
		//multi dimensional array
		//matrix [down][across]
		
		String[][] a4 = {{"00", "10"},
						 {"01", "11"}};
		//multi dimensional string array 
		
		System.out.println(a4[1][1]);
		//[1][1] is 2nd row 2nd column
		
		String a5[][][] = {{{"000"}, {"100"}, {"200"}, {"300"}},
						  {{"010"}, {"110"}, {"210"}, {"310"}},
						  {{"020"}, {"120"}, {"220"}, {"320"}}};
		
		System.out.println(a5[2][3][0]);
		//[rows][columns][pages]
		
		int a6[] = {1,2,3};
		int a7[] = Arrays.copyOf(a6,3);
		//copy an array into another
		System.out.println(Arrays.equals(a6,a7));
		//command to compare arrays
		int a8[] = {3,2,1};
		Arrays.sort(a8);
		//sort arrays
		System.out.println(Arrays.toString(a8));
		//convert an array to string and output it
		
	}

}
