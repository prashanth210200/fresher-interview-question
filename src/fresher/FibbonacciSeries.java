package fresher;

public class FibbonacciSeries {
	
	public static void main(String[] args) {

		int n = 10;

		int a = 0;

		int b = 1;

		int c = 0;

		for (int i = 1; i <= n; i++) {

			System.out.println(a + " ");

			c = a + b;

			a = b;

			b = c;

		}
	}

}
