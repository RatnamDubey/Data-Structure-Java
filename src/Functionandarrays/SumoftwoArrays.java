package Functionandarrays;

import java.security.PublicKey;
import java.util.Scanner;

public class SumoftwoArrays {

    public static void main (String args[]){
        int a1 = 0;
        int a2 = 0;
        System.out.println("Enter the size of first array");
        Scanner scn = new Scanner(System.in);
        a1 = scn.nextInt();
        System.out.println("Enter the size of Second array");
        a2 = scn.nextInt();

        int arr [];
        arr = new int[a1];
        int arr2 [];
        int arr3 [];
        arr2 = new int[a2];

        System.out.println("Enter the values for first array");
        for (int i = 0 ; i < a1 ; i++){
            int temp = scn.nextInt();
            arr[i] = temp;
        }

        System.out.println("Enter the value for second array");

        for (int i = 0 ; i < a2 ; i++){
            int temp = scn.nextInt();
            arr2[i] = temp;
        }



        if (a1 > a2){
            for (int i = 0 ; i < a2 ; i++){
                arr[i] = arr[i] + arr2[i];
            }
            System.out.println("Output sum as follows");
            for (int i = 0 ; i < arr.length ; i++){
                System.out.println(arr[i]);
            }

        }
        else if (a2 > a1){
            for (int i = 0 ; i < a1 ; i++){
                arr2[i] = arr[i] + arr2[i];
            }
            System.out.println("Output sum as follows");
            for (int i = 0 ; i < arr2.length ; i++){
                System.out.println(arr2[i]);
            }
        }
        else if ( a1 == a2){
            arr3 = new int[a1];
            for (int i = 0 ; i < a1 ; i++){
                arr3[i] = arr[i] + arr2[i];
            }
            System.out.println("Output sum as follows");
            for (int i = 0 ; i < arr3.length ; i++){
                System.out.println(arr3[i]);
            }
        }

    }

}
