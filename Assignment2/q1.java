import java.util.*;

public class q1{
    public static int compareStrings(String a, String b){
        if(a == null || b == null)
            throw new NullPointerException("Argument strings can't be null.");
        
        if(a.isEmpty() && b.isEmpty())
            return 0;
        else if(a.isEmpty())
            return -1;
        else if(b.isEmpty())
            return 1;
        
        int L = Math.min(a.length(), b.length());
        
        for(int i=0; i<L; i++)
            if(a.charAt(i) != b.charAt(i))
                return a.charAt(i) - b.charAt(i);
        
        return a.length() - b.length();
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings for lexicographic comparison:");
        String s1, s2;
        s1 = scan.nextLine();
        s2 = scan.nextLine();

        int result = compareStrings(s1, s2);
        if(result < 0){
            System.out.println("First String is Smaller than Second String");
        }else if(result > 0){
            System.out.println("First String is Greater than Second String"); 
        }else{
            System.out.println("Both string are equal");
        }
    }
}