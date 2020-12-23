package Recursion_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class get_maze_paths {

    public static ArrayList<String> mazepaths(int sn , int sm , int en  , int em) {
        if (sn == en  &  sm == em){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if (sm < em) {
            hpaths = mazepaths(sn,sm +1 ,en,em);
        }
        if (sn < en) {
            vpaths = mazepaths(sn + 1, sm, en, em);
        }

        ArrayList<String> paths = new ArrayList<>();

        for (String hpath: hpaths){
            paths.add("h"+ hpath);
        }
        for (String vpath: vpaths){
            paths.add("v" + vpath);
        }

        return(paths);

    }

    public static void main (String args[]){
        System.out.println("Enter the maze end points");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> res = mazepaths(1,1,n,m);
        System.out.println(res);

    }

}
