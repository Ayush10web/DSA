import java.util.Scanner;

public class factorial {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = fact(n);
        System.out.println(m);
    }

    public static int fact(int n) {
        if(n == 0) {return 1 ;}
        return n *= fact(n-1);
    }
}
