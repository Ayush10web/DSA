import java.util.Arrays;

public class reverseArray {
    public static void printArray(int[] arr){
        // for(int i = 0 ; i < arr.length ; i++){
        //     System.out.print(arr[i]+","+" ");
        // }
        // System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int a ,int b){
        int temp =  a;
        a =  b;
        b = temp;
        // System.out.println(a+"and"+b);
    }

    public static void reverse(int[] arr){
        // int[] newArr = new int [arr.length];
        int t ;
        for (int i=0;i<arr.length/2;i++){
            // swap(arr[i], arr[arr.length-i-1]);
            t = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1]=t;
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        int[] arr = {24,56,18,99,21};
        // printArray(arr);
        // int a = 9 ;
        // int b = 7 ;
        // swap(a,b);
        // reverse(arr);
        reverse(arr);
    }
}
