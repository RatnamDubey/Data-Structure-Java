package Recursion_on_the_way_up;

import java.util.ArrayList;
import java.util.Scanner;

public class Print_pair_stair_paths {

    public static void print_stair(int  val , String ans){
        if (val ==  0){
            System.out.println(ans);
            return ;
        }

        if ( val < 0){
            return;
        }



        print_stair(val - 1  ,ans + "1" ) ;
        print_stair(val - 2  ,ans + "2" ) ;
        print_stair(val - 3  ,ans + "3" ) ;





    }





    public static void main (String args[]){

        System.out.println("Enter the maze size");
        Scanner scn = new Scanner(System.in);
        int val = scn.nextInt();
        print_stair(val , "");



    }

}
