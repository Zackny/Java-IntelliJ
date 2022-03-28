package com.syntax.class6;

import java.util.Scanner;

public class TaskLanguage {

	public static void main(String[] args) {
		
	/*Ask user to enter there country and capture it.
	 * once value are capturd print witch language user speaks.
	 */
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your country plz");
		String country=input.nextLine();
		String language;
		
		switch(country.toLowerCase()) {
		case "usa":
			language="Englesh";
			break;
		case "russia":
			language="russian";
			break;
		case "germany":
			language="dautsch";
			break;
		case "china":
			language="chainese";
			break;
			default:
			language="unknown";
		}
		System.out.println("in "+country+" people speak "+language+" language");
		
		
		
		
		

	}

}
