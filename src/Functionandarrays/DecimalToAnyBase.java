package Functionandarrays;


import java.util.Scanner;

public class DecimalToAnyBase {

    public static int basetwo (int x , int y ) {
        int base = 1;
        int val = 0;
        while(x>0){
            int temp = (int) x/y;
            int mod = (int) x%y;
            x = temp;
            mod = mod * base;
            base = base * 10;
            val = val + mod;
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
        new_temp =  basetwo(x ,y);
        System.out.println(new_temp);

    }

}
