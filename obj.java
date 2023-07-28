class a {
    void fun1() {
        System.out.println("A");
    }
}

class b extends a {
    void fun2() {
        System.out.println("B");
    }
}

public class obj {
    public static void main(String[] args) {
        a obj = new b();
        fun1();
    }
}
