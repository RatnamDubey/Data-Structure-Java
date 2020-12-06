package Arrays2D;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class WaveTraversal {

    public static void main(String args[]) {

        System.out.println("Enter the row of the matrix ");
        Scanner scn = new Scanner(System.in);
        int r1 = scn.nextInt();
        System.out.println("Enter the columns of the matrix");
        int c1 = scn.nextInt();

        int arr[][] = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("wave values");

        for(int j = 0 ; j < arr[0].length ; j ++){
            if (j%2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i][j]);
                }
            }
            else {
                for (int i = arr.length - 1 ; i >= 0 ; i--){
                    System.out.println(arr[i][j]);
                }
            }
        }


    }
}




