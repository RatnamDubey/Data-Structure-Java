package StringBuilderArraylist;

import java.util.Scanner;

public class StringwithASCIDifference {
    public static void main(String args[]){

        System.out.println("Enter the values");
        Scanner scn = new Scanner(System.in);
        String temp = scn.next();
        int val = 0;
        StringBuffer str = new StringBuffer(temp.length());
        str.append(temp.charAt(0));
        val = (int) temp.charAt(0) ;

        for (int i = 1 ; i < temp.length() ; i++){
            char c1 = temp.charAt(i);
            int i1 = (int) c1;
            int f1 = i1 -val;
            val = i1;
            str.append(f1);
            str.append(c1);
        }

    System.out.println(str.toString());
    }



}
