public class stackImplementation {
    private int [] arr ;
    private int top ;

    public stackImplementation(int size){
        arr = new int[size];
        top = -1;
    }

    void push(int value){
        if(top == arr.length-1 ){
            throw new IllegalStateException("Stack is full");
        }
        top++;
        arr[top] = value;
    }

    void pop(){
        if(top == -1){
            throw new IllegalStateException("Stack is empty");
        }
        top--;
        System.out.println(arr[top]);
    }

    int peek(){
        if(top == -1){
            throw new IllegalStateException("Stack is empty");
        }
        return arr[top];
    }

    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    int size(){
        return top+1;
    }

    void display(){
        if(top == -1){
            throw new IllegalStateException("Nothing to display : Stack is empty");
        }
        for (int i = arr.length-1 ; i >= 0 ; i--) {
            System.out.println(arr[i]);
        }
    }

    int sex(){
        if(top == -1){
            throw new IllegalStateException("Nhi milega");
        }
        return arr[top]*arr[--top];
    }


    public static void main(String[] args) {
        stackImplementation st = new stackImplementation(5);
        System.out.println("Is the Stack empty : " + st.isEmpty());
        st.push(19);
        st.push(20);
        st.push(32);
        st.push(44);
        st.push(52);
        System.out.println("Top of Stack : " + st.peek());
        System.out.println("Is the Stack empty : " + st.isEmpty());
        System.err.println("Size of the Stack : " + st.size());
        st.display();
        st.pop();
        System.err.println("Size of Stack : " + st.size());
        System.err.println("Hogaya Khush : " + st.sex());
    }
}
