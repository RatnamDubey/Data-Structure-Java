package Functionandarrays;

import java.util.Scanner;

public class Barchart {

    public static void main (String args[]){
        System.out.println("Enter the size of an array");
        Scanner scn = new Scanner(System.in);
        int temp = scn.nextInt();
        int arr [];
        arr =  new int [temp];
        int temp3 = 0;


        for (int i =0 ; i < temp ; i++){
            System.out.println("Enter the value at index" + i);
            int temp2 = scn.nextInt();
            arr[i] = temp2;
            if (temp2 > temp3){
                temp3 = temp2;
            }
        }


        for (int j = temp3; j >= 1 ; j--){
            for (int i = 0 ; i < arr.length; i++){
                if (arr[i] >= j){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }



    }

}
