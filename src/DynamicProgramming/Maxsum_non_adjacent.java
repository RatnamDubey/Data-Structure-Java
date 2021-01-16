package DynamicProgramming;

import java.util.Scanner;

public class Maxsum_non_adjacent {

    public static void main (String args[]){
        System.out.println("Enter the size of the array");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr = new int[n];
        for (int i = 0 ; i < arr.length ; i ++){
            System.out.println("enter value at " + i + "index");
            arr[i] = scn.nextInt();
        }

        int [][] dp = new int [n][n];
        dp[0][0]= arr[0];
        dp[1][0] = 0;

        for (int i = 1 ; i < arr.length ; i++){
            dp[0][i] += dp[1][i-1] + arr[i];
            dp[1][i] = Math.max(dp[0][ i- 1] , dp[1][i - 1]) ;
        }
        System.out.println("array solution is " + dp[1][n - 1]);

        /// Non array solution

        int inc = arr[0];
        int exe = 0 ;

        for (int i = 1 ; i < arr.length ; i ++){
            int ninc = exe + arr[i];
            int nexe = Math.max(exe, inc);
            inc = ninc;
            exe = nexe;

        }
        System.out.println( "Non array solution  " + Math.max(inc , exe));

    }
}
