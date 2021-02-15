package Stack_and_Queues;

import java.util.Scanner;
import java.util.Stack;

public class Duplicate_brackets_01 {

    public static void main (String args[]){

        Stack<Character> st = new Stack<>();
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine(); // Scan till time you press enter

        for ( int i =0 ; i < str.length() ; i ++){
            char ch = str.charAt(i);
            if ( ch == ')' ){
                if (st.peek() == '('){
                    System.out.println("True");
                    return;
                }
                else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else {
                st.push(ch);
            }
        }
        System.out.println("False");
    }
}
