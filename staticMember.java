class Example {

    int x; //Instance variable member

    static int y; //Static member variable

    public void fun1( ) { //Instance member function 

        System.out.println("This is method fun1");
    }

    public static void fun2( ) { //Static member function

        System.out.println("This is method fun2") ; 
    }                                               
                                                    
    static class Test {                             
        public static String country = "India" ;    
    }
}

public class staticMember {
    public static void main(String[] args) {
        
        // Creating object

        Example ex = new Example();

                Example.fun2() ;

        String s = Example.Test.country ;

        System.out.println( s ) ; 
        
        ex.fun1();

        System.out.println( Example.y = 4 );

    }
}
