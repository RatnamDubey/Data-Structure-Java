package DynamicProgramming;

import java.util.Scanner;

public class PaintHouse {

    public static void main (String args[]){

        System.out.println("Enter the number of houses");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[][] = new int[3][n];

        for (int i = 0 ; i < arr.length ; i ++){
            for (int j = 0 ; j < arr[0].length ; j++){
                System.out.println("Enter " + i + " value and " + j  );
                arr[i][j] = scn.nextInt();
            }
        }

        // Checking the Minimum house cost now
        int dp [][] = new int [3][n];

        dp[0][0] = arr[0][0];
        dp[1][0] = arr[1][0];
        dp[2][0] = arr[2][0];
        int min = 0;


        for ( int j = 1 ; j < arr[0].length ; j ++ ){
            for ( int i = 0 ; i < arr.length ; i ++){
                if(i == 0){
                    min = Math.min( dp[i+1][j-1] , dp[i+2][j-1]);
                }
                else if ( i == 1){
                    min = Math.min( dp[i-1][j-1] , dp[i+1][j-1]);
                }
                else{
                    min = Math.min( dp[i-1][j-1] , dp[i-2][j-1]);
                }
                dp[i][j] = arr[i][j] + min;


            }
        }


        min = Math.min( dp[0][3] , dp[1][3]);
        min = Math.min( dp[2][3] , min);

        System.out.println( "minimum cost to the house is" +  min);

    }
}
