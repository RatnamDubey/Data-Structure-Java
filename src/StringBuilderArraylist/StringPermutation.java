package StringBuilderArraylist;

import java.util.Scanner;

public class StringPermutation {

    public static void main (String args[]){
        System.out.println("Enter the STring");
        Scanner scn = new Scanner(System.in);
        String temp = scn.next();
        int factorial =1;
        for(int i = 1; i <= temp.length(); ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }

        for (int i =0 ; i < factorial ; i ++){
            StringBuilder sb = new StringBuilder(temp);
            int temp1 = i;

            for ( int j = temp.length() ; j >= 1 ; j--){
                 int re = temp1%j;
                 int qe = temp1/j;
                 System.out.print(sb.charAt(re));
                 sb.deleteCharAt(re);
                 temp1= qe;


            }
        System.out.println();

        }


    }
}
