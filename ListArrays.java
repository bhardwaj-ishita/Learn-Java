package com.lainlimbo;

import java.util.*;

import java.util.stream.IntStream;

public class ListArrays {
//resize, insertion and deletion easy
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<String> aL1= new ArrayList<String>(20);
		aL1.add("Sue");
		//add a string
		ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(1,2,3,4));
		//generate an array
		for(Integer x: aL2) System.out.print(x);//didn't put println bcoz put everything in on line
		System.out.println(aL2.get(1));
		// get value at 1 index ie second value
		aL2.set(1,5);
		//add value 5 at index 1 
		aL2.remove(3);
		//remove index 3
		//aL2.clear()  -->  will delete everything
		
		//ITERATOR
		//cycle through collection
		Iterator it = aL2.iterator(); //iterator made
		while(it.hasNext()) {//to cycle through array by iterator
			System.out.println(it.next());
			
		}

	}

}
	
	