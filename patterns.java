public class patterns {

    public static void main(String[] args) {
        
        patterns.leftTriangle(4);
        System.out.println();
        patterns.rightTriangle(5);
        System.out.println();
        patterns.pyramid(5);
        System.out.println();
        patterns.upperrightTriangle(5);
        System.out.println();
     //   patterns.diamondPattern(9);
        System.out.println();
        reversePyramid(5);
        System.out.println();
        reversePyramid2(6);

    }


    public static void leftTriangle ( int n ) 
    {
        /**  
         *   *
         *   * *
         *   * * *
         *   * * * *
         *   * * * * *
         */

        int rows , cols ;

        for ( rows = 1 ; rows <= n ; rows++) 
        {
            for ( cols = 1 ; cols <= rows ; cols++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void upperrightTriangle ( int n ) 
    {
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        for  ( int rows = 1 ; rows < n ; rows++) 
        {
            for ( int cols = 1 ; cols < n-rows ; cols++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightTriangle ( int n ) 
    {
        // _ _ _ _ *
        // _ _ _ * *
        // _ _ * * *
        // _ * * * *
        // * * * * * 
        /**
         * No of spaces    No of stars
         *      4              1
         *      3              2
         *      2              3
         *      1              4
         *      0              5
         */

        for ( int rows = 0 ; rows < n ; rows++) {
            for ( int cols = 1 ; cols < n-rows ; cols++) 
            {
                System.out.print(" ");
            }
            for ( int newCol = 0 ; newCol <= rows ; newCol++) 
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void pyramid ( int n ) {
        /**       
         *     ___*___
         *     __*_*__
         *     _*_*_*_
         *    _*_*_*_*_      
         * 
         *   |  N - R |  *****IMPORTANT CONCEPT*****
         */

        for ( int rows = 1 ; rows <= n ; rows++) {
            for ( int cols = 1 ; cols <= n-rows ; cols++) {
                System.out.print(" ");
            }
            for ( int newCol = 1 ; newCol <= rows ; newCol++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

/** 
    public static void diamondPattern ( int n ) {
        /**
         *      ----*----
         *      ---***---
         *      --*****--
         *      -*******-
         *      *********
         *      -*******-
         *      --*****--  
         *      ---***---
         *      ----*----      
         */
    /** 
        for ( int rows = 1 ; rows <= n ; rows++) {
            for ( int cols = 1 ; cols <= n - rows ; cols ++) {
                System.out.print(" ");
            }
            for ( int newCols = 0 ; newCols < n-rows ; newCols++) {
                System.out.print("* ");
            }
            for ( int nextCols = n-rows ; nextCols <= n ; nextCols++  ) {
                System.out.print("* ");
            }
            for ( int secCols = n-rows ; secCols <= n ; secCols++){
                System.out.print("");
            }
            System.out.println();
        }
    }
    **/

    public static void reversePyramid ( int n ) {
        /***
         *    ******
         *    -****-
         *    --**--
         *    ---*--
         */

        for ( int rows = 0 ; rows <= n ; rows++) {
            for ( int cols = 0 ; cols <= rows ; cols++) {
                System.out.print(" ");
            }
            for ( int newCols = 0 ; newCols <= n-1-rows ; newCols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void reversePyramid2 ( int rows ) {
        for (int i= 0; i<= rows-1 ; i++)
    {
        for (int j=0; j<=i; j++)
        {
            System.out.print(" ");
        }
        for (int k=0; k<=rows-1-i; k++)
        {
            System.out.print("*" + " ");
        }
        System.out.println();
    }
    }

    
}


