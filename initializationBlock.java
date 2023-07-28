public class initializationBlock {
    
    private int x ;

        // Initialization block
        {
            System.out.println("This is a initialization block") ;
            x = 5;
        }

        // Making a constructor

        public initializationBlock () {
            System.out.println( "Constructor : x = " + x ) ;
        }

        //Static initialization block
        /**
         * Compile before object and runs only once
         */
        static
        {
            System.out.println( "This is static initialization block" );
        }


    public static void main(String[] args) {
        
        new initializationBlock();

    }
}
