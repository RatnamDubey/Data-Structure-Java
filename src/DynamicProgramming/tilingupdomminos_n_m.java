package DynamicProgramming;

import java.util.Scanner;

public class tilingupdomminos_n_m {

    public static void main (String args[]){
        System.out.println("Enter the n lengn of the tile");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Enter the  m  width of the tile ");
        int m = scn.nextInt();
        System.out.println("The tile width will be " + m );

        int arr[] = new int[n+1];
        for (int i = 1 ; i <= n ; i ++){
            if (i < m ){
                arr[i] = 1;
            }
            else if (i == m){
                arr[i] = 2;
            }
            else {
                arr[i] = arr[i - 1] + arr[i - m];
                // i - 1 for one tile vertical rest ( total area minus vertical tile
                // i -m for the area remaing
            }
        }
        System.out.println("Total number of ways possible is " + arr[n]);
    }
}
