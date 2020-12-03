package Functionandarrays;

import java.security.PublicKey;
import java.util.Scanner;

public class SubArrays {


       public static void main(String args[]) {

        System.out.println("Enter the size of an array");
        Scanner scn = new Scanner(System.in);
        int temp = scn.nextInt();
        int arr[];
        arr = new int [temp];
        for (int i=0; i < temp; i++ ){
            arr[i] = scn.nextInt();
        }
        int k =0;
        int j =0;

        for (int i = 0 ; i < temp ; i ++){
            for (j = 0 ; j < arr.length ; j++){
                for (k = i ; k <= j ; k++){
                    System.out.print(arr[k]+"\t");
                }
                System.out.println();
            }
        }


    }
        }



