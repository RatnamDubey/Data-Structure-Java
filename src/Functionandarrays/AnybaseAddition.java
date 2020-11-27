package Functionandarrays;

import java.util.Scanner;

public class AnybaseAddition {

    public static int Decimalconverstion (int x , int y ) {
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
        System.out.println("Enter the Type want to add 1) Binary 2) Decimal 3) Octal  ");
        int x = scn.nextInt();
        System.out.println("Enter the type  " + x + " value" );
        int y = scn.nextInt();
        System.out.println("Enter the  value to add ");
        int z = scn.nextInt();
        if (x ==1 ){
            int t1 = Decimalconverstion(y,2);
            int t2 = Decimalconverstion(z, 2);
            int t3 = t1+t2;
            System.out.println(basetwo(t3,2));
        }
        else if (x == 3){
            int t1 = Decimalconverstion(y,8);
            int t2 = Decimalconverstion(z, 8);
            int t3 = t1+t2;
            System.out.println(basetwo(t3,8));
        }
        else{
            System.out.println(y+z);
        }
    }
}
