package array;

public class ContainerWithMostWater {

	public static int[] contrainerArray = {1,8,6,2,5,4,8,3,7};
	public static void main(String[] args) {
		System.out.println(maxArea(contrainerArray));

	}
	  public static  int maxAreaBF(int[] height) {
		  
		  int breath =0;
		  int maxArea =0;
		  int heigth =0;
		  for(int j=0;j<=height.length-1;j++) {		  
		  for(int i=j+1; i<=height.length-1;i++) {
			  breath = i-j;	
			  heigth = Math.min(height[i], height[j]);
			  maxArea = Math.max(maxArea, breath*heigth);
			  
		  }
		  }
	      return maxArea;  
	    }
	  public static  int maxArea(int[] height) {
		  int breath =0;
		  int heigth =0; 
		  int left =0;
		  int maxArea =0;
		  int right =height.length-1;
		  while(left<right) {
			  breath = right-left;	
			  heigth = Math.min(height[left], height[right]);
			  maxArea = Math.max(maxArea, breath*heigth);
			  if (height[left] < height[right]) {
	                left++;
	            } else {
	                right--;
	            }
		  }
		
	      return maxArea;  
	    }
}
