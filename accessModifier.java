// Use of default 

class geek {
    void display () {
        System.out.println( "Hello i am using default access modifier" );
    }
}

public class accessModifier {
    
    public static void main(String[] args) {
        
        // creating object to call default access modifier

        geek def = new geek();
        def.display ();

    }
}
