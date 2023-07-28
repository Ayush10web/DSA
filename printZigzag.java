import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class printZigzag {
    public static void main(String[] args)throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        zigzag(n);
    }

    public static void zigzag(int n) {
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        zigzag(n-1);
        System.out.print(n + " ");
        zigzag(n-1);
        System.out.print(n + " ");
    }
}
