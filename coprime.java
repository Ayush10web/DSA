import java.util.*;
public class coprime {
    static long gcd(long a, long b) {
        if((a%b)==0) {
            return b;
        } else {
            return gcd(b, a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong(), ans = -1, i, j;
            long[] c = new long[1001];
            Arrays.fill(c, -1);
            for(i=1;i<=n;i++) {
                j = sc.nextLong();
                c[(int)j] = i;
            }
            for(i=1; i<=1000; i++) {
                for(j=i; j<=1000; j++) {
                    if(c[(int)i]>0 && c[(int)j]>0) {
                        if(gcd(i, j)==1) {
                            ans = Math.max(ans, c[(int)i]+c[(int)j]);
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
