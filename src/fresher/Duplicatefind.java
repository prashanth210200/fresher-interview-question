package fresher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicatefind {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,5,4,3,2,2,0,9,8,7};
		
		List<Integer> nums=new ArrayList<>();
		List<Integer>dup=new ArrayList<>();
		
//		List<Integer>result=nums.stream().distinct().collect(Collectors.toList());
//		System.out.println(result);
		
		for (int i = 0; i < a.length; i++) {
			if(!nums.contains(a[i])) {
				nums.add(a[i]);
			}
				else {
					if(!dup.contains(a[i])) {
					dup.add(a[i]);
					
				}
				
			}
		}
		System.out.println(dup);
		System.out.println(nums);	
			
		
			
	}
}


