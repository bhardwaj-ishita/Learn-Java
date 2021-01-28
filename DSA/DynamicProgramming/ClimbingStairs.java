package com.company;

import java.util.Scanner;
//you are allowed to move max 1,2 or 3 stairs together
public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("No. of paths required to reach the bottom step from " +n); System.out.print("th step are " +countPathsTabulation(n));
    }

    //here again same calculations are being done again
    public static int countPathsRec(int n) {
        if(n == 0)
            return 1;//this counts as one of the ways to reach the bottom stair //basically just stand, don't move
        else if(n < 0)
            return 0;//you've gone underground //you can't come back

        int nm1 = countPathsRec(n - 1);
        int nm2 = countPathsRec(n - 2);
        int nm3 = countPathsRec(n - 3);

        return nm1 + nm2 + nm3;
    }

    public static int countPathsMemoization(int n, int[] qb) {
        //base case
        if(n == 0)
            return 1;//this counts as one of the ways to reach the bottom stair //basically just stand, don't move
        else if(n < 0)
            return 0;//you've gone underground //you can't come back

        //Memoization Base Case
        if(qb[n] != 0)
            return qb[n];

        int nm1 = countPathsRec(n - 1);
        int nm2 = countPathsRec(n - 2);
        int nm3 = countPathsRec(n - 3);

        qb[n] = nm1 + nm2 + nm3;

        return nm1 + nm2 + nm3;
    }

    //table format of dynamic programming
    //we don't use recursion for this but iteration
    public static int countPathsTabulation(int n) {
        //storage and meaning
        //direction where you'll start
        //travel and solve for each index

        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++) {
            if(i == 1){
                dp[i] = dp[i - 1];
            } else if(i == 2) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }

        return dp[n];
    }
}
