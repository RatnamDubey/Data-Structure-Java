package DP_time_space_complexity;
import java.io.*;
import java.util.*;


public class Count_sort {

        public static void countSort(int[] arr, int min, int max) {
            //write your code here
            // take the range value by minus min and max

            int range = ( max - min ) ;
            int [] new_arr = new int[range + 1];
            for (int i = 0 ; i < arr.length    ; i ++){
                int temp = arr[i] - min;
                new_arr[temp]++;
            }

            for ( int i = 1 ; i < new_arr.length ; i++){
                new_arr[i] = new_arr[i]+new_arr[i-1];
            }

            int [] ans = new int [arr.length];
            for ( int i = arr.length -1  ; i >= 0 ; i --){
                int val = arr[i];
                int pos = new_arr[val - min];
                int idx = pos -1;
                ans[idx] = val;
                new_arr[val-min]--;

            }

            print(ans);



        }

        public static void print(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

        public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter size of an array");
            int n = scn.nextInt();
            int[] arr = new int[n];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                System.out.println("Enter element "+ i + " of an array");
                arr[i] = scn.nextInt();
                max = Math.max(max, arr[i]);
                min = Math.min(min, arr[i]);
            }
            countSort(arr, min, max);
            //print(arr);
        }

    }
