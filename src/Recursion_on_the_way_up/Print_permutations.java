package Recursion_on_the_way_up;

import java.util.Scanner;

public class Print_permutations {

    public static void prnt_per(String str , String asf){

        if (str.length() ==0 ){
            System.out.println(asf);
            return;
        }

        for ( int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            String lstr =   str.substring(0,i);
            String rstr =   str.substring(i+1);
            String roq = lstr + rstr;
            prnt_per(roq , asf + ch);
        }

    }



    public static void main (String args[]){

        System.out.println("Enter the string value");
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        prnt_per(str,"");


    }

}
