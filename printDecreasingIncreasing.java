import java.util.Scanner;

public class printDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // pd(n);
        pi(n);
    }

    public static void pd(int n) {
        if (n == 0){
            return;
        }
        System.out.println(n);
        pd(n-1);
    }

    public static void pi(int n) {
        if (n == 0) {
            return;
        }
        pi(n-1);
        System.out.println(n);
    }
}
