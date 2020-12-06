package Arrays2D;

import java.util.Scanner;

public class MatrixMultiplication {

    public static void main (String args[]) {

        System.out.println("Enter the rows of the first matix ");
        Scanner scn = new Scanner(System.in);
        int r1 = scn.nextInt();
        System.out.println("Enter the columns of the first matix ");
        int c1 = scn.nextInt();

        /* creating the first matrix*/

        int arr1[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = scn.nextInt();
            }
        }

        System.out.println("Enter the rows of the Second matix ");
        int r2 = scn.nextInt();
        System.out.println("Enter the columns of the Second matix ");
        int c2 = scn.nextInt();

        /* creating the first matrix*/

        int arr2[][] = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = scn.nextInt();
            }
        }

        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible");
            return;
        }

        int prodarr[][] = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    prodarr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for(int k = 0 ; k<r1 ; k++){
            for(int m = 0 ; m<c2 ; m++){
                System.out.print(prodarr[k][m] + "\t" );
            }
            System.out.println();
        }


    }



}
