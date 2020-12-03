package Functionandarrays;

import java.util.Scanner;

public class AnyBaseSubstraction {

    public static int Substraction(int x , int y , int z){
        int rv = 0;
        int c = 0 ;
        int p = 1;

        while(z>0){
            int d1 = y%10;
            int d2 = z%10;
            y = y/10;
            z = z/10;
            d1 = d1 + c;
            int d = 0 ;

            if (d1>=d2){
                c = 0;
                d = d1 - d2;
            }
            else{
                d1 = d1 + x;
                d = d1- d2;
                c = -1;
            }

            rv =  rv + d * p;
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
        int result = Substraction(x,y,z);
        System.out.println(result);




    }










}

