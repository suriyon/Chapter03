package cs;

public class BitwiseOperator {

	public static void main(String[] args) {
		int x = 10, y = 7;
		System.out.println("x & y = " + (x&y));
		System.out.println("x | y = " + (x|y));
		System.out.println("x ^ y = " + (x^y));
		System.out.println("x>>2 = " + (x>>2));
		System.out.println("y<<2 = " + (y<<2));
		System.out.println("~x = " + (~x));
	}

}
