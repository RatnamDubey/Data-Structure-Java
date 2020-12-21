package Recursion_intro;

import java.util.Scanner;

public class ZigZag {

    public static int zigzag(int n ){
         if (n == 0){
             return 1;
         }

        System.out.println( "Pre"  + n);
        zigzag(n -1);
        System.out.println( "In"  + n);
        zigzag(n -1);
        System.out.println( "Post"  + n);
        return 1;
    }




    public static void main (String args[]){

        System.out.println("Enter the value");
        Scanner scn = new Scanner(System.in);
        int temp = scn.nextInt();
        zigzag(temp);


    }
}
