package DP_time_space_complexity;
import java.io.*;
import java.util.*;


public class Merge_two_sorted_array {

        public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
            //write your code here
            int total = a.length + b.length;
            int arr []  = new int[total];
            int i =0;
            int j = 0;
            int k = 0;

            while(i < a.length && j < b.length){
                if (a[i] < b[j]){
                    arr[k] = a[i];
                    i++;
                    k++;
                }
                else{
                    arr[k] = b[j];
                    j++;
                    k++;
                }
            }

            while(i < a.length ) {
                arr[k] = a[i];
                i++;
                k++;
            }
            while(j < b.length ) {
                arr[k] = b[j];
                j++;
                k++;
            }
            return arr;
        }

        public static void print(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
        public static void main(String[] args) {
            System.out.println("Enter size of an array");
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter element "+ i + " of an array");
                a[i] = scn.nextInt();
            }
            System.out.println("Enter size of an array");
            int m = scn.nextInt();
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                System.out.println("Enter element "+ i + " of an array");
                b[i] = scn.nextInt();
            }
            int[] mergedArray = mergeTwoSortedArrays(a, b);
            System.out.println("Sorted array");
            print(mergedArray);
        }

    }


