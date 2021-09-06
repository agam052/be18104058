import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        capitalizeEachWord(s1);
    }
    
    public static void capitalizeEachWord(String s1){
        String[] words = s1.split(" ");
        String capitalized_String = "";
        
        for(String word : words){
            String firstLetter = word.substring(0, 1);
            String remaining = word.substring(1);
            capitalized_String += firstLetter.toUpperCase() + remaining + " ";
        }
        
        System.out.println(capitalized_String);
    }
}