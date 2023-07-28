import java.io.*;
import java.util.*;

public class removingSmallestMultiples {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		for(int t = 0; t < test; ++t){
			int n = sc.nextInt();
			String str = sc.next();
			boolean arr[] = new boolean[n+1];
            
			
			for (int i = 1; i <= n; i++) {
				if(str.charAt(i-1) == '1'){
					arr[i] = true;
				}
			}
			long  ans = 0;
			int cost[] = new int[n+1];
			for (int i = n; i >= 1; i--) {
				for (int j = i; j <= n; j += i) {
					if (arr[j]) break;
					cost[j] = i;
				}
			}
			for (int i = 1; i <= n; i++) {
				if (!arr[i]) ans += cost[i];
			}
			
			System.out.println(ans);
		}
	}
}
