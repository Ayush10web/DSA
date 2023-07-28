import java.util.Arrays;
import java.util.Scanner;

public class ehab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []a =new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int l=0;
        Arrays.sort(a);
        while(l<=k){
            int min=a[0];
            for (int i=0;i<n;i++) {
                if(min==0){
                    System.err.println(0);
                    min=a[i++];
                } else {
                    System.out.println(min);
                    a[i] = a[i] - min ;
                    l++ ;
                }
            }
            // System.out.println(min);
            // for (int j =0;j<n;j++) {
            //     if(min == 0){
            //         continue;
            //     }
            //     a[j]=a[j]-min;
            // }
            // l++;
        }    
    }
}