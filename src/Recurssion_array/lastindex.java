package Recurssion_array;

import java.util.Scanner;

public class lastindex {

    public static int  lstidx( int arr[] , int idx , int val){

        if ( idx == 0){
            return -1;
        }
        if ( arr[idx] == val){
            return(idx);
        }
        else{
            int maxa = lstidx(arr , idx -1 , val);
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
        System.out.println("Enter the value to find");
        int val2 = scn.nextInt();

        int val = lstidx(arr, arr.length -1 , val2)  ;
        System.out.println("Index value is " + val);
    }


}
