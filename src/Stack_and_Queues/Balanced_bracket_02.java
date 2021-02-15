package Stack_and_Queues;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_bracket_02 {

    public static boolean handleclosing(Stack<Character> st, char value){
        if (st.size() == 0 ){
            System.out.println("Zero size false");
            return false;
        }
        else if ( st.peek() != value ){
            System.out.println("Not matching false");
            return false;
        }
        else {
            st.pop();
            return true;
        }
    }

    public static void main (String args []){
        Stack<Character> st = new Stack<>();
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        for (int i = 0 ;i < str.length() ; i++){
            char val = str.charAt(i);
            if ( val == '(' || val == '{' || val == '[' ){
                st.push(val);
            }
            else if (val == ')'){
                boolean b = handleclosing(st,'(');
                if (b == false){
                    System.out.println(b);
                    return;
                }
            }
            else if ( val == '}' ) {
                boolean b = handleclosing(st,'{');
                if (b == false){
                    System.out.println(b);
                    return;
                }
            }
            else if ( val == ']'){
                boolean b = handleclosing(st,'[');
                if (b == false){
                    System.out.println(b);
                    return;
                }
            }
        }
        if (st.size() ==0){
            System.out.println("True");
        }
        else{
            System.out.println("Brackets mismatch False" );
        }
    }
}
