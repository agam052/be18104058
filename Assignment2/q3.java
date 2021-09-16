import java.util.*;

public class q3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = scan.next();

        sortString(s);
    }

    public static void sortString(String s){
        int[] count = new int[256];
        for(char c: s.toCharArray()){
            count[c]++;
        }

        for(int i=0; i<256; i++){
            for(int j=0; j<count[i]; j++){
                System.out.print((char)(i));
            }
        }
    }
}