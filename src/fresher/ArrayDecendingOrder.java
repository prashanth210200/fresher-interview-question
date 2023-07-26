package fresher;

import java.util.Arrays;

public class ArrayDecendingOrder {
	public static void main(String[] args) {

		int arr[] = { 2, 3, 5, 6, 9, 7, 8, 3, 1 };

		Arrays.sort(arr);

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(arr[i] + " ");

		}
	}

}
