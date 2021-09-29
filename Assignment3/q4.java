import java.util.*;

public class q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in array: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        int trace = 0;
        System.out.println("Enter the elements of array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
                if (i == j) {
                    trace += arr[i][j];
                }
            }
        }

        System.out.println("Trace of the given array is " + trace);
    }
}
