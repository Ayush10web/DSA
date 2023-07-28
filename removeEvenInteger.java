import java.util.Arrays;

public class removeEvenInteger {

    public static int[] removeEvenNumber(int[] arr) {
        int countOdd = 0 ;
        for (int i = 0 ; i < arr.length ; i ++){
            if(arr[i]%2!=0){
                countOdd++;
            }
        }

        int[] newArr = new int[countOdd];
        int idx=0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i]%2!=0){
                newArr[idx]=arr[i];
                idx++; 
            }   
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        //removeEvenNumber(arr);
        //System.out.print("123");
        System.out.println(Arrays.toString(removeEvenNumber(arr)));
    }
}
