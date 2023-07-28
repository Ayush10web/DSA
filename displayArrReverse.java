import java.util.Scanner;

public class displayArrReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for ( int i = 0 ; i < n ; i++ ){
            arr[i]=sc.nextInt();
        }
            displayArrayReverse(arr, n-1);
    }

    public static void displayArrayReverse(int[] arr , int idx) {
        if(idx==-1){
            return;
        }
        System.out.println(arr[idx]);
        displayArrayReverse(arr, idx-1);
    }
}
