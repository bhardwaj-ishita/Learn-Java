package com.lainlimbo;

import java.util.*;

public class LinkedListArray {
//when we have to make many changes in the middle of the list
//each item in the list has reference to the value before and after it
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		LinkedList<Integer> iL1 = new LinkedList<Integer>();
		//make a linked list
		iL1.add(1); iL1.add(2); iL1.add(3);
		//add values
		iL1.addAll(Arrays.asList(1,2,3,4));
		//add whole bunch of items
		iL1.addFirst(0); iL1.addLast(5);
		//add in front and last of the list
		System.out.println(iL1.contains(4));
		//check if value inside of list
		System.out.println(iL1.indexOf(4));
		//find index of value
		iL1.set(0, 2);
		//replace values
		System.out.println(iL1.get(0));
		System.out.println(iL1.get(1));
		System.out.println(iL1.get(2));
		System.out.println(iL1.get(3));
		System.out.println(iL1.get(4));
		System.out.println(iL1.get(5));
		System.out.println(iL1.get(6));
		System.out.println(iL1.get(7));
		//get items
		iL1.remove(1);
		//remove items
		System.out.println(iL1.size());
		//get number of items
		Object[] a9 = iL1.toArray();
		//convert it into in array
		for(Integer x: iL1) System.out.println(x);
		//print the list
		
		
		

	} 

}
