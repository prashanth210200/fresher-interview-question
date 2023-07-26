package fresher;

public class SecondHighestArray {

	public static void main(String[] args) {

		int nums[] = { 22, 3, 34, 63, 1, 67, 47, 87, 2 };

		int max = nums[0];

		int secondMax = nums[0];

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > max) {

				secondMax = max;

				max = nums[i];

			}

			else if (nums[i] > secondMax ) {

				secondMax = nums[i];

			}
		}

		System.out.println(secondMax);

	}

}
