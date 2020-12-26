package Recursion_on_the_way_up;

import java.util.ArrayList;
import java.util.Scanner;

public class print_subsequence_official {

    public static void print_subs(String str , String  ans){
        if (str.length() == 0 ){
           System.out.println(ans);
            return ;
        }

        char val0 = str.charAt(0);
        String resval =   str.substring(1);
        print_subs(resval , ans + "") ;
        print_subs(resval , ans + val0) ;

    }



    public static void main (String args[]){
        System.out.println("Enter the value of the string");
        Scanner scn = new Scanner(System.in);
        String stg = scn.next();
        print_subs(stg ,"");

    }
}
