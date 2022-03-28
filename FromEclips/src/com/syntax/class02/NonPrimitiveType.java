package com.syntax.class02;

public class NonPrimitiveType {

	public static void main(String[] args) {

		String name = "Aishan";

		String lastName = "Abenova";

		long phoneNumber = 9234567890l;
		String mobileNumber = "123-456-7890";

		String num = "123";
		int num1 = 123;

		String greeting = "Hello world";
		System.out.println(greeting);
		/*
		 * using + we can concatenate String+String String+int String+boolean
		 * String+double,char, etc...
		 * 
		 */

		int age = 25;
		// Aishan is 25 years old
		System.out.println(name + " is " + age + " years old");

		String address = "123 Test street";
		System.out.println("i live on " + address);

		System.out.println(name);
		System.out.println(lastName);

		String feeling = "like";
		String food = "kebab";

		System.out.println("i " + feeling + " " + food);

		feeling = "love";
		food = "shrimp";
		System.out.println("i " + feeling + " " + food);
		
		
		

	}

}
