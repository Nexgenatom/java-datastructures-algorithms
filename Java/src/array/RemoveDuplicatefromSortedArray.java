package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatefromSortedArray {

	public static int[] sortedArray = {0,0,1,1,1,2,2,3,3,4};
	public static void main(String[] args) {
		System.out.println(Arrays.toString(removeDuplicates(sortedArray)));

	}
	  public static  int[] removeDuplicates(int[] nums) {
    
	
		 int nonDuplicateIndex=0;
		 int  length = nums.length-1;
		 for(int left =1;left<=length;left++ ) {
		   if( nums[nonDuplicateIndex] != nums[left]) {
			   nonDuplicateIndex++;
			    nums[nonDuplicateIndex]= nums[left];
		   }
//		
		  
		 }	 
		 
		  return nums;
	    }

}
