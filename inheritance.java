class inh {
    private int age;
    private String name;

        public void setAge( int a ) {
            age = a ;
        }

        public void setName( String n ) {
            name = n ;
        }

        public int getAge() {
            return ( age ) ;
        }

        public String getName() {
            return ( name ) ;
        }
}

class b extends inh {
    private int rollNo ;

        public void setrollNo( int r ) {
            rollNo = r ;
        }

        public int getrollNo () {
            return ( rollNo );
        }
}

public class inheritance {
    public static void main(String[] args) {
        
        b in1 = new b() ;

        in1.setName( "Ayush" ) ;
        in1.setAge(20);
        in1.setrollNo(10);

        System.out.println( "Name : " + in1.getName() );
        System.out.println( "Age : " + in1.getAge() );
        System.out.println( "Roll no : " + in1.getrollNo() );
    }
}

