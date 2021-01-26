package com.lainlimbo;
import java.util.*;
import java.util.stream.IntStream;
public class Methods {
//allows you to avoid duplicate code and help you organize it
//made outside the main function
	static Scanner sc = new Scanner(System.in);
	
	//receive two values and receive a sum
	public static int getSum(int x, int y) {
		//public : can be executed by any program that knows of your class
		//private : this function/method will only be available inside the body of the class
		//protected : function/method will be available to the class as well as any other subclass you create
		
		//static: belongs to the class rather than the object
		
		//int means it's going to return an integer
		
		return x + y;
	}
	
	
	public static void changeMe(int cNum) {
		cNum = 10;
		/*
		 * we passed zero through cNum 
		 * then a new variable was created cNum inside changeMe
		 * which only exists inside this method and seizes to exist outside
		 * Hence in main function the output would be ZERO itself 
		 */
	}
	
	
	public static int getSum2(int ... nums) {
		/*
		 * here the method is an improved version of getSum
		 * the passed int value is unknown
		 * s
		 */
		
		int sum = 0;
		for(int x: nums) {
			sum += x;
		}
		return sum;
	}
	
	
	static int[] getNext2(int x) {
		//return multiple different values
		//we want the next two values of int x
		
		//create an array
		int[] vals = new int[2];
		vals[0] = x + 1;
		vals[1] = x + 2;
		return vals;
	}
	
	static List<Object> getRandList() {
		String name = "Ishita";
		int age = 44;
		return Arrays.asList(name, age);
		//List<Object> is the return type
	}
	
	
	//MAIN FUNCTION
	public static void main(String[] args) {
		
		System.out.println("5 + 4 = " + getSum(5,4));
		//calling the function
		/*
		 * all data that is going to be passed is going to be passed by value
		 * so changes in a method have no effect outside the method
		 */
		
		int cNum = 0;
		changeMe(cNum);//passing the value of cNum to a method 'changeMe'
		System.out.println("cNum = " + cNum);
		
		
		System.out.println("sum : " + getSum2(1,2,3,4));//input random numbers or array
		
		
		int [] multVA = getNext2(5);
		for(int x: multVA) System.out.println(x);//return multiple values of same data type
		
		//receive multiple values of diff type
		List<Object> randList = getRandList();
		//list of object
		System.out.println(randList);
		
		
		
		

	}

}
