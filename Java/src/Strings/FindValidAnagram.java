package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindValidAnagram {
	public static boolean isAnagram(String s, String t) {
        
		char[] arrayOne = s.toCharArray();
		char[] arrayTwo = t.toCharArray();
		 Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		System.out.println(arrayOne);
		System.out.println(arrayTwo);
		return Arrays.equals(arrayOne, arrayTwo);
	    }
	public static void main(String[] args) {
		String s = "anagram";
				String t = "nagaram";
				System.out.println(isAnagram(s,t));
		 
	}

}
