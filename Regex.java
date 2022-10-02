package Regex;

import java.util.Scanner;
import java.util.regex.*;
;

public class Regex 
{
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
    public static void main( String[] args )
    {
        System.out.println( "WELCOME REGEX BASED PROBLEMS" );
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
      
        	
	}
}
