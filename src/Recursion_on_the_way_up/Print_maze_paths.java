package Recursion_on_the_way_up;

import java.util.ArrayList;
import java.util.Scanner;

public class Print_maze_paths {


    public static void maze_paths(int sn , int sm , int en , int em, String str){

        if (sn == en  &  sm == em){
            System.out.println(str);
            return ;
        }


        if ( sn < en){
            maze_paths(sn + 1 , sm , en , em , str + "h");
        }

        if ( sm < em){
            maze_paths(sn , sm + 1 , en , em , str + "v");
        }

    }

    public static void main (String args[]){
        System.out.println("Enter the size of an array");
        Scanner scn = new Scanner(System.in);
        int val = scn.nextInt();
        maze_paths(1,1,val , val , "");
    }

}
