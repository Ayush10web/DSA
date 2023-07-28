public class Swap_whthout_3rd_variable {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;

        System.out.println("The Original values are " + "\na : " + a + "\nb : " + b);

        // SWAPPING 
        a =  a + b ;
        b =  a - b ;
        a =  a - b ;

        System.out.println("The Swapped value are " + "\na : " + a + "\nb : " + b);
        
    }
}
