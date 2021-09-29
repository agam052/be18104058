import java.util.*;

public class q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows in array1");
        int r1 = sc.nextInt();
        System.out.println("Enter number of columns in array1");
        int c1 = sc.nextInt();

        int[][] arr1 = new int[r1][c1];

        System.out.println("Enter the elements of array1");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                int ele = sc.nextInt();
                arr1[i][j] = ele;
            }
        }

        System.out.println("Enter number of rows in array2");
        int r2 = sc.nextInt();
        System.out.println("Enter number of columns in array2");
        int c2 = sc.nextInt();

        int[][] arr2 = new int[r2][c2];

        System.out.println("Enter the elements of array2");

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                int ele = sc.nextInt();
                arr2[i][j] = ele;
            }
        }

        if (c1 != r2) {
            System.out.println("Matrix multiplication for these arrays is not possible");
        } else {
            int[][] ans = new int[r1][c2];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    int temp = 0;

                    for (int k = 0; k < c1; k++) {
                        temp += (arr1[i][k] * arr2[k][j]);
                    }

                    ans[i][j] = temp;
                }
            }

            for (int[] row : ans)
                System.out.println(Arrays.toString(row));
        }

        sc.close();

    }

}
