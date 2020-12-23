package Recursion_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairspath {

    public static ArrayList<String> getStairpaths(int val){

        if ( val ==0 ){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if( val < 0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;

        }

        ArrayList<String> paths1 = getStairpaths(val-1);
        ArrayList<String> paths2 = getStairpaths(val-2);
        ArrayList<String> paths3 = getStairpaths(val-3);

        ArrayList<String> paths = new ArrayList<>();

        for (String path: paths1){
            paths.add(1+path);
        }
        for (String path: paths2){
            paths.add(2+path);
        }
        for (String path: paths3){
            paths.add(3+path);
        }

        return (paths);
    }



    public static void main (String args[]){
        System.out.println("Enter the stair value");
        Scanner scn = new Scanner(System.in);
        int val = scn.nextInt();
        ArrayList<String> paths = getStairpaths(val);
        System.out.println(paths);


    }
}
