import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        System.out.println(isAnagram(s1, s2));
    }
    
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i=0; i<26; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
}