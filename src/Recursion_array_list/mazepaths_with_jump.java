package Recursion_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class mazepaths_with_jump {

    public static ArrayList<String> mazepaths_jumps(int sn , int sm , int en , int em){

        if (sn == en  &  sm == em){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();

        for ( int i = 1; i <= en - sn  ;  i ++){
            ArrayList<String> hpaths  = mazepaths_jumps(sn + i,sm ,en,em);
            for (String hpath: hpaths){
                paths.add("h"+ i + hpath);
            }
        }


        for ( int j = 1; j <= em - sm  ;  j ++){
            ArrayList<String> vpaths  = mazepaths_jumps(sn, sm + j ,en,em);
            for (String vpath: vpaths){
                paths.add("v"+ j +vpath);
            }
        }

        for ( int k = 1; k <= em - sm && k <=  en - sn;  k ++){
            ArrayList<String> dpaths  = mazepaths_jumps(sn + k , sm + k ,en,em);
            for (String dpath: dpaths){
                paths.add("d"+ k +dpath);
            }
        }




        return(paths);


    }

    public static void main (String args[]){
        System.out.println("Enter the maze end cordinates");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> res = mazepaths_jumps(1,1,n,m);
        System.out.println(res);

    }

}
