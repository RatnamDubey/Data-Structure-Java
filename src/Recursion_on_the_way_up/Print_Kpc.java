package Recursion_on_the_way_up;

import java.util.ArrayList;
import java.util.Scanner;

public class Print_Kpc {

    static String [] codes = {"." ,"abc" ,"def" ,"ghi" ,"jkl","mno" ,"pqr" ,"stu","vwx","yz"};

    public static void  print_kpc(String str , String ans ) {

        if (str.length() == 0 ){
            System.out.println(ans);
            return ;
        }


        char val0 = str.charAt(0);
        String resval =   str.substring(1);
        String val2 = codes[val0 - '0' ];

        for (int i = 0  ; i < val2.length() ; i ++){
            char charch = val2.charAt(i);
            print_kpc(resval ,ans + charch) ;
        }




    }


    public static void main(String args []){
        System.out.println("Enter the string values");
        Scanner scn = new Scanner(System.in);
        String val = scn.next();
        print_kpc(val, "");

    }





}
