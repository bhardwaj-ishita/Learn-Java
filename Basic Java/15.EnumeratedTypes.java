package com.lainlimbo;
import java.util.*;
import java.util.stream.IntStream;
public class EnumeratedTypes {
//custom types that have a limited number of options 
	static Scanner sc = new Scanner(System.in);
	
	public enum Day {Monday, Tuesday, Wednesday};
	
	public static void main(String[] args) {
		
		Day favDay = Day.Monday;
		System.out.println("Fav day is " +favDay);

	}

}
