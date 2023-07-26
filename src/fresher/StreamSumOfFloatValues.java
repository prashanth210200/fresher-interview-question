package fresher;

import java.util.Arrays;
import java.util.List;

public class StreamSumOfFloatValues {
	
	public static void main(String[] args) {

		List<Float> nums = Arrays.asList(100.0f, 127.2f, 500.0f, 23.0f);

		float sum = nums.stream().reduce(0.0f, Float::sum);

		System.out.println(sum);

	}

}
