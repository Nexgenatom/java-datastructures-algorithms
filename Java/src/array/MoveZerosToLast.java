package array;

import java.util.Arrays;


public class MoveZerosToLast {
	static int[] array = {0,0,1};
 // LinkedList<Integer> linkedList= new LinkedList<>(Arrays.asList(array));

	public static int[] moveZeroR(int[] array) {
        int nonZeroIndex = 0; // Pointer to place the next non-zero element

        // Move all non-zero elements to the front
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                // Swap non-zero element with the current nonZeroIndex
                int temp = array[i];
                array[i] = array[nonZeroIndex];
                array[nonZeroIndex] = temp;
                nonZeroIndex++; // Move pointer to the next position
            }
        }
        return array;
    }
	
	
	public static void main(String args[]) {
	//System.out.println(Arrays.toString(moveZero(array)));	
		System.out.println("hello");
	System.out.println(Arrays.toString(moveZeroR(array)));
	System.out.println(array);
	}
//	
//	public static int[] moveZeroOne(int[] array) {
//		   try {
//			   List<Integer> list = Arrays.asList(array);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return array;
//	}

}
