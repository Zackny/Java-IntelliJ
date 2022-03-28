package com.syntax.class4;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many Worked years you have?");
		int years=scan.nextInt();
		System.out.println("What is your anual salery?");
		int sal=scan.nextInt();
		System.out.println();
		
		if (years>=5) {
			System.out.println("You are eligible for bonus");
			if (sal>=50000) {
				System.out.println("Your bonus is 5000");
			}
			else {
				System.out.println("Your bonus is 3000");
			}
			
		}
		else {
			System.out.println("you not eligible for bonus");
		}
		
		
		
		
		

	}

}
