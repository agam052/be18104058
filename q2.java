import java.util.*;

public class q2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter paragraph");
		String para = s.nextLine();
		System.out.println("Enter the number of words to be reduced ");
		int n = s.nextInt();
		 Map<String, Integer> mp  = new HashMap<>(); 
		System.out.println("Enter words to be reduced ");
		while(n>0) {
			String key = s.next();
			mp.put(key,1);
			n -= 1;
		}

		String[] words = para.split(" ");

		Vector<String> v1 = new Vector<String>();
		for(String word: words) {
			if(mp.containsKey(word)) {
				String temp = "";
				temp += word.charAt(0);
				for(int i=1;i<word.length() ;i++) {
					temp += '*';
				}
				v1.add(temp);
			}
			else {
				v1.add(word);
			}
		}
		String ans = v1.elementAt(0);
		for(int i=1;i<v1.size();i++) {
			ans += " ";
			ans += v1.elementAt(i);
		}
		System.out.println(ans);

	}

}