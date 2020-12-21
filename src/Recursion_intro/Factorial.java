package Recursion_intro;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Factorial {

    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        int t1 = factorial(n-1);
        int t2 = n * t1;
        return(t2);
    }




    public static void main (String args[]){
        System.out.println("Enter the value for the factorial");
        Scanner scn = new Scanner(System.in);
        int temp = scn.nextInt();
        System.out.println(factorial(temp));

    }


}
