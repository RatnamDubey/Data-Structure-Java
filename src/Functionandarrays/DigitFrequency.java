package Functionandarrays;

import java.util.Scanner;

public class DigitFrequency {
    public static int repeat_num (int x , int y) {
        int rv = 0;
        while (x > 0){
            int d = x%10;
            x = x/10;
            if (d == y){
                rv = ++rv ;
            }
        }
        return(rv);
    }


    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the long value to find repetation");
        int x = scn.nextInt();
        System.out.println("Enter the frequency to find");
        int y = scn.nextInt();
        System.out.println(repeat_num(x,y));


    }
}
