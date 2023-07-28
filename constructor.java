public class constructor {
    
    int l , b , h ; 

    // Creating constructor 

    /**
     *   *Name of the constructor is same as class name 
     *   *it has no return type
     */

    public constructor ( int L , int B , int H ) {
        l = L ; b = B ; h = H ; 

        System.out.println( L );
        System.out.println( B );
        System.out.println( H );
    }
    
    public static void main(String[] args) {
        
        //Creating object 

        new constructor(10, 20, 030); 

    }
}
