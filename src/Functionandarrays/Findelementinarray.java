package Functionandarrays;

import java.util.Scanner;

public class Findelementinarray {

    public static void main (String args[]){

        System.out.println("Enter the size of an array");
        Scanner scn = new Scanner(System.in);
        int temp = scn.nextInt();
        int [] arr;
        int idx;
        arr =  new int [temp];


        for (int i =0  ; i < temp ; i++){
           System.out.println("Enter the value at index " + i );
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the value to find");
        int temp2 = scn.nextInt();
        idx = -1;

        for (int j =0 ; j < temp ; j++){
            if(arr[j] == temp2){
                idx = j;
                break;
            }
        }


        System.out.println("The value " + temp2 +"  is located at index " + idx    );


    }
}
