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

	public static void main(String[] args) {
		System.out.println("WELCOME REGEX BASED PROBLEMS");
		Regex CheckName = new Regex();
		System.out.println("USER REGISTRATION");
		Scanner firstName = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NAME: ");
		String Name = firstName.nextLine();
		CheckName.Name(Name);
		Scanner lastName = new Scanner(System.in);
		System.out.println("ENTER THE LAST NAME: ");
		String lname = lastName.nextLine();
		CheckName.Name(lname);
		Scanner mail = new Scanner(System.in);
		System.out.println("ENTER THE MAIL ID: ");
		String email = mail.nextLine();
		CheckName.Email(email);

	}
}
