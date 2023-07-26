 package fresher;

public class CheckPrime {

	public static void main(String[] args) {

		int num = 11;

		boolean isPrime = true;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				isPrime = false;

			}
		}

		if (isPrime == true) {

			System.out.println("It is a Prime Number");

		} else {

			System.out.println("It is not a Prime Number");

		}
	}
}
