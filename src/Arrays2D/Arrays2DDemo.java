package Arrays2D;

import java.util.Scanner;

public class Arrays2DDemo {

    public static void main (String args[]){

        System.out.println("Enter the rows in the array");
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        System.out.println("Enter the columns in the array");
        int col = scn.nextInt();

        int arr[][] = new int[row][col];

        for(int i = 0 ; i < row; i++){
            for (int j = 0 ; j < col ; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for(int k = 0 ; k<row ; k++){
            for(int m = 0 ; m<col ; m++){
                System.out.print(arr[k][m] + "\t" );
            }
            System.out.println();
        }


    }

}
