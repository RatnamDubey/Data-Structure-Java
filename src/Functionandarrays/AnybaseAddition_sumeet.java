package Functionandarrays;

import java.util.Scanner;

public class AnybaseAddition_sumeet {

    public static int Addition(int x , int y , int z){
        int rv = 0;
        int c = 0 ;
        int p = 1;

        while ( y > 0 || z > 0 || c > 0 ){
            int r1 = y%10;
            int r2 = z%10;

            y = y/10;
            z = z/10;

            int r = r1 + r2 + c;
            c = r/x;
            r = r%x;

            rv += r * p;
            p = p * 10;

        }


        return rv;


    }





    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Type want to add 1) Binary 2) Decimal 3) Octal  ");
        int x = scn.nextInt();
        System.out.println("Enter the type  " + x + " value" );
        int y = scn.nextInt();
        System.out.println("Enter the  value to add ");
        int z = scn.nextInt();
        int result = Addition(x,y,z);
        System.out.println(result);




    }



}
