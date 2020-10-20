import java.util.Scanner;

/*
 * 
 * Lab 7 Starter Project
 * 
 * 
 */

public class Lab7Regex {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Please enter a valid Name: ");
		String input = scnr.nextLine();
		validateName(input);
		
		System.out.print("Please enter a valid email: ");
		String input1 = scnr.nextLine();
		validateEmail(input1);
	
		System.out.print("Please enter a valid phone number: ");
		String input2 = scnr.nextLine();
		validatePhone(input2);
	
		System.out.print("Please enter a valid date: ");
		String input3 = scnr.nextLine();
		validateDate(input3);
	
	
	
	
	
	}

	public static boolean validateName(String name) {

		// change this to pass ALL tests
		String regex = "[A-Za-z]*";

		if (name.matches(regex)) {
			System.out.println("Name is valid!");
			return true;
		} else {
			System.out.println("Sorry, name is not valid!");
			return false;
		}
	}

	public static boolean validateEmail(String email) {

		// change this to pass ALL tests
		String regex = ".*\\w[a-zA-z].[a-zA-z][a-z]*";

		if (email.matches(regex)) {
			System.out.println("Email is valid!");
			return true;
		} else {
			System.out.println("Sorry, email is not valid!");
			return false;
		}
	}
	
	public static boolean validatePhone(String phone) {

		// change this to pass ALL tests
		String regex = "\\d{3}.\\d{3}.\\d{4}";

		if (phone.matches(regex)) {
			System.out.println("Phone number is valid!");
			return true;
		} else {
			System.out.println("Sorry, phone is not valid!");
			return false;
		}
	}
	
	public static boolean validateDate(String date) {

		// change this to pass ALL tests
		String regex = "\\d{2}.\\d{2}.\\d{4}";

		if (date.matches(regex)) {
			System.out.println("Date is valid!");
			return true;
		} else {
			System.out.println("Sorry, date is not valid!");
			return false;
		}
	}
	
	

}
