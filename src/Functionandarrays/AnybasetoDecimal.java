package Functionandarrays;


import java.util.Scanner;
import java.lang.Math;

public class AnybasetoDecimal {

    public static int baseten (int x , int y ) {
        int base = 0;
        int val = 0;
        while(x>0){
            int temp = (int) x/10;
            int mod = (int) x%10;
            x = temp;
            int t = (int) Math.pow(y,base) * mod;
            base = base + 1;
            val = val + t;

        }
        return(val);
    }


    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the long value to convert");
        int x = scn.nextInt();
        System.out.println("Enter the convert type");
        int new_temp = 0;
        int y = scn.nextInt();
        new_temp =  baseten(x ,y);
        System.out.println(new_temp);
    }

}
