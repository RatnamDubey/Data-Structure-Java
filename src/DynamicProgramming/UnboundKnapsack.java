package DynamicProgramming;

import java.util.Scanner;

public class UnboundKnapsack {

    public static void main (String args[]){
        System.out.println("Enter the size of weight array");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int wgt[] = new int[n];
        int values[] = new int[n];
        for (int i = 0 ; i < wgt.length ; i ++ ){
            System.out.println("Enter the weight at" + i);
            wgt[i] = scn.nextInt();
        }

        for (int i = 0 ; i < values.length ; i ++ ){
            System.out.println("Enter the value at" + i);
            values[i] = scn.nextInt();
        }

        System.out.println("Enter target values");
        int tgt = scn.nextInt();

        int [] dp = new int[tgt + 1];
        dp[0] = 0;

        for ( int i = 1 ; i <= tgt ; i++ ){
            int max = 0;
            for ( int j = 0 ; j < n ; j ++){
                // getting all the values of the array 2,5,1,3,4
                if (  wgt[j] <= i ){
                    // if 2 <= 5 // then only enter ( if its greater than that it gets discart)
                    int rbagc = i - wgt[j];
                    // bag capacity = 5 - 2 = 3
                    int rbagv = dp[rbagc];
                    /// finding value at 3
                    int total_val = rbagv + values[j];
                    // adding current value to the bagvalue
                    // Updating max value at each node
                    // if any max is found update that max else do nothing
                    if ( max < total_val){
                        max = total_val;
                    }
                }
            }
            dp[i] = max;
        }
        System.out.println(dp[tgt]);
    }
}
