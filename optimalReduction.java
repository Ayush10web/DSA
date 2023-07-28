import java.util.Scanner;

public class optimalReduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for(int j=0;j<n;j++){
                a[j]=sc.nextInt();
            }
            int k = 1;
            while(k<n && a[k]>=a[k-1]) k++;
            while(k+1<n && a[k]>=a[k+1]) k++;
            if(k>=n-1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
