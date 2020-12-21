package Recursion_intro;

import java.util.Scanner;

public class Calculatepower {

    public static int powercalculate (int val , int pow ){
        if (pow == 1){
            return val;
        }
        int temp = powercalculate(val , pow -1);
        int t2 = temp * val;
        return(t2);
    }



    public static void main (String args[]){
        long start = System.currentTimeMillis();
        System.out.println("Enter the value and its power");
        Scanner scn = new Scanner(System.in);
        int val = scn.nextInt();
        int pow = scn.nextInt();

        System.out.println(powercalculate(val , pow));
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println(elapsedTime);


    }
}
