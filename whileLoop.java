import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        
        int i = 1 ;

        while ( i <= 5 ) {
            System.out.println( "Namaste World" );
            i++;
        }

        whileLoop.whileLoop1() ;

        whileLoop.whileLoop2() ;

        whileLoop.whileLoop3( 5 ) ;
    }

    public static void whileLoop1 () {
        int i = 1;
        int sum = 0 ;

        while ( i <= 10 ) {
            sum = sum + i ;
            i++ ;
        }

        System.out.println(sum);
    }

    public static void whileLoop2 ( ) {

        Scanner sc = new Scanner(System.in) ;

            int n = sc.nextInt() ;

            int multi = 0 ;

            int i = 1 ;

            while ( i <= 10 ) {

                multi = n * i ;

                System.out.println(multi);

                i++;
            }

            sc.close();
    } 

    public static void whileLoop3 ( int n ) {

        int i = 1 ;

        while ( i <= n ) {

            // n! = n * (n-1) * (n-2) * (n-3) * ...... ( n -(n-1))

            n *= i ;

            i++;
        }

        System.out.println(n);
    }
}
