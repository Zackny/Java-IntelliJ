package com.syntax.class05;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("What is today day?");
		
		String day=sc.nextLine();
		
		if (day.equals("monday") || day.equals("friday")) {
			System.out.println("no class today");
		}
		else if (day.equals("tuesday") || day.equals("wednesday")) {
			System.out.println("Manual");
		}
		else if (day.equals("thursday")) {
			System.out.println("There is no class today");
		}
		else if(day.equals("saturday") || day.equals("sunday")) {
			System.out.println("Today is Java");
		}
		
		
	}

}
