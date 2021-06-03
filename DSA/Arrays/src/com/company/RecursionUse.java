package com.company;

import java.util.Scanner;

public class RecursionUse {
    //recursive call stacks keep adding up
    //there needs to be a condition where this recursion ends aka BREAKING CONDITION or BASE CASE
    //which is the least and simplified test case
    //then the stacks start resolving
    //call stack only has a certain amt of memory
    //hence if base case not applied, STACK OVERFLOW might happen.

    //iteration runs faster than recursion and occupies less space
    //overhead involved for pushing calls on the call stack
    //each stack frame uses some memory
    //but recursion is intuitive

    //JAVA doesn't use TAIL RECURSION

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your number ;) :");
        int n = sc.nextInt();
        System.out.printf("Factorial of %d is = %d", n, factorial(n));
    }

    public static long factorial(int n) {
        if(n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}