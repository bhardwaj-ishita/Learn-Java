package com.lainlimbo;

import java.util.*;

import java.util.stream.IntStream;

public class MathFunctions {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
			
		//basic maths functions and shortcuts
		System.out.println("5 + 4 = " +(5+4));
		System.out.println("5 - 4 = " +(5-4));
		System.out.println("5 * 4 = " +(5*4));
		System.out.println("5 / 4 = " +(5/4));
		System.out.println("5 % 4 = " +(5%4));
		System.out.println("5 / 4 = " +(5.0/4.0));
		//integers return integers
		//doubles returns doubles
		
		//incMe++ == incMe = incMe + 1 
		//incMe += 10 == incMe = incMe + 10
		int incMe = 0;
		System.out.println("incMe: " +(incMe++));
		//incMe++ ads 1 after the work has been done
		System.out.println("incMe: " +(++incMe));
		//++incME adds 1 and then do the work
		
		
		//in-built math functions
		System.out.println("abs(-1) = " +Math.abs(-1));
		//absolute value 
		System.out.println("ceil(4.25) = " +Math.ceil(4.25));
		//ceil == round off to larger value value
		System.out.println("floor(4.25) = " +Math.floor(4.25));
		//largest integer that is less than or equal to th argument
		System.out.println("round(4.25) = " +Math.round(4.25));
		//round of decimal to nearest value
		System.out.println("max(4,5) = " +Math.max(4, 5));
		System.out.println("min(4,5) = " +Math.min(4, 5));
		System.out.println("exp(1) = " +Math.exp(1));
		System.out.println("log(1) = " +Math.log(1));
		System.out.println("log10(1) = " +Math.log10(1));
		System.out.println("pow(2,2) = " +Math.pow(2, 2));
		System.out.println("sqrt(4) = " +Math.sqrt(4));
		System.out.println("cbrt(4) = " +Math.cbrt(4));
		//cube root
		System.out.println("hypo(5,5) = " +Math.hypot(5, 5));//hypotenuse
		System.out.println("PI = " +Math.PI);
		
		
		//numerous math functions
		System.out.println("sin(1.5708) = " +Math.sin(1.5708));
		System.out.println("cos(1.5708 = " +Math.cos(1.5708));
		System.out.println("tan(1.5708) = " +Math.tan(1.5708));
		System.out.println("asin(1.5708) = " +Math.asin(1.5708));//inverse
		System.out.println("acos(1.5708) = " +Math.acos(1.5708));//inverse
		System.out.println("atan(1.5708) = " +Math.atan(1.5708));//inverse
		System.out.println("sinh(1.5708) = " +Math.sinh(1.5708));
		System.out.println("cosh(1.5708) = " +Math.cosh(1.5708));
		System.out.println("tanh(1.5708) = " +Math.tanh(1.5708));
		System.out.println("toDegrees(1.5708) = " +Math.toDegrees(1.5708));
		System.out.println("toRadians(1.5708) = " +Math.toRadians(1.5708));
		
		//random number
		int minNum = 5;
		int maxNum = 20;
		int randNum = minNum + (int)(Math.random() * ((maxNum - minNum) + 1));
		System.out.println("Rand : " +randNum);
		
	}

}
