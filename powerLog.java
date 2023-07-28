import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class powerLog {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int s = Power(x, n);
        System.out.println(s);
    }

    public static int Power(int x , int n) {
        if (n == 0) {return 1;}
        int r = Power(x, n/2) ;
            int t = r*r ;
        if ( n%2 == 0 ) {
            return t;
        }
        return t*x ;
    }
}
