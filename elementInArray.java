import java.util.Scanner;

public class elementInArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println( "Length of array :" );

        int n = sc.nextInt();

        int [] arr = new int[n];

        for ( int i = 0 ; i < arr.length ; i++ ) {
            arr [i] = sc.nextInt();
        }

        System.out.println( "Enter any number to check : " );

        int m = sc.nextInt();

        for( int i = 0 ; i < arr.length ; i++ ) {
            if ( arr[i] == m ) {
                System.out.println( "The number is in the array");
            }
        }

        sc.close();

    }
}
