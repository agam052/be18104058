import java.util.*;

public class q1 {

	 public static String sortString(String inputString) { 
		 char tempArray[] = inputString.toCharArray();  
	     Arrays.sort(tempArray); 
	     return new String(tempArray); 
	} 
	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("Enter substring to be found");
		String sub = s.nextLine();
		sub = sortString(sub);
		int cnt = 0;
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				String temp =  str.substring(i, j+1);
//				System.out.println(temp);
				temp = sortString(temp);
				if(temp.equals(sub)) cnt += 1;
			}
		}
		System.out.print("number of times substring occurs is ");
		System.out.println(cnt);
	}

}