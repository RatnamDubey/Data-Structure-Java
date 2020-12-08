package Arrays2D;

import java.util.Scanner;

public class SearchinSorted2dArray {

    public static void main (String args[]){

        System.out.println("Enter the size of an arrau");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int va = 20;
        int arr[][] = new  int[n][n];
        for(int i =0 ; i < n ; i ++){
            for (int j = 0 ; j < n ; j ++){
                arr[i][j] = va++;
            }
        }

        for (int i =0 ; i < n ; i ++){
            for (int j = 0 ; j < n ; j++){
                System.out.print(arr[i][j] + "\t") ;
            }
            System.out.println();
        }

        int cnt =0;
        System.out.println("Enter the value to search in an array");
        int temp = scn.nextInt();

        for(int i = n-1 , j = 0 ; j < n-1 ; j ++){
            cnt++;
            if(arr[i][j] > temp){
                for (int k = n-1 ; k >= 0 ; k--){
                    cnt++;
                    if(arr[k][j] == temp){
                        System.out.println("Found value at x , y = "  + k + ", " + j );
                        return;
                    }
                }
            }


        }
        System.out.println("Found value at number  = "  + cnt );



    }
}
