package fresher;

public class ArrayRepeatedValue {
	public static void main(String[] args) {

	int arr[] = { 1, 2, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 0, 1 };

	for (int i = 0; i < arr.length; i++) {

		for (int j = i + 1; j < arr.length; j++) {

			if (arr[i] == arr[j]) {

				System.out.println("count "+arr[i] + " ");

			}
		}
	}
}

}
