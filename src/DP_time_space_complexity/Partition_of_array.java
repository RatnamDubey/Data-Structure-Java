package DP_time_space_complexity;
import java.io.*;
import java.util.*;


public class Partition_of_array {

        public static void partition(int[] arr, int pivot) {
            int i = 0;
            int j = 0;
            int end = arr.length;
            //write your code here
            while(i < end){
                if ( arr[i] > pivot){
                    i++;
                }
                else{
                    swap(arr, i , j );
                    i++;
                    j++;
                }
            }

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
            System.out.println("Enter size of an array");
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter element "+ i + " of an array");
                arr[i] = scn.nextInt();
            }
            System.out.println("Enter pivot value");
            int pivot = scn.nextInt();
            partition(arr, pivot);
            print(arr);
        }

    }



