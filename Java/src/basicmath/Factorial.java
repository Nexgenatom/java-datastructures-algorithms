package basicmath;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorialOfNumber(10));

	}

	private static int factorialOfNumber(int i) {
	
		if(i==0)return 1;
		return i*factorialOfNumber(i-1);
	}
}
