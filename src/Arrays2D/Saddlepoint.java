package Arrays2D;

import java.util.Scanner;
import java.util.Random;


public class Saddlepoint {

    public static void main (String args[]){

        System.out.println("Enter the size of the matrix");
        Scanner scn = new Scanner(System.in);
        int n = 30;
        int arr [][] = new int[n][n];
        int max = 50;
        int min = 10;
        int upperbound = 25;
        //generate random values from 0-24
        Random rand = new Random();

        for (int i =0 ; i < n ; i ++){
            for (int j = 0 ; j < n ; j++){
                arr[i][j] =  rand.nextInt(upperbound);
            }
        }

        for (int i =0 ; i < n ; i ++){
            for (int j = 0 ; j < n ; j++){
                System.out.print(arr[i][j] + "\t") ;
            }
            System.out.println();
        }

        /*Checking for Saddle point*/

        for (int i =0  ; i < n ; i ++){
            int svj = 0;
            for(int j = 1 ;  j < n ; j++){
                if (arr[i][j] < arr[i][svj]){
                    svj = j;
                }
            }

            boolean flag = true;
            for (int k = 0 ; k < n ; k++){
                if(arr[k][svj] > arr[i][svj]){
                    flag = false;
                    break;
                }
            }

            if ( flag == true){
                System.out.println("Saddle value is " + arr[i][svj] );
            }

        }



    }


}
