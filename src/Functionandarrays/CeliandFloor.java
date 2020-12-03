package Functionandarrays;

import java.util.Scanner;

public class CeliandFloor {


    public static void main (String args[]){
        int arr [] = {10,20,30,40,50,60,70,80,89};

        System.out.println("Enter the value to search");
        Scanner scn = new Scanner(System.in);
        int temp = scn.nextInt();
        int l = 0;
        int h = arr.length-1;
        int celio = 0;
        int floor = 0;

        while(l<=h){
            int m = (l+h)/2;

            if (arr[m] < temp){
                l = m + 1 ;
                floor = arr[m];

            }
            else if(arr[m] > temp){
                h = m -1;
                celio = arr[m];

            }
            else{
                celio = arr[m +1 ];
                floor = arr[m-1];
                break;
            }

        }

        System.out.println("Celio "+ celio + " Floor "  + floor);




    }
}
