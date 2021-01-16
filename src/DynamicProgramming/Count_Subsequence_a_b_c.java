package DynamicProgramming;

import java.util.Scanner;

public class Count_Subsequence_a_b_c {

    public static void main (String args[]){
        System.out.println("Enter the subsequenc");
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        int a = 0;
        int ab = 0;
        int abc = 0;

        /// basically this thing can be easily done with the help of the formulas
        // so if we know the formula then its quite easy.

        for ( int i = 0 ; i < str.length() ; i ++){
            char ch = str.charAt(i);

            if (ch == 'a'){
                a = 2 * a + 1;
            }
            else if ( ch == 'b'){
                ab = 2 * ab + a;
            }
            else if ( ch == 'c'){
                abc = 2 * abc + ab;
            }
        }

        System.out.println("The subsequence count is" + abc);
    }

}
