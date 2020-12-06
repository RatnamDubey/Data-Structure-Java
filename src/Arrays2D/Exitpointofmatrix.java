package Arrays2D;

import java.util.Scanner;

public class Exitpointofmatrix {


   public static void main(String args[]){

       System.out.println("Enter the row and column of the matrix");
       Scanner scn = new Scanner(System.in);
       int row = scn.nextInt();
       int col = scn.nextInt();

       int arr[][] = new int[row][col];

       for(int i=0; i < row ; i++){
           for(int j=0 ; j < col ; j++ ){
               int temp = scn.nextInt();
               if (temp ==0 | temp ==1){
                   arr[i][j] = temp;
               }
               else{
                   System.out.println("Invalid input");
                   return;
               }
           }
       }


       int dir = 0;
       int i =0;
       int j = 0;

       while (true){

           dir = (dir + arr[i][j]) % 4 ;

           if(dir == 0){
               j++;
           }
           else if (dir == 1){
               i++;
           }
           else if( dir ==2){
               j--;
           }
           else if (dir == 3){
               i--;
           }



            /*Securing the termial*/

            if(i < 0){
                i++;
                break;
            }
            else if (j < 0){
                j++;
                break;
            }
            else if(i == arr.length){
                i--;
                break;
            }
            else if ( j == arr[0].length){
                j--;
                break;
            }


       }

       System.out.println("The cordinates of exit point is (" + i + " ,"+ j + ")");



   }
}
