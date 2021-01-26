package com.lainlimbo;
import java.util.*;
import java.util.stream.IntStream;
public class Recurssion {
//the function calls itself
	static Scanner sc = new Scanner(System.in);
	
	static int factorial(int num) {
		/*
		 * whenever doing recursion make sure to add a condition
		 * where we no longer call a function
		 */
		
		if(num == 1) {
			return 1;
		} else {
			int result = num * factorial(num - 1);
			return result;
		}
	}
	
	static int getSum(int[] nums) {
		int sum = 0;
		for(int x: nums) sum += x;
		return sum;
	}
	
	public static void main(String[] args) {
		
		//EXAMPLE 1
		System.out.println("Fact 4 = " + factorial(4));
		//recursion is basically that functions inception
		/*
		 * take num = 4
		 * this calls factorial(3)
		 * which indeed calls factorial(2)
		 * which calls factorial(1)
		 */
		//this was getting inside and inside and inside of the function 'factorial'
		
		/*
		 * now num == 1
		 * hence factorial(1) returns2 to factorial(2)
		 * which returns "result=2*1" to factorial(3)
		 * which returns "result=3*2*1" to factorial(4)
		 * and then factorial(4) returns "result=4*3*2*1" to the main function
		 * where for the first time the function was called
		 * 
		 */
		
		//EXAMPLE 2
		int[] nums = {1,2,3};
		System.out.println("Sum = " + getSum(nums));
	}

}
