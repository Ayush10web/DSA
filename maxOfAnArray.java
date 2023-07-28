import java.util.Scanner;

public class maxOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        int max = displayMaxArr(arr, 0);
        System.out.println(max);

    }
    
    public static int displayMaxArr(int [] arr , int idx) {
        if (idx>=arr.length){
            return Integer.MIN_VALUE;
        }

        int max = displayMaxArr(arr, idx+1);
        if (max>arr[idx]){
            return max;
        }
        else {
            return arr[idx];
        }

        
    }
}
