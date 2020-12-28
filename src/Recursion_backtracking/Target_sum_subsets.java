package Recursion_backtracking;

import java.util.Scanner;

public class Target_sum_subsets {




        public static void main(String[] args) throws Exception {

            System.out.println("Enter the size of the array");
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int arr [] = new int [n];
            for ( int i = 0 ;  i < n ; i++) {
                arr[i] = scn.nextInt();
            }
            System.out.println("Enter sum value");
            int tar = scn.nextInt();

            printTargetSumSubsets(arr , 0 , "" ,0 , tar);
        }

        // set is the subset
        // sos is sum of subset
        // tar is target
        public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
            if ( idx == arr.length){
                if ( sos == tar) {
                    System.out.println(set );

                }
                return;
            }



            printTargetSumSubsets(arr, idx + 1, set + " , " + arr[idx] , sos + arr[idx] , tar);
            printTargetSumSubsets(arr, idx + 1, set , sos  , tar);


        }

    }



