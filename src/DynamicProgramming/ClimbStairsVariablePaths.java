package DynamicProgramming;

import java.util.Scanner;

public class ClimbStairsVariablePaths {




    public static void main (String args[]){

        System.out.println("Enter the size of an array");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int [n];

        for ( int i = 0 ; i < n ; i ++ ){
            System.out.println("Enter the value at position " + i);
            arr[i] = scn.nextInt();
        }

        int [] dp = new int [n + 1];
        dp[n] = 1;

        for ( int i = n -1 ; i >=0 ; i -- ){
            for ( int j = 1 ; j <= arr[i] & i + j < dp.length ; j++ ){
                dp[i] = i + j;
            }
        }

        System.out.println(dp[0]);



    }
}
