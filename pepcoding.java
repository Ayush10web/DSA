import java.util.Scanner;

public class pepcoding {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt();
        int d = sc.nextInt();
        //int f = getDigitalFrequency(n, d);
        //int f = decimalToAnybase(n, d);
        //int f  = spanOfArrays(n, sc);
        //System.out.println(f);
        sc.close();
    }

    public static int getDigitalFrequency( int n , int d ) {
        int counter = 0 ;

        while ( n > 0 ) {
            int temp = n % 10 ;
            n = n / 10 ;
        
            if ( temp == d ) 
                counter++;
        }
        return counter ;
    }

    /**
     * @param n
     * @param d
     * @return
     */
    public static int decimalToAnybase( int n , int d ) {

        int c = 0 ;
        int counter = 0 ;
        while ( n > 0 ) {
            int temp = n % d ;
            n = n / d ;
            c = c + (int) (temp * Math.pow(10 , counter)) ;
            counter++;
        }
        return c;
    }

    public static int spanOfArrays( int n, Scanner sc ) {
        int [] arr = new int [n] ;

        int span;
        for ( int i = 0 ; i < n ; i++ ) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for ( int i = 0 ; i < n ; i++ ) {
            if ( arr[i] > max ) {
                max = arr[i];
            }
            if ( arr[i] < min ) {
                min = arr[i];
            }
        }
        return span = max-min ;
    }

    public void compare( int n , int d , Scanner sc ) {

        int [] arr = new int[n];
        
        for ( int i = 0 ; i < n ; i++ ) {
            arr[i] = sc.nextInt();
        }

        for ( int i = 0 ; i < n ; i++) {
            if (arr[i] == d) {
                System.out.println(i);
            }
            else System.out.println("-1");
        }
    }
}