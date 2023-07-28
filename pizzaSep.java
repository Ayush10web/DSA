import java.util.*;

public class pizzaSep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int total=0;
        int mini=360;
        int l=0;
        int r=0;
        while(r<n){
            total += a[r];
            r++;
            while(total>180){
                mini = Math.min( mini,angleDiff(total));
                total -= a[l];
                l++;
            }
            mini = Math.min( mini,angleDiff(total));
        }
        System.out.println(mini);
    }
    public static int angleDiff(int a){
        return 2*Math.abs(a-180);
    }
}
