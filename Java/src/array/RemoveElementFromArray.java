package array;

import java.util.Arrays;

public class RemoveElementFromArray {
	static int[] array = {3,2,2,3};
	static int val = 3;
	
	public static int RemoveElementFromArray(int[] array, int val) {
		int nonvalindex=0;
		int length = array.length-1;
		int count=0;
		for(int i=0; i<=length;i++) {
			
			if(array[i]!=val) {
				int temp = array[i];
                array[i] = array[nonvalindex];
                array[nonvalindex] = temp;
                nonvalindex++; // M
                count++;
			}
			
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(RemoveElementFromArray(array,val));
	}

}
