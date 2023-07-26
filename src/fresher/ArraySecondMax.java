package fresher;

import java.util.Arrays;

public class ArraySecondMax {
	public static void main(String[] args) {

		int[] nums = { 2, 3, 5, 6, 78, 8, 25, 6, 89, 8, 1, 45 };

		Arrays.sort(nums);

		System.out.println("Second Maximum is " + nums[nums.length - 2]);

		String a = "abcdABCDabcdABCD";

		a = a.replace("a", "");

		System.out.println(a);

		int x = 10 * 10 - 10;
		
		System.out.println(x);

	}

}
