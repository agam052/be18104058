import java.util.*;

public class q6 {
    static Vector<Integer> reArrange(int input[], int size) {
        Vector<Integer> odd = new Vector<Integer>(1);
        Vector<Integer> even = new Vector<Integer>(1);

        Arrays.sort(input);

        for (int i = 0; i < size; i++) {
            if (input[i] % 2 == 0) {
                even.add(input[i]);
            } else {
                odd.add(input[i]);
            }
        }

        for (int i = 0; i < even.size(); i++) {
            odd.add(even.get(i));
        }

        return odd;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = scan.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Vector<Integer> output = reArrange(arr, n);

        System.out.println(output);
        scan.close();
    }

}