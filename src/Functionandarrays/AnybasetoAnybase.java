package Functionandarrays;

import java.util.Scanner;



public class AnybasetoAnybase {

    /* converting the number to the binary */
    public static int Basetwoconvert (int m) {
        int i = 1 ;
        int cnt = 0;
        while (m>0){
            int rem = m % 2;
            m = m/2;
            int temp = rem * i;
            i = i * 10;
            cnt = cnt + temp ;
        }
        return(cnt);
    }

    public static int Anybaseconvrt(int m , int n , int p  ){
        int i = 0;
        int cnt = 0;
        while(m>0){
            int temp = (int) m/p;
            int mod = (int) m%p;
            m = temp;
            int t = (int) Math.pow(n,i) * mod;
            i = i + 1;
            cnt = cnt + t;

        }
        return(cnt);
    }





    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the long value to convert");
        int x = scn.nextInt();
        System.out.println("Enter the type 1) Binary 2) Decimal 3) Octal  ");
        int y = scn.nextInt();
        System.out.println("Enter the type to convert 1) Binary 2) Decimal 3) Octal ");
        int z = scn.nextInt();



        if (y == 2 & z == 1){
            System.out.println(Basetwoconvert(x));
        }
        else if (y ==2 & z == 3){
            int two = Basetwoconvert(x);
            System.out.println(Anybaseconvrt(x,10,8));
        }

        }



    }




