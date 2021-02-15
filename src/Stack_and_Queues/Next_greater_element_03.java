package Stack_and_Queues;
import java.io.*;
import java.util.*;

public class Next_greater_element_03 {
        public static void display(int[] a) {
            StringBuilder sb = new StringBuilder();

            for (int val: a) {
                sb.append(val + "\n");
            }
            System.out.println(sb);
        }

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter values at position " + i);
                a[i] = Integer.parseInt(br.readLine());
            }

            int[] rarr = solve(a);
            display(rarr);
        }

        public static int[] solve(int[] arr) {
            int [] rarr = new int[arr.length];
            // Create a stack
            Stack<Integer> st = new Stack<>();
            // Entering the last digit
            st.push(arr[arr.length -1]);
            rarr[arr.length-1] = -1;
            // Running the loop from the reverse
            for (int i = arr.length- 2 ; i >= 0 ; i--){
                if (arr[i] < st.peek()){
                    rarr[i] = st.peek();
                    st.push(arr[i]);
                }
                else{
                    while(st.size() > 0 && arr[i] >= st.peek() ){
                        st.pop();
                    }
                    if (st.size() ==0 ){
                        st.push(arr[i]);
                        rarr[i] = -1;
                    }
                    else{
                        rarr[i] = st.peek();
                        st.push(arr[i]);
                    }
                }
            }
            return(rarr);
        }
    }

