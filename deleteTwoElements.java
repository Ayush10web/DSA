import java.util.Scanner;

public class deleteTwoElements{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //LENGTH OF ARRAY

        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int count = -1;

        for (int i = 0; i < n; i++) {
            sum +=arr[i];
        }

        int k = sum/n;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                int arraysum = sum - arr[i] - arr[j];
                int ksum = k * (n-2);

                if(arraysum==ksum) count++;
                else break;
            }
        }

        System.out.println((count+1)/2);

    }
}