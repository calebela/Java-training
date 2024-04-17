package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "ring";
		bookTitle = "the lord of the rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word "+ wordChoice+".");
		}
		String browser = "chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome.");
			System.out.println("*********************");
		}
		String firstName ="caleb";
		String lastName ="belete";
		String SSN = "58427878764";
		System.out.println("there are "+ SSN.length()+" digits int your SSN.");
		//print the initials olus last four digits of SSN
		System.out.println(firstName.substring(0,1));
		System.out.println(lastName.substring(0,3));
		System.out.println(SSN.substring(5));
		//System.out.println(firstName.substring(0,1)+ lastName.substring(0,3)+SSN.substring(5));
		// just by removing ln we could right in one line
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,3));
		System.out.print(SSN.substring(8));
	}

}
