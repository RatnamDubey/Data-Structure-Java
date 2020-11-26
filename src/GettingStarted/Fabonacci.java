package GettingStarted;

import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        System.out.println("Enter the fabonacci highest value");
        Scanner scn = new Scanner(System.in);
        int fab = scn.nextInt();
        System.out.println(i);
        System.out.println(j);
        while(j<fab){
            System.out.println(j);


            int k  = j + i;
            i = j;
            j = k;


        }


    }
}
