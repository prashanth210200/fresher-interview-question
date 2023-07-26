package fresher;

import java.util.Arrays;
import java.util.List;

public class StreamMaxValue {
	
	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 656, 6, 76, 43, 6, 65, 565, 4, 454);

		int result = nums.stream().max(Integer::compareTo).get();

		System.out.println(result);

	}

}
