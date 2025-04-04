/*Given an array of integers nums and an integer target, return
 *  indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
 and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

package array;

import java.util.ArrayList;
import java.util.Arrays;


public class TwoSum {
	
	public  static ArrayList<Integer> numberArray = new ArrayList<Integer>(Arrays.asList(3,3));
	public  static ArrayList<Integer> idxs = new ArrayList<Integer>();
	
	public static ArrayList<Integer> twoSumBruteForce(ArrayList<Integer> ary, int target){
		//System.out.println(ary);
	 for(int i=0; i<ary.size();i++) {
		// System.out.println(ary.get(i));
		 int temp = target - ary.get(i);
		 //System.out.println(temp);
		   for(int j=i+1; j<ary.size();j++) {
			  if(temp == ary.get(j)) {
				  idxs.add(i);
				  idxs.add(j);
			  }
			  
		  }
		 
	 }
		return idxs;
	}
	
	public static void main(String args[] ) {
		
		System.out.println(twoSumBruteForce(numberArray,6));
	}

}
