package StringBuilderArraylist;

import java.util.Scanner;

public class StringCompression {

   public static String compression(String str){
       String s = String.valueOf(str.charAt(0));
       for (int i =1 ; i < str.length() ; i++){
           char curr = str.charAt(i);
           char prev = str.charAt(i-1);
           if(curr != prev){
               s += curr;
           }
       }
        return(s);
   }

   public static String compressionvalue(String str){
       String s =  String.valueOf(str.charAt(0));
       int cnt = 0;
       for (int i =1 ; i < str.length() ; i++){
           char curr = str.charAt(i);
           char prev = str.charAt(i-1);
           if(curr != prev){
               if (cnt !=0){
                   s += cnt;
                   s += curr;
                   cnt = 0;
               }
               else{
                   s += curr;
               }

           }
           cnt++;
       }
       if (cnt !=1){
           s += cnt;}

       return(s);
   }


    public static void main(String args[]) {

        System.out.println("Enter the substring");
        Scanner scn = new Scanner(System.in);
        String temp = scn.next();
        System.out.println(compression(temp));
        System.out.println(compressionvalue(temp));
    }
}