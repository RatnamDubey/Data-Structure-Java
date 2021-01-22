package DynamicProgramming;

import java.util.Scanner;

public class tilingupdominos {

    public static void main (String args[]){
        System.out.println("Enter the board size");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n+ 1];

        ///lets define the base case
        arr[1] = 1;
        arr[2] = 2 ;

        for (int i = 3 ; i <= n ; i++){
            arr[i] = arr[i-1]+ arr[i-2];
        }

        System.out.println("The total number of ways tiles can be arranged is " + arr[n]);



    }

}
