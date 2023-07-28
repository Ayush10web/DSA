import java.util.Scanner;

public class leetcode2535 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int digitsum = 0;
    int elementsum = 0;
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < a.length; i++) {
      while (a[i] > 0) {
        digitsum += a[i] % 10;
      }
      elementsum += a[i];
    }
    int ans = Math.abs(elementsum - digitsum);
    System.out.println(ans);
  }
}
