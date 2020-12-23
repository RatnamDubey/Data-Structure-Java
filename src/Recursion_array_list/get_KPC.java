package Recursion_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class get_KPC {

    static String [] codes = {"." ,"abc" ,"def" ,"ghi" ,"jkl","mno" ,"pqr" ,"stu","vwx","yz"};

    public static ArrayList<String> kpc(String str) {
        if (str.length() == 0 ){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char val0 = str.charAt(0);
        String resval =   str.substring(1);
        ArrayList<String> rres = kpc(resval);
        ArrayList<String> mres =  new ArrayList<>();

        String val2 = codes[val0 - '0']; /*Substracted '0' as to get the correct ascii values - '6' =!  6 */
        for (int i = 0  ; i < val2.length() ; i ++){
            char charch = val2.charAt(i);
            for(String rstr: rres){
                mres.add(charch + rstr);
            }
        }
        return(mres);
    }


    public static void main(String args []){
        System.out.println("Enter the string values");
        Scanner scn = new Scanner(System.in);
        String val = scn.next();
        ArrayList<String> res = kpc(val);
        System.out.println(res);
    }


}
