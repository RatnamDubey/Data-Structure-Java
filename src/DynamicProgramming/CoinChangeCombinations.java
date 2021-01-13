package DynamicProgramming;

import java.util.Scanner;

public class CoinChangeCombinations {

    public static void main (String args[]){
        System.out.println("Enter the size of an array");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the target value");
        int tar = scn.nextInt();

        int dp[] = new int[tar + 1];

        for ( int i = 0 ; i < arr.length ; i++){
            for ( int j = 0 ; j < dp.length ; j++){
                if ( j == 0){
                    dp[j] = 1;
                }
                else if (j < arr[i] ){
                    dp[j] = dp[j]+0;
                }
                else if ( j == arr[i]){
                    dp[j] = dp[j] + 1;
                }
                else{
                    int val = j - arr[i];
                    int temp = dp[val];
                    dp[j] = dp[j] + temp;
                }
            }

        }

        System.out.println("The total combination exists are " + dp[tar]);

     }



}
