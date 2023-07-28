import java.util.Scanner;

public class barChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []arr = new int[n];

        for (int i : arr) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int max = arr[0];

        for (int i = 0 ; i < n ; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for ( int floor = max ; floor >=1 ; floor-- ) {
            for (int i = 0 ; i < n ; i++ ) {
                if (arr[i] >= floor) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
