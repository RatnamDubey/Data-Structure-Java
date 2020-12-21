package Recurssion_array;

import java.util.Scanner;

public class AllindicesArray {

    public static int[]  allind( int arr[] , int idx , int val , int fsf){
        if ( idx == arr.length){
            return new int[fsf];
        }
        if (arr[idx] == val){
           int[] iarr  = allind(arr , idx + 1 , val , fsf + 1);
           iarr[fsf] = idx;
           return iarr;
        }
        else{
            int[] iarr  = allind(arr , idx + 1 , val , fsf );
            return iarr;
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
        int cnt = 0;

        int val[] = allind(arr,0 , val2  , 0 )  ;
        System.out.println("Index value is " + val.length);
    }






}
