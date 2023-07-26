package fresher;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAdditionOfFive {
	
	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8);
		
		List<Integer> res=nums.stream().flatMap(x->nums.stream().map(y->x+y)).filter(z-> z==5).collect(Collectors.toList());
		System.out.println(res);
	}

}
