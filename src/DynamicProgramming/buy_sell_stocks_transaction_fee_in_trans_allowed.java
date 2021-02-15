package DynamicProgramming;

import java.util.Scanner;

public class buy_sell_stocks_transaction_fee_in_trans_allowed {

    public static void main (String args[]){
        System.out.println("Enter the number of days");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr [] = new int[n];

        for (int i = 0 ; i < n ; i ++ ){
            System.out.println("Enter the stock value at day " + i);
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the transaction fees");
        int trans = scn.nextInt();

        int obsp = -arr[0];
        int ossp = 0;

        for (int i = 1 ; i < arr.length ; i ++){

            int nbsp = 0;
            int nssp = 0;

            ///determining BSP
            if (ossp - arr[i] > obsp){
                nbsp = ossp - arr[i];
            }
            else {
                nbsp = obsp;
            }

            // Determining SSP

            if (arr[i] + obsp - trans > ossp){
                nssp = obsp + arr[i] - trans;
            }
            else{
                nssp = ossp;
            }

            ossp = nssp;
            obsp = nbsp;

        }

        System.out.println("The maximum profit can be attained is " + ossp);
    }
}
