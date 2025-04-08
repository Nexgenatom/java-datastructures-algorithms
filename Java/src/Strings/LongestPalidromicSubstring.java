package Strings;

import java.util.ArrayList;
import java.util.List;

public class LongestPalidromicSubstring {
	
	public static boolean isPalindrome(String s) {
		
	 char[] charr = s.toCharArray();
	 int length = charr.length-1;
	 for(int i =0; i<charr.length-1;i++) {
		 	
			 if(charr[i]!=charr[length])
			 {
				 
				 return false;
			 }
			 length--;
			 
		 		 
	 }
		return true;
	}
	public static String longestPalindromicSubString(String s) {
		
		 int max =0;
		 String subStr ="";
         if(s.length()<=2){return s.substring(0, 1);}
         else{
		for(int i =0; i<s.length(); i++) {
			for( int j =i+1; j<s.length(); j++) {
			if(isPalindrome(s.substring(i, j+1))) {
				
				if(max<j-i+1) {
					max =j-i+1;
					subStr = s.substring(i, j+1);
				}
			}
			}
		}	
         }
		return subStr;  
    }
	
	public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int maxLen = 1;
        String maxStr = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLen; j <= s.length(); j++) {
                if (j - i > maxLen && isPalindrome(s.substring(i, j))) {
                    maxLen = j - i;
                    maxStr = s.substring(i, j);
                }
            }
        }

        return maxStr;
    }

	public static void main(String args[]) {
		String input = "ac";
//		int length = input.length();
//		String subarray = new String();
      System.out.println(longestPalindromicSubString(input));
		
	}

}
