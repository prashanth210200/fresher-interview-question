package fresher;

import java.util.Arrays;

public class ArrayAscendingOrder {
	public static void main(String[] args) {

		int arr[] = { 2, 3, 5, 6, 9, 7, 8, 3, 1 };

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");

		}
	}

}
