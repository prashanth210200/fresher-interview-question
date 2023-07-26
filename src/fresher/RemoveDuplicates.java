package fresher;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	
	public static void main(String[] args) {

		String s = "1,2,3,1,4,,5,3,3";

		String result = Arrays.asList(s.split(","))
				.stream()
				.map(Integer::parseInt)
				.distinct()
				.sorted((a, b) -> b.compareTo(a))
				.map(String::valueOf)
				.collect(Collectors.joining(","));

		System.out.println("Modified String : " + result);
	}

}