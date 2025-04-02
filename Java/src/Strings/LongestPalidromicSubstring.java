package Strings;

import java.util.ArrayList;
import java.util.List;

public class LongestPalidromicSubstring {
	
	public static void main(String args[]) {
		String input = "bacad";
		int length = input.length();
		String subarray = new String();

		 int  count =1;
		 for(int j=0; j< length;j++) {
		for(int i =j;i<length;i++) {
			subarray = subarray+input.charAt(i);
			if(subarray.contains(input.substring(i, i)) && subarray.length()>1 ) {
				System.out.println(subarray);
				//System.out.println(subarray.toString());
				String reversedsubarray = new StringBuilder(subarray).reverse().toString();
				if(reversedsubarray.equals(subarray)) {
					System.out.println(reversedsubarray);
					System.out.println(subarray);
				}
				
			}
		}
		 }
	}

}
