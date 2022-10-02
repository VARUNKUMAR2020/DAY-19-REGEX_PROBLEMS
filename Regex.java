package Regex;

import java.util.Scanner;
import java.util.regex.*;;

public class Regex {
	public static String Name(String Name) {
		Pattern name = Pattern.compile("^[A-Z][a-z]{2,}$");
		Matcher checkName = name.matcher(Name);
		if (checkName.find()) {
			System.out.println("THANK YOU FOR ENTERING VALID FIRST NAME ");
		} else {
			System.err.println("YOU HAVE ENTERED INVALID FIRST NAME ");
		}
		return Name;
	}

	public static String Email(String mail) {
		Pattern email = Pattern.compile("^[a-zA-Z0-9]+([.][0-9a-zA-z])+@[a-z]+.[a-z]{2,3}$");
		Matcher checkmail = email.matcher(mail);
		if (checkmail.find()) {
			System.out.println("THANK YOU FOR ENTERING VALID MAIL ID ");
		} else {
			System.err.println("YOU HAVE ENTERED INVALID MAIL ID ");
		}
		return mail;
	}
	
	public static String Mobile(String mobile) {
		Pattern cell = Pattern.compile("^[0-9]{1,2}[6-9]{1}[0-9]{9}$");
		Matcher check = cell.matcher(mobile);
		if (check.find()) {
			System.out.println("THANK YOU FOR ENTERING VALID MOBILE NUMBER ");
		} else {
			System.err.println("YOU HAVE ENTERED INVALID MOBILE NUMBER");
		}
		return mobile;
	}
	public static String Password(String password) {
		Pattern security= Pattern.compile("^[.]{1,8}$");
		Matcher check = security.matcher(password);
		if (check.find()) {
			System.out.println("THANK YOU FOR ENTERING PASSWORD ");
		} else {
			System.err.println("YOU HAVE ENTER 8 CHARACTER");
		}
		return password;
	}



	public static void main(String[] args) {
		System.out.println("WELCOME REGEX BASED PROBLEMS");
		Regex Check = new Regex();
		System.out.println("USER REGISTRATION");
		Scanner firstName = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NAME: ");
		String Name = firstName.nextLine();
		Check.Name(Name);
		Scanner lastName = new Scanner(System.in);
		System.out.println("ENTER THE LAST NAME: ");
		String lname = lastName.nextLine();
		Check.Name(lname);
		Scanner mail = new Scanner(System.in);
		System.out.println("ENTER THE MAIL ID: ");
		String email = mail.nextLine();
		Check.Email(email);
		Scanner cell= new Scanner(System.in);
		System.out.println("ENTER THE MOBILE NUMBER: ");
		String mobile = cell.nextLine();
		Check.Mobile(mobile);
		Scanner security= new Scanner(System.in);
		System.out.println("ENTER THE PASSWORD: ");
		String password = security.nextLine();
		Check.Password(password);

	}
}
