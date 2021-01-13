package DynamicProgramming;

import java.util.Scanner;

public class ZeroKnapsack {

    public static void main (String args[]){

        System.out.println("Enter the size of the array" );
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int weight [] = new int[n];
        int val [] = new int[n];

        for (int i = 0 ; i < weight.length ; i ++){
            val[i] = scn.nextInt();
        }
        System.out.println("Enter the weight associated to val like // 2, 3, 5 ");
        for (int i = 0 ; i < val.length ; i ++){
            weight[i] = scn.nextInt();
        }

        System.out.println("Enter target values");
        int tgt = scn.nextInt();

        /// Code starts
        // creating 2D array with

        int dp [][] = new int[ n + 1 ][ tgt + 1];

        for ( int i = 1 ; i < dp.length ; i ++ ){
            for (int j = 1 ; j < dp[0].length ; j ++){
                // when current value desnt bat
                if ( j >= weight[i - 1]){
                    int rcap = j - weight[i -1]; // j == 4 , weight[3] = 2 rcap = 2 , this needs to be checked in the previous row
                    int curr_score  = dp[i - 1 ][rcap] + val[i - 1];
                    int prev_score = dp[i-1][j];
                    if ( curr_score > prev_score  ){
                           dp[i][j] = curr_score;
                    }
                    else{
                        dp[i][j] = prev_score;
                    }
                }
                else{
                    dp[i][j] = dp[i-1][j];

                }
            }
        }
        System.out.println(dp[n ][tgt] );

    }
}
