package DynamicProgramming;

import java.util.Scanner;

public class Buy_sell_stocks_infinite_transaction_allowed {

    public static void main (String args[]){
        System.out.println("Enter the number od days");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i < n ; i++){
            System.out.println("Enter the stock value at day " + i);
            arr[i] = scn.nextInt();
        }

        int bd = 0 ;
        int sd = 0;
        int profit = 0;

        for (int i = 1 ; i < arr.length ; i ++){
            if (arr[i] >= arr[i-1]){
                sd++;
            }
            else {
                profit += arr[sd] - arr[bd];
                sd = bd = i;
            }
        }
        System.out.println("The maximum profit with infinite tranactions will be " + profit);
    }
}
