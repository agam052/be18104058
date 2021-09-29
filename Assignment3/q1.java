import java.util.*;

public class q1 {
    public static void main(String args[]) {
        System.out.println("Enter the number of rows in array");
        Scanner scan = new Scanner(System.in);

        int r = scan.nextInt();

        int[][] arr = new int[r][];

        for (int i = 0; i < r; i++) {
            System.out.println("Enter number of columns in row " + i);
            int temp = scan.nextInt();
            arr[i] = new int[temp];
        }

        for (int[] row : arr)
            System.out.println(Arrays.toString(row));

        scan.close();
    }
}
