package Recursion_backtracking;

import java.util.Scanner;

public class flood_fill {

    public static void floodfillval(int[][] maze, int row, int col, String psf, boolean[][] visited) {

        if ( row < 0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 1 || visited[row][col] == true ){
            return;
        }

        if ( row == maze.length -1 && col == maze[0].length -1 ){
            System.out.println(psf);
            return;
        }



        visited[row][col]= true;

        floodfillval(maze, row - 1,   col,  psf + "t", visited);
        floodfillval(maze,  row,  col - 1 ,  psf + "l", visited);
        floodfillval(maze, row + 1 ,  col,  psf + "d", visited);
        floodfillval(maze,  row,  col + 1,   psf + "r", visited);
        visited[row][col]= false;

    }




    public static void main (String args[]){
        System.out.println("Enter the maze size");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int arr[][] = new int[n][m];
        boolean [][] bool = new boolean[n][m];

        for (int i = 0 ; i < n ; i++){
            for (int j =0 ; j < m ; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        floodfillval(arr, 0 ,0 , "" , bool)   ;


    }

}

