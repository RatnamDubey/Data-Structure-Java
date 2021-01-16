package DynamicProgramming;

import java.util.Scanner;

public class CountBinaryStrings {
    public static void main (String args[]){
        System.out.println("Enter the string size");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int dp0 [] = new int[n + 1];
        int dp1 [] = new int[n + 1];

        dp0[1] = 1;
        dp1[1] = 1;

        for (int i = 2 ; i <= n ; i ++){
            dp0[i] = dp1[i -1];
            dp1[i] = dp0[i-1] + dp1[i-1];
        }

        int val = dp0[n]+ dp1[n];
        System.out.println("The total combinations are" + val );

        // Method 2



        int ozero = 1;
        int oones = 1;
        int nzero = 0;
        int nones = 0;

        for (int i = 2 ; i <= n ; i ++){
            nzero = oones;
            nones = ozero + oones;

            ozero = nzero;
            oones = nones;
        }

        val = nzero + nones;
        System.out.println("The total combinations are " + val );

    }

}
