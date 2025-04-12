package mapsetlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumTarget {

	 public static int[] nums = {2,2,2,2};
	public static void main(String[] args) {
		Arrays.sort(nums);
		System.out.println(fourSum(nums,8));

	}
	 public static  List<List<Integer>> fourSum(int[] nums, int target) {
	        List<List<Integer>> numList = new ArrayList<List<Integer>>();
		 for(int i=0;i<=nums.length-1;i++) {
			 for(int j=i+1;j<=nums.length-1;j++) {
				 for(int k=j+1;k<=nums.length-1;k++) {
					 for(int l=k+1;l<=nums.length-1;l++) {
						 if(nums[i]+nums[j]+nums[k]+nums[l]==target) {
							 List<Integer> temp = new ArrayList<Integer>();
							 temp.add(nums[i]);
							 temp.add(nums[j]);
							 temp.add(nums[k]);
							 temp.add(nums[l]);
							 if(numList.contains(temp))
							 { continue;}
							 numList.add(temp);
						 }
					 }
				 }
			 }
		 }
		 return numList;
	    }

}
