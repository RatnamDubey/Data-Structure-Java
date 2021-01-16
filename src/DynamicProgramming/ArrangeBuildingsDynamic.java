package DynamicProgramming;

import java.util.Scanner;

public class ArrangeBuildingsDynamic {
    public static void main (String args[]){
        System.out.println("Enter the size of the string");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int obul = 1;
        int ospa = 1;
        int nbul = 0;
        int nspa = 0;

        /// No two buildings can come togather

        for (int i = 2 ; i <= n ; i++){
            nbul = ospa;
            nspa = ospa + obul;

            obul = nbul;
            ospa = nspa;
        }

        // for two side of the road we will square the number

        int val = nspa + nbul;
        val = val * val;

        System.out.println("Buildings without consecutive buldings allowed are on 2 side of road " + val );
    }



}
