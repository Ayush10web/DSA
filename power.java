import java.io.BufferedReader;
import java.io.InputStreamReader;

public class power {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int s = pow(n,m);
        System.out.println(s);
    }

    public static int pow(int n, int m) {
        if(m==0) {return 1;}
        int r = pow(n,m-1);
        int t = r*n;
        return t;
    }
}
