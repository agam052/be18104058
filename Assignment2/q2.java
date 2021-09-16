import java.util.*;

public class q2{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements (In the range from 0 to 20): ");
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int[] count = new int[21];
        for(int el: arr){
            count[el]++;
        }

        int low = 0;
        for(int i=0; i<21; i++){
            int temp = low;
            while(low < temp + count[i]){
                arr[low++] = i;
            }
        }
        for(int el: arr){
            System.out.print(el + " ");
        }
    }    
}
