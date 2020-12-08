package StringBuilderArraylist;

import java.util.Scanner;

public class PalindromicSubString {

    public static boolean isPalindrom(String s){
        int i =0;
        int j = s.length() -1;

        while(i <= j ){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (ch1 != ch2){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;

    }


    public static void main (String args[]){
        System.out.println("Enter the substring");
        Scanner scn = new Scanner(System.in);
        String temp = scn.next();
        System.out.println(isPalindrom(temp));


    }


}
