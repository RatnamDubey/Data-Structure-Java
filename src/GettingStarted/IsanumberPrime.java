package GettingStarted;


import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class IsanumberPrime {
    public static void main(String[] args) {
        int flag = 0;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] vars = new int[n ];
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the values");
            vars[i -1 ] =scn.nextInt();
        }
        for (int value: vars) {
                for (int element = 2; element <= value / 2; ++element) {
                if(value%element == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(value + " is a prime value");
            }
            else{
                System.out.println(value + " is not a prime value" );
                flag =0;
            }
        }
    }
}
