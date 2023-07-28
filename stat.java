
class example {

    //Instance variable
    int x;

    //Static member variable
    static int y;

    //Instance member function
    public void fun1(){
        System.out.println("This is first function");
    }

    //Static member function
    public static void fun2(){
        System.out.println("This is second function");
    }

    static class test {
        public static String country = "India";
    }
}

//creating main class 

public class stat {
    public static void main(String[] args) {
        
        //creating a reference variable
        example e1 = new example();

        //Accessing function fun1
        e1.fun1();

        //Accessing function fun2
        example.fun2();

        //Accessing static member variable
        example.y = 4;

        //Accessing static class
        System.out.println(example.test.country);

        //Accessing instance variable
        System.out.println(e1.x);
    }
}
