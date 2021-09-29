import java.util.*;

public class q6 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int r = 3, c = 3;

        int[][] A = new int[r][c];

        System.out.println("Enter the elements of array");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int d = A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
                - A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
                + A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
        System.out.println("Determinant of the matrix is " + d);
    }

}
