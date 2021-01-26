package com.lainlimbo;

import java.util.*;

import java.util.stream.IntStream;

public class StringBuildersAndBuffers {
//when making many string changes use string builder
//string buffer used with threads
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		StringBuilder sb = new 
				StringBuilder("I'm a string builder");
		
		System.out.println(sb.length()); //length
		System.out.println(sb.capacity()); //size
		sb.append(" Yeah"); //append
		System.out.println(sb.insert(6, "Big ")); //inserts in the string
		System.out.println(sb.replace(6, 9, "wig")); //replace
		System.out.println(sb.substring(6,10)); //extract sub-strings
		System.out.println(sb.delete(6, 10)); //add or delete characters
		System.out.println(sb.charAt(4)); //find character at a specific index
		System.out.println(sb.indexOf("Yeah")); //find index of a sub-string
		
		/*
		 * String buffer is similar to string builders
		 * 
		 * StringBuilder sb = new 
				StringBuffer("I'm a string builder");
				
				that's it!
		 */

	}

}
