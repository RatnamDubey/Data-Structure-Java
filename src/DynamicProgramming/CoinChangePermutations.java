package DynamicProgramming;

import java.util.Scanner;

public class CoinChangePermutations {

    public static void main (String args[]){

        System.out.println("Enter the array size of the coin");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];

        for ( int i = 0 ; i < arr.length ; i ++ ){
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the target value");
        int tgt = scn.nextInt();

        int [] dp = new int[tgt + 1];
        dp[0] = 1;

        for (int i = 1 ; i < dp.length ; i ++  ){
            for ( int j = 0 ; j < arr.length ; j++ ){
                    if(arr[j] <= i  ){
                        int rem = i - arr[j];
                        dp[i] = dp[i] + dp[rem];
                    }


            }
        }


        System.out.println("The total combination exists are " + dp[tgt]);



    }



}
