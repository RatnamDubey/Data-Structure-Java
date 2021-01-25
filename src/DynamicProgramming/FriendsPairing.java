package DynamicProgramming;

import java.util.Scanner;

public class FriendsPairing {

    public static void main (String args[]){

        System.out.println("Enter the number of friends");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int dp[] = new int[n + 1];

        ///designing the base cases
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3 ; i <= n ; i++ ){
            dp[i] = dp[i - 1]+ dp[i -2] * (i-1);
        }

        System.out.println("The total number of friends combination is " + dp[n]);

    }

}
