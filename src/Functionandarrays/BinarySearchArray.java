package Functionandarrays;

import java.util.Scanner;

public class BinarySearchArray {

    public static void main (String args[]){

        /* Only preexisting condition is the values should be in the sorted manner */
        int arr[] = {10, 20,30,40,50,60,70,80,90,100};
        System.out.println("Enter the value to search");
        Scanner scn = new Scanner(System.in);
        int temp = scn.nextInt();

        int l = 0;
        int h = arr.length-1;



        while(l<=h){
            int m = (l+h)/2;
            if (arr[m] > temp){
                h = m -1;
            }
            else if ( arr[m] < temp){
                l = m + 1 ;
            }
            else{
                System.out.println("Found value at index "+ m );
                return;
            }

        }
        System.out.println("Not found");



    }



}
