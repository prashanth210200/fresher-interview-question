package fresher;

import java.util.Arrays;

public class Sorted {
	public static void main(String[] args) {
		String a="prashanth";
		String b="praanshht";
		
		char[] c=a.toCharArray();
		char[] d=b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		System.out.println(c);
		System.out.println(d);
		if(Arrays.equals(c, d)) {
			System.out.println("It is anagram");
		}
			else {
				System.out.println("It not anagram");
			}
		}
		
	}
