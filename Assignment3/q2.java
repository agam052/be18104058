import java.util.*;

public class q2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of fibonnaci numbers you want: ");
        int len = sc.nextInt();

        int[] arr = new int[len + 1];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i <= len; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println(Arrays.toString(arr));
    }
}
