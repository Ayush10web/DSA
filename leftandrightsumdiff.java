import java.util.Arrays;
import java.util.Scanner;

public class leftandrightsumdiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] ans = new int[n];
        for(int i =0;i<n;i++){
            ans[i]=sc.nextInt();
        }
        int finalans[] = new int[n];
       // finalans=leftRightDifference(ans);
        finalans=rightSum(ans);
        
        System.out.println(Arrays.toString(finalans));
    }
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftsum=new int[n];
        int[] rightsum=new int[n];
        leftsum=leftSum(nums);
        rightsum=rightSum(nums);
        int[] ans=new int[n];
        ans=diff(leftsum,rightsum);
        return ans;
    }
    public static int[] leftSum(int[]a){
        int []b=new int[a.length];
        b[0]=0;
        for(int i=1;i<a.length;i++){
            b[i]=b[i-1]+a[i-1];
        }
        return b;
    }
    public static int[] rightSum(int[]a){
        int n = a.length;
        int []b=new int[n];
        b[n-1]=0;
        for(int i=n-2;i>=0;i--){
            b[i]=b[i+1]+a[i+1];
        }
        return b;
    }
    public static int[] diff(int[]a,int[]b){
        int[] c = new int[a.length];
        for(int i=0;i<a.length;i++){
            c[i]=Math.abs(a[i]-b[i]);
        }
        return c;
    }
}
