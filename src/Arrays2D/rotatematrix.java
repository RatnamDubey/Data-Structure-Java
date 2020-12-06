package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class rotatematrix {

    public static void main (String args[]){

        System.out.println("Enter the size of the matrix");
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();

        int arr[][] = new int [row][col];
        int cnt = 0;

        for (int i =0 ; i < row ; i++){
            for (int j =0 ; j < col ; j ++){
                arr[i][j] = cnt + 1;
                cnt++;

            }
        }

        int ro_arr[] = new int [row*col];
        int po =  0;

        for(int i = col -1 ;  i >= 0 ; i--){
            for(int j = 0 ; j < row ; j ++){
                ro_arr[po] = arr[j][i];
                po++;
            }
        }

        System.out.println(Arrays.toString(ro_arr));


    }




}
