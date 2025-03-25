package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class BrutForceFibonocci {
 
	public static void main(String args[]) {
		fibonacci(50);	
	}
	
//	public static ArrayList<Integer> fibonci(int a){
//		ArrayList<Integer> arr = new ArrayList<>();
//		return arr;
//				
//	}
//public static void fiboncci(int n){
//	int a=0;
//	int b=1;
//	int c=0;
//	if(n<0) { System.out.println("Enter Possitve Number");	
//	
//	}
//	
//	for(int i=0;i<=a;i++) {
//		    
//		 c = a+b;
//		 a=b;
//		 b=c;
//		 System.out.println(b);
//		
//		}
//				
//	}
public static void fibonacci(int n) {
	 long a = 0, b = 1, c;
     System.out.print(a + " " + b + " "); // Print first two numbers

     for (int i = 2; i < n; i++) { // Loop from 2 to n-1
         c = a + b;
         System.out.print(c + " "); // Print current Fibonacci number
         a = b;
         b = c;
     }
}
}
