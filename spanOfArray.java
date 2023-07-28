import java.util.Arrays;
import java.util.Scanner;

public class spanOfArray {
    
    public static void main ( String [] args ) {

        // spanOfArray.span();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array :");

        int n = sc.nextInt();
        int [] arr = new int [n] ;

        for ( int i = 0 ; i < n ; i++ ) {
            arr[i] = sc.nextInt() ;
        }

        System.out.println(Arrays.toString(arr)) ;

        int max = arr[0];
        int min = arr[0];

        for ( int i = 1 ; i < arr.length ; i++ ) {
            if ( arr[i] < min ) {
                min = arr[i];
            }
            if ( arr[i] > max ) {
                max = arr[i];
            }
        }

        int span = max - min ;

        System.out.print ( "Span of array is : ");
        System.out.print ( span ) ;

        sc.close();

    }

    // public static void span () {

    // Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    // int[] arr = new int[n];

    // for (int i = 0; i < n; i++) {
    //     arr[i] = scn.nextInt();
    // }

    // int min = arr[0];
    // int max = arr[0];

    // for (int i = 1; i < arr.length; i++) {
    //     if (arr[i] < min) {
    //     min = arr[i];
    //     }

    // if (arr[i] > max) {
    //     max = arr[i];
    //     }
    // }

    // int span = max - min;
    // System.out.println(span);
    // }

}
