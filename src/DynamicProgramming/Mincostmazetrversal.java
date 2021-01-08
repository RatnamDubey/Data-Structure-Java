package DynamicProgramming;

import java.util.Scanner;

public class Mincostmazetrversal {

    public static void main (String args[]){

        System.out.println("Enter the maze row size");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Enter the maze col size");
        int m = scn.nextInt();

        int [][] dp = new int[n][m];

        for (int i =0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                System.out.println("Enter the array value at  " + i + ", " + j);
                dp[i][j] = scn.nextInt();
            }
        }

        int [][] finalmaze = new int[n][m];

        for(int i = finalmaze.length -1 ; i >= 0 ; i-- ){
            for ( int j = finalmaze[0].length -1 ; j >= 0 ; j--){

                if (i == finalmaze.length -1 && j == finalmaze[0].length -1){
                    finalmaze[i][j] = dp [i][j];
                }
                else if ( i == finalmaze.length -1 ){
                    finalmaze[i][j] = dp[i][j] + finalmaze[i][j + 1];
                }
                else if ( j == finalmaze[0].length -1 ){
                    finalmaze[i][j] = dp[i][j] + finalmaze[i + 1][j];
                }
                else{
                    finalmaze[i][j] = dp[i][j] +  Math.min( finalmaze[i +1][j] , dp [i][j+1] );
                }
            }
        }


        System.out.println("The min shortest distance is  " + finalmaze[0][0]);


    }







}
