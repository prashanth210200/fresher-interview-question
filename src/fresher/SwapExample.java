package fresher;

public class SwapExample {

	public static void main(String[] args) {

		int a = 20;

		int b = 10;

		System.out.println("Before Swap is : " + a + "  " + b);

		a = a + b;

		b = a - b;

		a = a - b;

		System.out.println("After Swap is  : " + a + "  " + b);

	}

}
