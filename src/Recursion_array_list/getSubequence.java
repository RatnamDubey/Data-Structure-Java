package Recursion_array_list;

import java.util.ArrayList;
import java.util.Scanner;


public class getSubequence {

    public static ArrayList<String> gss(String str){
        if (str.length() == 0 ){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char val0 = str.charAt(0);
        String resval =   str.substring(1);
        ArrayList<String> rres = gss(resval);
        ArrayList<String> mres =  new ArrayList<>();

        for(String rstr: rres){
            mres.add("" + rstr);
            mres.add(val0 + rstr);
        }
        return mres;
    }



    public static void main (String args[]){
        System.out.println("Enter the string");
        Scanner scn = new Scanner(System.in);
        String val = scn.next();
        ArrayList<String> res = gss(val);
        System.out.println(res);
    }





}
