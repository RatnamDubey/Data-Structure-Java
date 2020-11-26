package GettingStarted;

import java.util.Scanner;

public class Reverseanumber {
    public static void main(String[] args) {
        System.out.println("Enter the values");
        Scanner scn = new Scanner(System.in);
        int n =  scn.nextInt();
        System.out.println("Please eneter " + n +" values ");
        int [] low = new int[n];

        for(int i = 0 ; i<n ; ++i){
            low[i] = scn.nextInt();
        }

        /* Reversing the code */
        System.out.println("Reversing the values ");

        for (int j = n ; j>=0; --j){
            if(j-1 < 0){
                break;
            }
            else{
                System.out.println(low[j-1]);
            }

        }

    }
}
