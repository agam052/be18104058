import java.util.*;

public class q4{
    public static void main(String[] args){
        int n = 1;
        int sum = 1;
        while(n < Integer.MAX_VALUE){
            if(sum == n*n){
                System.out.println("Answer: " + n);
            }
            n++;
            sum += n;
        }
    }
}