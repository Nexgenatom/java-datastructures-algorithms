package Strings;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Given a string s, find the length of the longest substring without duplicate characters.

public class LongestSubstring {
	
 @SuppressWarnings("unlikely-arg-type")
 public static int lengthOfLongestSubstring(String s) {
     int left = 0, maxLength = 0;
     HashSet<Character> uniqueChars = new HashSet<>();

     for (int right = 0; right < s.length(); right++) {
         while (uniqueChars.contains(s.charAt(right))) {
             uniqueChars.remove(s.charAt(left));
             left++; // Shrink the window
         }
         uniqueChars.add(s.charAt(right));
         maxLength = Math.max(maxLength, right - left + 1);
     }
     return maxLength;
 }
 
 public static int lengthOfLongestSubstringg(String s) {
     int n = s.length();
     int maxLength = 0;
     Set<Character> charSet = new HashSet<>();
     int left = 0;
     
     for (int right = 0; right < n; right++) {
         if (!charSet.contains(s.charAt(right))) {
             charSet.add(s.charAt(right));
             maxLength = Math.max(maxLength, right - left + 1);
         } else {
             while (charSet.contains(s.charAt(right))) {
                 charSet.remove(s.charAt(left));
                 left++;
             }
             charSet.add(s.charAt(right));
         }
     }
     
     return maxLength;
 }
 
 public static int lengthOfLongestSubstringBF(String s) {
     int maxLength = 0;

     for (int i = 0; i < s.length(); i++) {  // Outer loop for start index
         HashSet<Character> uniqueChars = new HashSet<>();

         for (int j = i; j < s.length(); j++) {  // Inner loop for end index
             if (uniqueChars.contains(s.charAt(j))) {
                 break; // Stop if duplicate character found
             }
             uniqueChars.add(s.charAt(j)); // Add to the set
             maxLength = Math.max(maxLength, j - i + 1);
         }
     }
     return maxLength;
 }
public static void main(String args[]) {
	//System.out.println(lengthOfLongestSubstring("abcabcdefabcdefg"));
	//System.out.println(lengthOfLongestSubstringg("abcabcdefabcdefg"));
//	System.out.println(lengthOfLongestSubstringBF("abcabcdefabcdefg"));
String givenString = new String("abcabcdef");
Set<Character> uniqueChar = new HashSet<Character>();
String subString = new String();
int count =1;
int length =0;
Map<Integer,String> map =  new HashMap<Integer,String>();
try {
	
	for (int i=0; i<givenString.length();i++) {
	for (int j =i; j<givenString.length();j++) {
		if(!uniqueChar.contains(givenString.charAt(j))) {
		uniqueChar.add(givenString.charAt(j));
		subString=subString+givenString.charAt(j);
	
		}
		else if(uniqueChar.contains(givenString.charAt(j))) {
			map.put(count, subString);
			//System.out.println(map);
			count++;
			uniqueChar.clear();
			subString ="";
		}
		else {System.out.println("Somewthing went wrong");}
		
				}}
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	System.out.println(map);
	for(int keyEntry : map.keySet() )
	{
		//System.out.println(map.get(keyEntry));
		if(map.get(keyEntry).length() > length) {
			length = map.get(keyEntry).length();
		}

	}
	System.out.println(length);
 }
}
