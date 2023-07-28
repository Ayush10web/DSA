import java.util.Scanner;

public class deleteTwoElements2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        sc.close();

        int avgpre = (sum*2)/n;
        // int avgnow = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(avgpre == arr[i]+arr[j]){
                    count++;
                }
                else break;
            }
        }

        System.out.println(count/2);


    }
}
