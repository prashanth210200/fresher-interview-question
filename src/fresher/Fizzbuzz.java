package fresher;

public class Fizzbuzz {

	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {

			if (i % 3 == 0 && i % 6 == 0) {

				System.out.println("FIZZBUZZ");

			} else if (i % 6 == 0) {

				System.out.println("BUZZ");

			} else if (i % 3 == 0) {

				System.out.println("FIZZ");

			} else {

				System.out.println(i);
			}
		}
	}
}
