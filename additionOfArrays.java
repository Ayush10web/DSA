import java.util.Arrays;
import java.util.Scanner;

public class additionOfArrays {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner ( System.in ) ;

        int [] a = new int [5] ;
        int [] b = new int [5] ;

        System.out.println ( "Enter the first array : " ) ;

        for ( int i = 0 ; i < 5 ; i++) {
            a[i] = sc.nextInt () ;
        }

        System.out.println ( "Enter the second array : " ) ;

        for ( int i = 0 ; i <= 5 ; i++) {
            b[i] = sc.nextInt () ;
        }

        int [] c = {} ;

        for ( int i = 0 ; i < 5 ; i++ ) {
            c[i] = a[i] + b [i] ;
        }

        System.out.println(Arrays.toString(c));

        sc.close();
    }
}