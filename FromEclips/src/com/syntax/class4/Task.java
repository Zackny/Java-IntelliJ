package com.syntax.class4;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Is it sunny outside?");
		boolean sunny=sc.nextBoolean();
		
		System.out.println("What is the temperature outside?");
		int temperature=sc.nextInt();
		
		if (sunny) {
			System.out.println("It is a sunny day, I should go somewhere");
			if(temperature>85) {
				System.out.println("I am going to the beach");
				if(temperature<85) {
					System.out.println("I am going to the park");
				}
			}
		}
		else {
			System.out.println("I stay home and practice Java");
		}
		
		
		
		
		

	}

}
