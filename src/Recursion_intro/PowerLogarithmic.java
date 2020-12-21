package Recursion_intro;

import java.util.Scanner;

public class PowerLogarithmic {

public static int powercalc(int x , int n ){

    if (n ==0){
        return 1;
    }
    int xpow2 = powercalc(x , n/2);
    int xn = xpow2 * xpow2;
    if (n % 2 == 1 ){
        xn = xn * x;
    }
     return xn;
    }





public static void main (String args[]){
    long start = System.currentTimeMillis();
// some time passes

    System.out.println("Enter the values of the number and power");
    Scanner scn = new Scanner(System.in);
    int val = scn.nextInt();
    int pow = scn.nextInt();
    int returnval = powercalc(val , pow);
    System.out.println(returnval);
    long end = System.currentTimeMillis();
    long elapsedTime = end - start;
    System.out.println(elapsedTime);



}

}
