public class finalKeyword {
    
    private final int x = 9 ; // final instance member variable
            public int getx ()
            {
                System.out.println( "This is final instance member variable " ) ;
                return x;
            }
    /**
     * It can be declared in three types
     *    1 .   x = 5 ;
     *    2 .   Initialization Block 
     *                     {
     *                        X = 5 ;
     *                     } 
     *    3 .   By making constructor 
     *                    final(){
     *                            x = 5 ;
     *                             }
     */

    private static final int y = 8 ; // final static instance member variable 
            public int gety () 
            {
                System.out.println( "This is final static member variable " );
                return y;
            }
    /**
     * It can be declared in two types 
     *    1 .   Y = 4 ;
     *    2 .   Static initialization block
     *                   static
     *                        {
     *                          Y = 4 ;
     *                        }
     */

    public void fun() {
        final int k = 10 ;
        System.out.println(k);
    }

    public static void main(String[] args) {
        
        finalKeyword f = new finalKeyword ();
        f.fun();
        f.getx();
        f.gety();
    }
}
