package Recursion_intro;

import java.util.Scanner;

public class Increase_Decrease {

    public static void Increase (int n , int i){
        if (n == i){
            System.out.println(n);
        }
        else{
            System.out.println(n);
            Increase(n+1,i);
        }

    }

    public static void Decrease(int j , int i){
        if (j == 1) {
            System.out.println(j);
            Increase(j , i);
        }
        else{
            System.out.println(j);
            Decrease(j-1 , i);
        }

    }

    public static void main (String args[]){
        System.out.println("Enter the number to print increase and decrease");
        Scanner scn = new Scanner(System.in);
        int temp = scn.nextInt();
        int fix_temp = temp;
        Decrease(temp , fix_temp);
    }
}
