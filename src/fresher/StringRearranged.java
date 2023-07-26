package fresher;

public class StringRearranged {
	
	public static void main(String[] args) {

		String str = "abcfedrstrjn";

		char[] charArray = str.toCharArray();

		int index = 0;

		for (char c = 'a'; c <= 'z'; c++) {

			for (int i = 0; i < charArray.length; i++) {

				if (charArray[i] == c) {

					char temp = charArray[index];

					charArray[index] = charArray[i];

					charArray[i] = temp;

					index++;
				}
			}
		}

		String rearrangeStr = new String(charArray);

		System.out.println(rearrangeStr);

	}

}
