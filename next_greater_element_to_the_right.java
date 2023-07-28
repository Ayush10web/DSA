import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class next_greater_element_to_the_right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i : arr) {
            arr[i] = sc.nextInt();
        }
        int [] finalArr = new int[n];
        Stack<Integer> st = new Stack<>();

        sc.close();

        st.push(arr[n-1]);
        finalArr[n-1] = -1;
        for(int i = n-2 ; i >= 2 ; i--) {
            while (st.isEmpty() == false && st.peek() <= arr[i]) {
                st.pop();
            }

            if(st.size() == 0) {
                finalArr[i] = -1;
            }else{
                finalArr[i] = st.peek();
            }
            st.push(arr[i]);
        }

        System.out.println(Arrays.toString(finalArr));

    }
}
