package DynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Climbstairs {


    public static int getStairpaths(int n , int arr[]){

        if (n == 0){
            return 1;
        }else if ( n < 0){
            return 0;
        }
        if (arr[n] < 0){
            return arr[n];
        }
        int p1 = getStairpaths(n -1 , arr);
        int p2 = getStairpaths(n -2 , arr);
        int p3 = getStairpaths(n -3 , arr);

        int paths = p1 + p2 + p3;
        arr[n] = paths;
        return paths;

    }


    public static int getStairpathsTab(int n ){

        int [] arr = new int [n + 1];

        arr[0]  = 1;

        for ( int i = 1 ; i <= n ; i ++){
            if( i == 1){
                arr[i] = arr[0];
            }
            else if ( i == 2){
                arr[i] = arr[0] + arr[1];
            }
            else{
                arr[i] = arr[i -1 ] + arr[i -2 ] + arr[i -3 ];
            }
        }
        return arr[n];


    }




    public static void main (String args[]){
        System.out.println("Enter the paths ");
        Scanner scn = new Scanner(System.in);
        int val = scn.nextInt();
        int tk = getStairpaths(val , new int [val + 1]);
        System.out.println(tk);
        int tk1 = getStairpathsTab(val);
        System.out.println(tk1);

    }




}
