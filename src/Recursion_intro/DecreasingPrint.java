package Recursion_intro;

import java.util.Scanner;

public class DecreasingPrint {

    public static void Decrease(int n){
        if ( n ==0){
            return;
        }
        else{
            System.out.println(n);
            Decrease(n-1);
        }
    }


    public static void main (String args[]){
        System.out.println("Enter the decriesing order to print");
        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
        Decrease(i);





    }
}
