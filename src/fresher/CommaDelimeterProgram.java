package fresher;

public class CommaDelimeterProgram {
	
	public static void mian(String[] args) {
		
		String names[] = { "Apple", "Banana", "Orange", "Mango" };
		
		String combinedString = String.join(",", names);
		
		System.out.println(combinedString);
		
	}

}
