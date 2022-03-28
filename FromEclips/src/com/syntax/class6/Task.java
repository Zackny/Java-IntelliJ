package com.syntax.class6;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("What is your country?");
		Scanner input=new Scanner(System.in);
		
		String country=input.nextLine();
		String language;
		
		switch(country) {
		case "usa":
		language="english";
		break;
		case "russia":
		language="russian";
		break;
		default:
			language="unknown";
		
		
		
		}
		System.out.println("in "+country+" people speak "+language);
		
		
		
		
		
		
		
		
		
	}

}
