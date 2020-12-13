package Recursion_intro;

import java.util.Scanner;

public class IncreasingPrint {

    public static void Acending(int n ){

        if ( n-(n-1) > n ){
            return;
        }

        else{
            System.out.println(n-(n-1));
            Acending(n-n-1);
        }
    }


    public static  void main (String args[]){
        System.out.println("Enter the string you want to print till");
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        Acending(n );


    }
}
