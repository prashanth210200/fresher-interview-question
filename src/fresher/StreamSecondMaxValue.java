package fresher;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSecondMaxValue {
	
	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(2, 23, 425, 464, 6, 6466, 6, 666, 6, 3, 3, 53, 53, 353, 53);

		int res = nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

		System.out.println(res);
	}
}
