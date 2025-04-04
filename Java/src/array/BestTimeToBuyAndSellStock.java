package array;

import java.util.ArrayList;
import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
	public  static ArrayList<Integer> numberArray = new ArrayList<Integer>(Arrays.asList(7,1,5,3,6,4));
	public  static ArrayList<Integer> idxs = new ArrayList<Integer>();
	 
	public static int bestTimeToBuyAndSellStockBruteForce(ArrayList<Integer> ary){
		//System.out.println(ary);
		int  max= 0;
	 for(int i=0; i<ary.size();i++) {
		// System.out.println(ary.get(i));
	
		 //System.out.println(temp);
		   for(int j=i+1; j<ary.size();j++) {
			  if(ary.get(j)-ary.get(i)> max) {
				  max=ary.get(j)-ary.get(i);
			  }
			  
		  }
		 
	 }
		return max;
	}
	/* public int maxProfit(int[] prices) {
        	int  max= 0;
	 for(int i=0; i<prices.length;i++) {
	
		   for(int j=i+1; j<prices.length;j++) {
			  if(prices[j]-prices[i]> max) {
				  max=prices[j]-prices[i];
			  }
			  
		  }
		 
	 }
		return max;
    }*/
	
	public static int maxProfit(int[] prices) {
		int maxProfit=0;
		int buyday =prices[0];
		for(int sellDay=1; sellDay<prices.length;sellDay++) {
			
			if(prices[sellDay]<buyday)
			{
				buyday =prices[sellDay];
			}
			 if((prices[sellDay]-buyday)>maxProfit){
				 maxProfit = prices[sellDay]-buyday;
			 }
					
		}
		return maxProfit;
		}
public static void main(String args[] ) {
		int deatails[] = {7,1,5,3,6,4};
		System.out.println(bestTimeToBuyAndSellStockBruteForce(numberArray));
		System.out.println(maxProfit(deatails));
	}
	

}
