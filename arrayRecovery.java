import java.util.Scanner;

public class arrayRecovery{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long []d = new long[n];
            long []a = new long[n];
            for (int i = 0; i < n; i++) {
                d[i] = sc.nextLong();
            }
            a[0]=d[0];
            int f = 0;
            for (int i = 1; i < a.length; i++) {
                if(d[i]==0){
                    a[i]=a[i-1];
                }else{
                    if(a[i-1]-d[i]>=0){
                        f++;
                        break;
                    }else{
                        a[i]=a[i-1]+d[i];
                    }
                }
            }
            if(f>0){
                System.out.println(-1);
            }else{
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i]+" ");
                }
                System.out.println();
            }

        }
    }
}