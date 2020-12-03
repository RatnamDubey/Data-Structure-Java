package Functionandarrays;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.StreamSupport;

public class Reverseanarray {

    public static void revesearray(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
         return ;
    }



    public static void main (String args[]){

        System.out.println("Enter the size of an array");
        Scanner scn = new Scanner(System.in);
        int arr [];
        int temp = scn.nextInt();
        arr = new int [temp];
        System.out.println("Enter the values");
        for (int i =0 ; i < temp ; i ++)
        {
            arr[i] = scn.nextInt();
        }
        revesearray(arr);
        System.out.println(Arrays.toString(arr));



    }

}
