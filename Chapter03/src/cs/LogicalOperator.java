package cs;

public class LogicalOperator {

	public static void main(String[] args) {
		boolean a = true, b = false, c = true;
		System.out.println("a && b = " + (a && b));
		System.out.println("b || c = " + (b || c));
		System.out.println("!b = " + (!b));
		System.out.println("!(7>2) = " + !(7>2));
		System.out.println("(4!=5) && (9>=9) = " + ((4!=5) && (9>=9)));
	}

}
