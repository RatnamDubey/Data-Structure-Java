package Arrays2D;

import java.util.Scanner;

public class SpiralDisplay {

    public static void main (String args[]){

        System.out.println("Enter the row and column of the matrix");
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();


        System.out.println("Enter values");

        int arr[][] = new int[row][col];

        for (int i = 0 ; i < row ; i++){
            for ( int j = 0 ; j < col ; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        System.out.println("Input completed !!");

        int minr =0;
        int minc = 0;
        int maxr = row -1;
        int maxc = col -1;

        /*Control structure*/
        int totalele = row*col;
        int cnt = 0;

        /* CReating four loops for the wall*/


        while(cnt < totalele) {

            for (int i = minr, j = minc; i <= maxr  && cnt < totalele; i++) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;

            for (int i = maxr, j = minc; j <= maxc  && cnt < totalele; j++) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;

            for (int i = maxr, j = maxc; i >= minr  && cnt < totalele; i--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;
            for (int i = minr, j = maxc; j >= minc  && cnt < totalele; j--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;


        }

    }



}
