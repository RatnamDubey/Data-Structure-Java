package DynamicProgramming;

import java.util.Scanner;

public class painthousemanycolor {

    public static void main (String args[]){

        System.out.println("Enter the color value");
        Scanner scn = new Scanner(System.in);
        int c = scn.nextInt();
        System.out.println("Enter house value");
        int h = scn.nextInt();

        int arr[][] = new int[h][c];
        for ( int i = 0 ; i < arr.length ; i++ ){
            for (int j = 0 ; j < arr[0].length ; j ++){
                System.out.println("Enter value " + i + " , " + j);
                arr[i][j] = scn.nextInt();
            }
        }

        int dp [][] = new int[h][c];

        /// now the tough part !!
        for (int j = 0 ; j < arr[0].length ; j ++){
            dp[0][j] = arr[0][j];
        }

        for ( int i = 1 ; i < arr.length ; i ++){
            for ( int j = 0 ; j < arr[0].length ; j ++){
                int min = Integer.MAX_VALUE;
                for ( int k = 0 ;  k < arr[0].length ; k ++){
                    if(k != j){
                        if(dp[i-1][k] < min){
                            min = dp[i-1][k];
                        }
                    }
                }
            dp[i][j] = min + arr[i][j];

            }
        }

    }
}
