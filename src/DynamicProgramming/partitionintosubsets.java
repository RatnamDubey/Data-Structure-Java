package DynamicProgramming;

import java.util.Scanner;

public class partitionintosubsets {

    public static void main (String args[]){
        System.out.println("Enter the number of elements");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Enter the number of subsets");
        int k = scn.nextInt();

        if (n ==0 || k == 0 || n < k){
            System.out.println("Invaild inputs");
        }

        int dp [][] = new int[k+ 1][n + 1];

        for (int i = 1 ; i <= k ; i ++){
            for (int j = 1 ; j <= n ; j ++ ){
                if ( j < i){
                    dp[i][j] = 0;
                }
                else if (j == i){
                    dp[i][j] = 1;
                }
                else {
                    dp[i][j] = i * dp[ i ][j - 1]  + dp[i-1][j-1];
                }
            }
        }
        System.out.println("Total number of subsets possible is " + dp[k][n]);
    }
}
