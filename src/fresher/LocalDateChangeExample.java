package fresher;

	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;

	public class LocalDateChangeExample {
	    public static void main(String[] args) {
	        // Create a LocalDate object with the current date
	        LocalDate currentDate = LocalDate.now();

	        // Display the current date
	        System.out.println("Current Date: " + currentDate);

	        // Create a DateTimeFormatter to parse and format dates
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	        // Parse a specific date string and update the LocalDate object
	        LocalDate newDate = LocalDate.parse("2023-07-20", formatter);
	        currentDate = newDate;

	        // Display the updated date
	        System.out.println("Updated Date: " + currentDate);
	    }
	}


