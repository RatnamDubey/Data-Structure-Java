package Recurssion_array;

import java.util.Scanner;

public class reversedisplay {

    public static void revdis(int arr[] , int val){
        if ( val == 0 ){
            return;
        }

        System.out.println(arr[val-1]);
        revdis(arr, val-1);


    }

    public static void main (String args[]){
        System.out.println("Enter the size of an array");
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int arr[] = new int[size];

        for ( int i = 0 ; i < size ; i ++){
            arr[i] = scn.nextInt();
        }
        revdis(arr,size);


    }

}
