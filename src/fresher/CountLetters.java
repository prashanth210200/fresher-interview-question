package fresher;

public class CountLetters {

	public static void main(String[] args) {

		String s = "a1b2c3";

		StringBuilder sb = new StringBuilder();

		for (char c : s.toCharArray()) {

			if (Character.isLetter(c)) {

				int count = Character.getNumericValue(Character.toLowerCase(c)) - 9;

				sb.append(String.valueOf(c).repeat(count));
			}
		}

		System.out.println(sb.toString());

	}

}
