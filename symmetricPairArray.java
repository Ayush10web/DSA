import java.util.HashMap;
import java.util.Scanner;

public class symmetricPairArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int [][] arr = new int[n][m];
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        int arr[][] = new int[5][2];
        arr[0][0] = 11; arr[0][1] = 20;
        arr[1][0] = 30; arr[1][1] = 40;
        arr[2][0] = 5;  arr[2][1] = 10;
        arr[3][0] = 40;  arr[3][1] = 30;
        arr[4][0] = 10;  arr[4][1] = 5;

        findSymmetricPairs(arr);
        sc.close();
    }

    // public static List<Pair<Integer, Integer>> findSymmetricPairs(int[][] a) {
    //     int n = a.length;
    //     Map<Integer, Integer> m = new HashMap<>();
    //     for (int i = 0; i < n; i++) {
    //         m.put(a[i][0], a[i][1]);
    //     }
    //     List<Pair<Integer, Integer>> ans = new ArrayList<>();
    //     for (int i = 0; i < n; i++) {
    //         if (!m.containsKey(a[i][0])) {
    //             continue;
    //         }
    //         if (m.containsKey(a[i][1]) && m.get(a[i][1]) == a[i][0]) {
    //             ans.add(new Pair<>(a[i][0], a[i][1]));
    //             m.remove(a[i][1]);
    //         }
    //     }
    //     return ans;
    // }

    public static void findSymmetricPairs(int [][]a){
        HashMap <Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int first = a[i][0];
            int sec = a[i][1];

            Integer val = hm.get(sec);

            if(val != null && val==first){
                System.out.println("Pair is " + sec+","+first);
            }

            else {
                hm.put(first, sec);
            }
        }
    }
}
