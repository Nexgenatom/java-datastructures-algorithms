package mapsetlist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public static int[] input = {1,1,1,3,3,4,3,2,4,2};
	public static void main(String args[]) {
		System.out.println(containsDuplicate(input));
	}
public static boolean containsDuplicate(int[] nums) {
	
	Set<Integer> numSet = new HashSet<Integer>();
   
  for(int i =0; i<nums.length;i++) {
	 
	if(!numSet.contains(nums[i])) {
		numSet.add(nums[i]);
		System.out.println(numSet);
	}else {return true;}
	}
        
	return false;
    }

}
