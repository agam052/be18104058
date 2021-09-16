import java.util.*;

public class q6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        System.out.println("Hailstone sequence: " + num);
        while(n != 1 && k<Integer.MAX_VALUE && n<Integer.MAX_VALUE && n > 0){
            if(n%2 == 0){
                n/=2;
            }
            else{
                n*=3;
                n++;
            }
            System.out.println(n);
        }
        if(n == Integer.MAX_VALUE || n < 0){
            System.out.println("Integer overflow");
        }
    }
}