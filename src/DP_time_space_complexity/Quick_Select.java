package DP_time_space_complexity;
import java.io.*;
import java.util.*;


public class Quick_Select {

    public static int quickSelect(int[] arr, int lo, int hi, int k) {
        if (  lo >= hi ){
            return arr[lo];
        }


        int pivot = arr[hi];
        int pi = partition(arr,pivot,lo , hi);
        if ( pi > k){
            quickSelect(arr , lo , pi -1 , k  );
        }
        else if ( pi < k ){
            quickSelect(arr,  pi +1 , hi , k  );
        }
        else {
            return arr[k];
        }
        return arr[k];

        //write your code here
    }

    public static int partition(int[] arr, int pivot, int lo, int hi) {
        System.out.println("pivot -> " + pivot);
        int i = lo, j = lo;
        while (i <= hi) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }
        System.out.println("pivot index -> " + (j - 1));
        return (j - 1);
    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
        System.out.println("Enter index value to find");
        int k = scn.nextInt();
        System.out.println(quickSelect(arr, 0, arr.length - 1, k - 1));
    }

}
