package com.syntax.class13;

public class HW4 {
	// Create a method createEmail(). Based on values of users name, lastName and
	// email type,
	// your method should return complete email Address.
	// Example: createEmail(John, Snow, gmail) → johnsnow@gmail.com or
	String createEmail(String name, String lname, String mail) {
		return name + lname + "@" + mail + ".com";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HW4 obj = new HW4();
		System.out.println(obj.createEmail("jon", "smith", "gmail"));
		System.out.println(obj.createEmail("Pera", "Peric", "yahoo"));
	}

}
