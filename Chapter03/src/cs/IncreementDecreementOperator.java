package cs;

public class IncreementDecreementOperator {

	public static void main(String[] args) {
		int x = 10, y = 7, z;
		z = x++;
		System.out.println("z = " + z + ", x = " + x);
		z = ++x;
		System.out.println("z = " + z + ", x = " + x);
		z = y--;
		System.out.println("z = " + z + ", y = " + y);
		z = --y;
		System.out.println("z = " + z + ", y = " + y);
	}

}
