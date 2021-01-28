package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Fibonacci of " +n); System.out.print(" is " +fibMemoization(n,new int[n+1]));
    }

    //a calculation done once is done again and again.
    public static int fibRecursion(int n) {
        if(n==0 || n==1)
            return n;

        int fibnm1 = fibRecursion(n-1);
        int fibnm2 = fibRecursion(n-2);

        return fibnm1 + fibnm2;
    }

    //in dynamic programming we save the calculation once done, in a Question Bank array.
    public static int fibMemoization(int n, int[] qb) {
        //base case for fibonacci
        if(n==0 || n==1)
            return n;

        //base case for the qb
        //if the array at that index is empty then the base case is ignored
        //if the array is NOT empty then return the calculation already saved their
        if(qb[n] != 0)
            return qb[n];

        int fibnm1 = fibRecursion(n-1);
        int fibnm2 = fibRecursion(n-2);

        qb[n] = fibnm1 + fibnm2; //as we keep solving, save them in the question bank

        return fibnm1 + fibnm2;
    }


}
