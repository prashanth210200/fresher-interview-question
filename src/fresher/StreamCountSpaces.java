package fresher;

import java.util.Arrays;

public class StreamCountSpaces {
	
	public static void main(String[] args) {

		String num[] = { "Prashanth", " ", "Raja", " " };

		long count = Arrays.asList(num).stream().filter(x -> x.equals(" ")).count();

		System.out.println(count);
	}

}
