package Arrays2D;

import java.util.Scanner;

public class RotateMatixPart2 {

    public static void main (String args[]){


        System.out.println("Enter the size of the matrix");
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();


        int arr[][] = new int [row][row];
        int cnt = 0;

        for (int i =0 ; i < row ; i++){
            for (int j =0 ; j < row ; j ++){
                arr[i][j] = cnt + 1;
                cnt++;

            }
        }

        System.out.println("Entered ");

        /*Transpose*/

        for(int i = 0 ; i < arr.length ; i++){
            for ( int j = i ; j < arr[0].length ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println("Traspose completed");

        for(int i = 0 ; i < arr.length ; i ++){
            int li = 0 ;
            int ri = arr[i].length-1;
            while(li<ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }
        }






        for(int i =0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }





    }

}
