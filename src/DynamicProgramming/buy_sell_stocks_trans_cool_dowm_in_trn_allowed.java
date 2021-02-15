package DynamicProgramming;

import StringBuilderArraylist.StringCompression;

import java.util.Scanner;

public class buy_sell_stocks_trans_cool_dowm_in_trn_allowed {

    public static void main (String args[]){
        System.out.println("Enter the number of transaction days");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for ( int i = 0 ; i < arr.length ; i ++){
            System.out.println("Enter the stock value at day " + i);
            arr[i] = scn.nextInt();
        }

        int ossp = 0;
        int obsp =  -arr[0];
        int ocsp = 0;

        for (int i = 1 ; i < arr.length ; i ++){
            int nssp = 0;
            int nbsp = 0;
            int ncsp = 0;

            //determining buying state
            if ( ocsp - arr[i] > obsp){
                nbsp = ocsp - arr[i];
            }
            else{
                nbsp = obsp;
            }
            //determining selling state
            if ( obsp + arr[i] > ossp){
                nssp = obsp + arr[i];
            }
            else{
                nssp = ossp;
            }
            //determining cool down
            if (ossp > ocsp){
                ncsp = ossp;
            }
            else {
                ncsp = ocsp;
            }
            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }
        System.out.println("Maximum profit is " + ossp);
    }
}
