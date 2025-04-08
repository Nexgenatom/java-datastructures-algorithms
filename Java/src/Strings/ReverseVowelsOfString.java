package Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfString {
   public static String input ="IceCreAm";
  
	
	public static void main(String[] args) {
		System.out.println(reverseVowels(input));

	}
	public static String reverseVowels(String s) {
		 Set<Character> vowels = new HashSet<Character>();
		 vowels.addAll(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		char[] chararr = s.toCharArray();		
		int left = 0;
		int right = chararr.length-1;
		char c;
		while(left<right)
		{
			
			if(!vowels.contains(chararr[left])){
				left++;
				
			}
					if(!vowels.contains(chararr[right])){
						right--;
						
					}
					if(vowels.contains(chararr[left]) && vowels.contains(chararr[right])) {
					System.out.println(chararr[left]);
					System.out.println(chararr[right]);
					c=chararr[left];
						chararr[left]=chararr[right];
						chararr[right]=c;
						left++;
						right--;
					}
		}
		return chararr.toString();
	}
}
