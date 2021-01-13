package DynamicProgramming;

import java.util.Scanner;

public class TargetsumSubsets {


    public static void main (String args []){
        System.out.println("Enter the size of an array");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0 ; i < arr.length ; i++){
            System.out.println("Enter the value at index" + i);
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter target want to check");
        int tar = scn.nextInt();

        boolean dp[][] = new boolean[n + 1][tar + 1];

        for (int i =0 ; i < dp.length ; i ++){
            for (int j = 0 ; j < dp[0].length ; j++){

                if (i == 0 & j == 0 ){
                    dp[i][j] = true;
                }
                else if ( i == 0){
                    dp[i][j] = false;
                }
                else if (j == 0){
                    dp[i][j] = true;
                }
                else{
                    if (dp[i -1][j] == true){
                        dp[i][j] = true;
                    }
                    else{
                        int val = arr[i - 1];
                        if ( j >= val){
                            // The below clause needs to be understood properlyt
                            if (dp[i - 1][j - val] == true){
                                dp[i][j] = true;
                            }
                        }
                    }

                }


            }
        }

        System.out.println("The subset of the array is " + dp[arr.length][tar]  + "  possible for given target");
    }
}
