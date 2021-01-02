package Recursion_intro;

import java.util.Scanner;

public class IncreasingPrint {

    public static void Acending(int n ) {
        if ( n == 0){
            return;
        }
        Acending(n -1);
        System.out.println(n);

    }


    public static  void main (String args[]){
        System.out.println("Enter the string you want to print till");
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        Acending(n);
    }
}
