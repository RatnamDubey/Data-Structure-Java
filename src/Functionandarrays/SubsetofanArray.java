package Functionandarrays;

import java.security.PublicKey;
import java.util.Scanner;
import java.util.Arrays;

public class SubsetofanArray {


    public static void main (String args[]){

        System.out.println("Enter the size of the array");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }

        int limit = (int) Math.pow(2 , n);
        for (int i = 0 ; i < limit ; i ++){
            String set = "";
            int temp = i;
            for (int j = arr.length -1  ; j >= 0   ; j -- ){

                int r = temp % 2 ;
                temp = temp / 2 ;

                if (r==0){
                    set = "-\t" + set;
                }
                else{
                    set = arr[j]+ "\t" + set;
                }

            }

            System.out.println(set);
        }
    }


}

/* I am still little confused but I think I know whats going on */