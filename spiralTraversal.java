import java.util.Scanner;

public class spiralTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int minrow = 0;
        int mincolumn = 0;
        int maxrow = arr.length-1;
        int maxcolumn = arr[0].length-1;
        int tue = n*m;
        int count = 0;

        while(count < tue ){

        //LEFT WALL
        for (int i = minrow , j = mincolumn ; i <= maxrow && count < tue ; i++) {
            System.out.println(arr[i][j]);
            count++;
        }
        mincolumn++;

        //BOTTOM WALL
        for (int i = maxrow , j = mincolumn ; i <= maxcolumn && count < tue ;  j++) {
            System.out.println(arr[i][j]);
            count++;
        }
        maxrow--;

        //RIGHT WALL
        for (int i = maxrow , j = maxcolumn ; i >= minrow && count < tue ; i--) {
            System.out.println(arr[i][j]);
            count++;
        }
        maxcolumn--;

        //TOP WALL
        for (int i = minrow , j = maxcolumn ; i >= mincolumn && count < tue ; j--) {
            System.out.println(arr[i][j]);
            count++;
        }
        minrow++;
    }

    }
}
