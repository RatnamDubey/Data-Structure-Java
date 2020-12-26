package Recursion_on_the_way_up;

import java.util.ArrayList;
import java.util.Scanner;

public class Print_maze_paths_with_jump {

    public static void maze_path_jump( int sn , int sm , int en , int em , String str){

        if (sn == en  &  sm == em){
           System.out.println(str);
            return ;
        }

        for ( int i = 1; i <= en - sn  ;  i ++){
            maze_path_jump(sn + i , sm , en , em , str + 'h' + i);
            }

        for ( int j = 1; j <= em - sm  ;  j ++){
            maze_path_jump(sn , sm + j , en , em , str + 'v' + j);
        }

        for ( int k = 1; k <= en - sn && k <= em - sm  ;  k ++){
            maze_path_jump(sn + k , sm + k  , en , em , str + 'd' + k);
        }


    }





    public static void main (String args[]){

        System.out.println("Enter the size of the maze");
        Scanner scn = new Scanner(System.in);
        int arr = scn.nextInt();
        maze_path_jump(1,1,arr,arr,"");




    }


}
