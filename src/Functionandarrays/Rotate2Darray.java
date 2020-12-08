package Functionandarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate2Darray {

    public static void rotate (int [] oned , int li , int ri){
        while(li<ri){
            int temp = oned[li];
            oned[li] = oned[ri];
            oned[ri] = temp;
            li++;
            ri--;
    }

    }






    public static void main(String args[]){

        System.out.println("Enter the Sise of the 2D array");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        int cnt = 0 ;
        int ro_arr[] = new int[n];

        for (int i = 0 ; i < n ; i ++){
            arr[i] = cnt + 1;
            cnt++;
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Created an array !!  Enter the roataion sequence");
        int m = scn.nextInt();


        rotate(arr ,0 , arr.length-m-1);
        rotate(arr ,arr.length-m , arr.length-1);
        rotate(arr ,0 , arr.length-1);




        System.out.println(Arrays.toString(arr));







    }



}
