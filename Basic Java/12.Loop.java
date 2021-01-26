package com.lainlimbo;
import java.util.*;
import java.util.stream.IntStream;
public class Loop {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//for loop
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		//while loop
		int wL = 0;
		while(wL < 20) {
			if(wL % 2 == 0) {
				System.out.println(wL);
				wL++;
				continue; //if want to skip below executing and start from the top
			}
			if(wL >= 10) {
				break;//ignore this statement and continue
			}
			wL++;
		}
		
		//do-while loop
		int secretNum = 7;
		int guess = 0;
		do {
			System.out.println("Guess : ");
			if(sc.hasNextInt()) {
				guess = sc.nextInt();
			}
		} while(secretNum != guess);
		System.out.println("You guessed it");
		 
		
		
		
		
		
		

	}

}
