package Arrays2D;

import java.util.Scanner;

public class ShellRotate {


    public static void reverse (int [] oned , int li , int ri){
        while(li<ri){
            int temp = oned[li];
            oned[li] = oned[ri];
            oned[ri] = temp;
            li++;
            ri--;
        }

    }

    public static  int[] fillshellfromoned(int[][] arr , int s , int[] oned ){
        /*Converting a two dimentional array into a single dimentional array*/
        int minr = s -1;
        int minc = s -1;
        int maxr = arr.length - s;
        int maxc = arr[0].length -s;

        int cnt = 0;
        /*Covering the walls*/
        /*LW*/
        for (int i = minr, j = minc; i <= maxr ; i++) {
            arr[i][j]  = oned[cnt];
            cnt++;
        }
        /*BW*/
        for (int i = maxr, j = minc +1; j <= maxc ; j++) {
            arr[i][j]  = oned[cnt];
            cnt++;
        }
        /*RW*/
        for(int i = maxr-1 , j = maxc  ; i >= minr ; i-- ){
            arr[i][j]  = oned[cnt];
            cnt++;
        }
        /*TW*/
        for(int i = minr , j = maxc -1; j >= minc + 1 ; j-- ){
            arr[i][j]  = oned[cnt];
            cnt++;
        }

        return oned;
    }


    public static  int[] fillonedfromshell(int[][] oned , int s ){
        /*Converting a two dimentional array into a single dimentional array*/
        int minr = s -1;
        int minc = s -1;
        int maxr = oned.length - s;
        int maxc = oned[0].length -s;
        int size =  (2*(maxr-minr+maxc-minc));
        int sind [] = new int[size];
        int cnt = 0;
        /*Covering the walls*/
        /*LW*/
        for (int i = minr, j = minc; i <= maxr ; i++) {
            sind[cnt] = oned[i][j];
            cnt++;
        }
        /*BW*/
        for (int i = maxr, j = minc +1; j <= maxc ; j++) {
            sind[cnt] = oned[i][j];
            cnt++;
        }
        /*RW*/
        for(int i = maxr-1 , j = maxc  ; i >= minr ; i-- ){
            sind[cnt] = oned[i][j];
            cnt++;
        }
        /*TW*/
        for(int i = minr , j = maxc -1; j >= minc + 1 ; j-- ){
            sind[cnt] = oned[i][j];
            cnt++;
        }

        return sind;
    }


    public static void roatate(int oned[] , int r){
        r = r%oned.length;
        /*( Checking for negavtive value for anti clock wise rotation)*/
        if (r < 0){
            r = r + oned.length;
        }
        reverse(oned ,0 , oned.length-r-1);
        reverse(oned ,oned.length-r , oned.length-1);
        reverse(oned ,0 , oned.length-1);
    }


    public static void display(int arr[][]){
        for(int i =0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }





    public static void rotateshell(int[][] arr , int s , int r){
        /*Converting the shell to one dimentional array*/
        int [] oned =  fillonedfromshell(arr,s);
        /*rotating the one dimentional array to 90 degrees */
        roatate(oned ,r);
        /*Creating the 2D matix from the array*/
        fillshellfromoned(arr,s,oned);

    }








    public static void main (String args[]){

        System.out.println("Enter the rows and colums of a matrix");
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int cnt = 10;
        int arr[][] = new int[row][col];

        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[0].length ; j++){
                arr[i][j] = cnt + 1;
                cnt++;
            }
        }

        System.out.println("Enter the Shell in the matrix to rotate");
        int shell = scn.nextInt();
        System.out.println("Enter how many time to rotate Shell ");
        int rotate = scn.nextInt();


        rotateshell(arr,shell,rotate);
        display(arr);


    }


}
