package Recurssion_array;

import java.util.Scanner;

public class displayarray {

    public static void disarr(int arr1[] , int size){

        if (arr1.length == size){
            return;
        }
        System.out.println(arr1[size]);
        disarr(arr1,size+1);


    }



    public static void main(String args[]){

        System.out.println("Enter the value of size of array");
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int arr [] = new int[size];

        for ( int i = 0 ; i < size ; i ++){
            arr[i] = scn.nextInt();
        }
        disarr(arr,0);



    }

}
