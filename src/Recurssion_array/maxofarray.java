package Recurssion_array;

import java.util.Scanner;

public class maxofarray {

    public static int maxarr( int arr[] , int idx){
        if ( idx == arr.length -1){
            return arr[idx];
        }

        int maxa = maxarr(arr , idx + 1);
        if ( arr[idx] > maxa){
            return arr[idx];
        }
        else {
            return maxa;
        }
    }



    public static void main (String args[]){
        System.out.println("Enter the size of an array");
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int arr[] = new int[size];
        for ( int i = 0  ; i < size ; i ++){
            arr[i] = scn.nextInt();
        }

        int val = maxarr(arr,0)  ;
        System.out.println("Max value is " + val);
    }




}
