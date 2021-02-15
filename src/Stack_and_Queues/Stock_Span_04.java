package Stack_and_Queues;
import java.io.*;
import java.util.*;

public class Stock_Span_04 {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val: a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of an array");
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value at index" + i);
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] span = solve(a);
        display(span);
    }

    public static int[] solve(int[] arr) {
        int [] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        // First value will be 1 ( no span)
        st.push(0);
        span[0] = 1;
        // looping through variable
        for (int i = 2 ; i < arr.length ; i ++){
            while ( st.size() > 0 && arr[i] > arr[st.peek()]){
                st.pop();
            }
            if (st.size() == 0){
                span[i] = i + 1 ;
            }
            else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        // solve
        return span;
    }
}
