import java.util.HashMap;
import java.util.Scanner;

import javax.print.attribute.HashDocAttributeSet;

public class largestSubarray {
    public static void main(String[] args) {
        // int arr[] =  {15,-2,2,-8,1,7,10,23};
        // int arr[] = {0};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i : arr) {
            arr[i] = sc.nextInt();
        }
        int ans = maxLength(arr, n);
        System.out.println(ans);
    }
    public static int maxLength(int[]a,int n){
        // int len = 1;
        // for (int i = 0; i < a.length-1; i++) {
        //     int sum = a[i];
        //     for (int j = i+1; j < a.length; j++) {
        //         sum+=a[j];
        //         if(sum!=0) continue;
        //         if(sum==0){
        //             len = Math.max(len, j-i+1);
        //         } 
        //     }
        // }
        int ans = 0;
            int []prefixsum = new int[n];
            prefixsum[0] = a[0];
            for (int i = 1; i < a.length; i++) {
                prefixsum[i] = prefixsum[i-1] + a[i];
            }
            HashMap<Integer,Integer> hm = new HashMap<>();
            hm.put(0,-1);
            for (int i = 0; i < a.length; i++) {
                if(hm.containsKey(prefixsum[i])){
                    ans = Math.max(ans , i-hm.get(prefixsum[i]));
                }else{
                    hm.put(prefixsum[i],i);
                }
            }
        return ans;
    }
}
