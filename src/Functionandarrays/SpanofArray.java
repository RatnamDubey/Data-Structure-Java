package Functionandarrays;

import java.util.Scanner;

public class SpanofArray {

    public static void main(String args[]){

        int arr[];

        System.out.println("Enter the size of an array");
        Scanner scn = new Scanner(System.in);
        int temp = scn.nextInt();
        arr =  new int [temp];

        for (int i = 0 ; i < temp ; i++){
            System.out.println("Enter the value for index " + i );
            int temp2 = scn.nextInt();
            arr[i] = temp2;
        }

        int max = arr[0];
        int min = arr[0];

        for (int j = 0 ; j < temp ; j++){
            if (arr[j] > max){
                max = arr[j];
            }
            else if (arr[j] < min){
                min = arr[j];
            }
        }

        System.out.println("The difference between max value of array and min is " + (max - min));


    }
}
