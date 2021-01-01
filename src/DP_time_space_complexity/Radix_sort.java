package DP_time_space_complexity;
import java.io.*;
import java.util.*;

public class Radix_sort {

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

    public static void radixSort(int[] arr) {

        int maxval = maxarr(arr,0);
        int exp = 1;
        while(exp <= maxval){
            countSort(arr,exp);
            exp = exp * 10;
        }

        // write code here
    }

    public static void countSort(int[] arr, int exp) {
        // write code here

        int [] new_arr = new int[10];
        for (int i = 0 ; i < arr.length    ; i ++){
            int temp = arr[i]/exp % 10;
            new_arr[temp]++;
        }

        for ( int i = 1 ; i < new_arr.length ; i++){
            new_arr[i] = new_arr[i]+new_arr[i-1];
        }

        int [] ans = new int [arr.length];

        for ( int i = arr.length -1  ; i >= 0 ; i --){
            int val = arr[i]/exp % 10;;
            int pos = new_arr[val ];
            int idx = pos -1;
            ans[idx] = arr[i];
            new_arr[val]--;

        }

        for ( int i = 0 ; i < arr.length ; i++){
            arr[i] = ans[i];
        }

        System.out.print("After sorting on " + exp + " place -> ");
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element "+ i + " of an array");
            arr[i] = scn.nextInt();
        }
        radixSort(arr);
        print(arr);
    }

}