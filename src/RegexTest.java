import java.text.SimpleDateFormat;
import java.util.Scanner;

public class RegexTest {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter a name");
		String name = scnr.next();
		validateName(name);

		System.out.println("Enter a valid date");
		String date = scnr.next();
		validateDate(date);

		System.out.println("Enter a valid phone number");
		String phone = scnr.next();
        validatePhone(phone);
		
        System.out.println("Enter a valid email");
        String email = scnr.next();
		validateEmail(email);
	
	}

	public static boolean validateName(String name) {
		String vn = "^[a-zA-Z\\\\s]*$";
		if (name.matches(vn)) {
			System.out.println("valid");
		} else {
			System.out.println("sorry not a valid name");
		}
		return false;

	}

	public static boolean validateDate(String date) {
		String dt = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
		if (date.matches(dt)) {
			System.out.println("valid");
		} else {
			System.out.println("sorry not a valid date");
		}
		return false;
	}
	public static boolean validatePhone(String phone) {
	String ph = "\\d{4}\\d{3}\\d{4}";
	if (phone.matches(ph)) {
		System.out.println("valid");
	} else {
		System.out.println("sorry not a valid phone number");
	}
	return false;
	}

	public static boolean validateEmail(String email) {
		String mail = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";;
		if (email.matches(mail)) {
			System.out.println("valid");
		} else {
			System.out.println("sorry not a valid email");
		}
		return false;
		}



}
