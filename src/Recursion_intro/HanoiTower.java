package Recursion_intro;

import java.net.PortUnreachableException;
import java.security.PublicKey;
import java.util.Scanner;

public class HanoiTower {

    public static void tower( int val , int t1 , int t2 , int t3 ){
        if (val == 0){
            return;
        }

        tower(val - 1 , t1 , t3 , t2);
        System.out.println( t1 + " - > " + t2 );
        tower(val -1 , t3 , t2 , t1 );

    }

    public static void main (String args[]){
        System.out.println("Enter the value ");
        Scanner scn = new Scanner(System.in);
        int value = scn.nextInt();
        int t1 = scn.nextInt();
        int t2 = scn.nextInt();
        int t3 = scn.nextInt();
        tower(value,t1,t2,t3);



    }





}
