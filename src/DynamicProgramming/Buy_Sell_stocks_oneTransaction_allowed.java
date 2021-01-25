package DynamicProgramming;

import java.util.Scanner;

public class Buy_Sell_stocks_oneTransaction_allowed {

    public static void main (String args[]){
        System.out.println("Enter number of days");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0 ; i < n ; i++){
            System.out.println("Enter the stock value at day " + i);
            arr[i] = scn.nextInt();
        }

        int lsv = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0 ;

        for (int i = 0 ; i < arr.length ; i ++){
            if (arr[i] < lsv){
                lsv = arr[i];
            }
            pist = arr[i] - lsv;
            if (pist > op){
                op = pist;
            }
        }
        System.out.println("The maximum profit can be "+ op);
    }
}
