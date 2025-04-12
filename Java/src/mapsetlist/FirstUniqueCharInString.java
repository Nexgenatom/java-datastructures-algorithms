package mapsetlist;


import java.util.HashMap;
import java.util.Map;



public class FirstUniqueCharInString {

	public static String s = "loveleetcode";
	
	public static void main(String[] args) {
		System.out.println(firstUniqCharwithMap(s));

	}
	 public static int firstUniqCharwithMap(String s) {
		 Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		 int index= s.length()-1;
		 for(int i =0;i<=s.length()-1;i++) {
		
			 charMap.put(s.charAt(i),charMap.getOrDefault(s.charAt(i), 0)+1);
		 }
		
		 for(int i =0;i<=s.length()-1;i++) {
			if(charMap.get(s.charAt(i))==1) {
				return i;}
			}
		 return -1;
		 }

	public static int firstUniqCharwithBruteForceArray(String s) {
		
		for(int i=0; i<=s.length()-1;i++) {
			char[] charArray = s.toCharArray();
			 boolean unique = true;
			for(int j=i+1; j<=s.length()-1;j++) {
				
				if(s.charAt(i)==s.charAt(j)) {unique = false; break;}
			}
			if(unique) {return i;}
		}
		return -1;
	}

}
