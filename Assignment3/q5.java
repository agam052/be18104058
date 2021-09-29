import java.util.*;

public class q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in array");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns in array");
        int c = sc.nextInt();

        if (r != c) {
            System.out.println("This matrix is not square so it's neither symetric nor skew symetric");
        } else {
            System.out.println("Enter the elements of array");
            int[][] arr = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int[][] transpose = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    transpose[i][j] = arr[j][i];
                }
            }

            boolean isSymetric = true, isSkew = true;

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (arr[i][j] != transpose[i][j]) {
                        isSymetric = false;
                    }

                    if (arr[i][j] != -transpose[i][j]) {
                        isSkew = false;
                    }
                }
                if (!isSkew && !isSymetric) {
                    break;
                }
            }

            if (isSkew) {
                System.out.println("This matrix is Skew Symetric");
            }

            if (isSymetric) {
                System.out.println("This matrix is a Symetric Matrix");
            }
        }

        sc.close();

    }
}
