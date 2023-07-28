import java.util.Scanner;

public class displayArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            arr[i]=sc.nextInt();
        }
        displayArray(arr, 0);
    }

    public static void displayArray(int [] arr , int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.print(arr[idx]);
        displayArray(arr, idx+1);
    }
}
