package DynamicProgramming;

import java.util.Scanner;

public class fabonacci {

    public static int fabnumber(int val){
        if ( val == 0 | val == 1){
            return val;
        }
        System.out.println("Recurvise step" + val);
        int val1 = fabnumber(val - 1 );
        int val2 = fabnumber(val - 2 );
        int retval = val1 + val2;
        return retval;
    }  // There is a problem with this code and problem is that each value is called multiple times refer notes


    // now we need to correct and optimise the code
    public static int memfabnumber ( int val ,  int arr []){

        if ( val == 0 | val == 1){
            return val;
        }
        if ( arr[val] != 0 ){
            return arr[val];
        }
        System.out.println("Recurvise step" + val);
        int val1 = memfabnumber(val - 1 , arr);
        int val2 = memfabnumber(val - 2 , arr);
        int retval = val1 + val2;
        arr[val] = retval;

        return retval;
    }





    public static void main (String args[]){
        System.out.println("Enter faconacci number");
        Scanner scn = new Scanner(System.in);
        int val = scn.nextInt();
        System.out.println(fabnumber(val));
        int [] arrr = new int[val + 1];
        System.out.println(memfabnumber(val , arrr ));
    }
}
