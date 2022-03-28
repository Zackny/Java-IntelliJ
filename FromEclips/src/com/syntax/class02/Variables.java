package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {

		String name = "Zarko";
		String lastName = "Zivkovic";
		String grade = "a";
		String city = "NY";
		String state = "NY";
		int phone = 12345678;

		System.out.println("my name is " + name + " " + "and my last name is " + lastName);

		System.out.println("i am" + " " + grade + " " + "student");

		System.out.println("i live in city " + city + " " + "and state " + state);

		System.out.println("and my phone number is " + phone);

		city = "LA";
		state = "CA";
		grade = "b";
		phone = 745896;

		System.out.println("My name is " + name + " " + "and i moved to new city "+ city + " "
				+ "and new state " + state + " " + "My new phone is " + phone);

	}

}
