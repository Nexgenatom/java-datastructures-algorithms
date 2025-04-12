package mapsetlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupAnagram {

	public static String[] input  = {"eat","tea","tan","ate","nat","bat"};
	public static void main(String[] args) {
		System.out.println(groupAnagrams(input));

	}
	 public static List<List<String>> groupAnagrams(String[] strs) {
		 List<List<String>> anagramGroup =  new ArrayList<>(); 		 
		 
		 Map<String,List<String>> map = new HashMap<String,List<String>>();		 
		 
		 for(int i = 0; i<=strs.length-1;i++) {
			char[] temp = strs[i].toCharArray();
			Arrays.sort(temp);
			if(!map.containsKey(Arrays.toString(temp))) {					
			map.put(Arrays.toString(temp), new ArrayList<>());	
					
			}map.get(Arrays.toString(temp)).add(strs[i]);
							 
		 }
			anagramGroup = new ArrayList<>(map.values());
	        return anagramGroup;
	    }
}
