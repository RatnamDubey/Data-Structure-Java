package StringBuilderArraylist;

import java.util.Scanner;

public class ToggleCase {

    public static void main (String args []){
        System.out.println("Enter the string value");
        Scanner scn = new Scanner(System.in);
        String temp = scn.next();
        StringBuffer str = new StringBuffer(temp.length());

        for (int i = 0 ; i < temp.length() ; i++){

            char c = temp.charAt(i);

            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }
            // lower case converted to upper case
            else {
                c = Character.toUpperCase(c);
            }
            str.append(c);


        }

        System.out.println(str.toString());

    }
}
