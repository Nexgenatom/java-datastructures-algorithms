package basicmath;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		System.out.println(recursiveNaturalNum(10));

	}
	public static int recursiveNaturalNum(int num) {
		
		if (num == 0) return 0;
		return num + recursiveNaturalNum(num-1);
		
	}

}
