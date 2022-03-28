package com.syntax.class6;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	4. Write a program for user to enter his/hers birth month. Based on the month define the season.
		Example: if user is born in March, April, May → season =“Spring�? 
		if user is born in June, July, August → season =“Summer�?  etc …
		*/
		System.out.println("Please enter your month of birth");
		
		Scanner sc=new Scanner(System.in);
		String month=sc.nextLine();
		if (month.equals("march") || month.equals("april") || month.equals("may")) {
			System.out.println("Spreeng");
		}
		else if (month.equals("june") || month.equals("july")|| month.equals("august")) {
			System.out.println("Summer");
		}
		else if (month.equals("september") || month.equals("october") ||month.equals("november")) {
			System.out.println("autumn");
		}
		else {System.out.println("winter");}
		//----------------------------------------------------------------------------------
		/*Prompt the user to enter person heights in inches. Person should be classified as one of the following:
short (under 60 inch)
medium(between 60 -72 inch)
tall (over 72 inch)
		 * 
		 * 
		 * 
		 */
		System.out.println("Please enter your personal heights");
		int height=sc.nextInt();
		if (height<60) {
			System.out.println("short");
		}
		else if(height>60 && height<72) {
			System.out.println("medium");
		}
		else if(height>70) {
			System.out.println("tall");
		}
		
		
		
		
	}

}
