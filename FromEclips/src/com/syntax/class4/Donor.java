package com.syntax.class4;

public class Donor {

	public static void main(String[] args) {

		int age = 18;
		int weight = 115;

		if (age >= 18) {
			System.out.println("You are " + age + " good for donatin");

			if (weight >= 110) {
				System.out.println("Your weight is " + weight + " eligible for donation");
			}

			else {
				System.out.println("we cannot acceptsuvh patient");
			}

		}

	}

}
