package GettingStarted;

import java.util.Scanner;
import java.util.Arrays;

public class PrintAllprimenumbers {
    public static void main(String[] args) {
        System.out.println("Enter the lower value");
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        System.out.println("Enter the higer value");
        Scanner scn2 = new Scanner(System.in);
        int high = scn2.nextInt();

        for ( int element = low  ; element <= high ; element++) {
            int flag =1;
            for (int j = 2 ; j <= element/2 ; j++){
                if (element%j ==0){
                    flag=0;
                    break;
                }

            }

        if ( flag == 1){
            System.out.println(element);

        }

        }
    }
}
