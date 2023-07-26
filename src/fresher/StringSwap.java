package fresher;

public class StringSwap {
	public static void main(String[] args) {
		String a = "Prashanth";
		String b = "Thiyagarajan";
		System.out.println("String Before Swap : " + a + "  " + b);
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("String After Swap : " + a + "  " + b);

	}

}
