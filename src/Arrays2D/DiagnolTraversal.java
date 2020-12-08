package Arrays2D;

import java.util.Scanner;

public class DiagnolTraversal {

    public static void main (String args[]){

        System.out.println("Enter the size of an array");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        int cnt = 10;

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j ++){
                arr[i][j] = cnt + 1;
                cnt++;
            }
        }

        /* Printing the Data diagonally*/

        for (int k = 0 ; k < n ; k++ ){
            for(int i = 0 , j = k   ;  j < n ; i++ , j++){
                System.out.print(arr[i][j] + "\t");

            }


        }





    }





}
