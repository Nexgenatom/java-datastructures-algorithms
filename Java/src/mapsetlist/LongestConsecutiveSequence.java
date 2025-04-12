package mapsetlist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static int[] nums = {0,3,7,2,5,8,4,6,0,1};
	public static void main(String[] args) {
		System.out.println(longestConsecutive(nums));
		
	}
	 public static int longestConsecutive(int[] nums) {
		Set<Integer> numSet = new HashSet<Integer>();
		 int longSteak=1;
		for(int num: nums) {
			numSet.add(num);
		}
		for(int num: numSet) {
		 int currentSteak= 1;
		
		 int currentNum = num;
			while(numSet.contains(currentNum+1)) {
				currentNum++;
				currentSteak++;
			}
			longSteak = Math.max(longSteak, currentSteak);
		}
		
		
	        return longSteak;
	    }
	 

}
