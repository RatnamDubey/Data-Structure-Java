package Recurssion_array;

import java.util.Scanner;

public class firstindex {

    public static int  fstidx( int arr[] , int idx , int val){

        if ( idx == arr.length -1){
            return -1;
        }
        if ( arr[idx] == val){
            return(idx);
        }
        else{
            int maxa = fstidx(arr , idx + 1 , val);
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

        int val = fstidx(arr,0 , val2)  ;
        System.out.println("Index value is " + val);
    }



}
