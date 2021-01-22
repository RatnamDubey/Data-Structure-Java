package DynamicProgramming;

import java.util.Scanner;

public class PaintFence {

    public static void main (String args[]){

        System.out.println("Enter the number of fences");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Enter the numbet of color");
        int k = scn.nextInt();

        int arr[][] = new int[3][n];

        for (int i = 1 ; i < n ; i ++){
            if (i == 1){
                arr[0][i] = k;
                arr[1][i] = k * (k -1);
                arr[2][i] = arr[0][i] + arr[1][i];
            }
            else{
                arr[0][i] = arr[1][i-1];
                arr[1][i] = arr[2][i-1]  * (k -1);
                arr[2][i] = arr[0][i] + arr[1][i];
            }

        }
        System.out.println("The total number of combinations will be " + arr[2][n-1]);

    }


}
