package Functionandarrays;

import java.util.Scanner;

public class FirstandLastindex {


    public static void main(String args[]) {

        int arr[] = {10, 20, 30, 33, 33, 33, 33, 33, 50, 60, 80};
        Scanner scn = new Scanner(System.in);
        int temp = scn.nextInt();
        int temp2[] = {temp - 1, temp + 1};
        int l = 0;
        int h = arr.length - 1;
        int lowind = -1;
        int higind = 0;


        while (l <= h) {
            int m = (l + h) / 2;
            if (arr[m] > temp) {
                h = m - 1;
            } else if (arr[m] < temp) {
                l = m + 1;
            } else {
                lowind = m;
                h = m - 1;
            }
        }

        l = 0;
        h = arr.length - 1;


        while (l <= h) {
            int m = (l + h) / 2;
            if (arr[m] > temp) {
                h = m - 1;
            } else if (arr[m] < temp) {
                l = m + 1;
            } else {
                higind = m;
                l = m + 1;
            }
        }


        System.out.println("Start " + lowind + " End " + higind);


    }
}
