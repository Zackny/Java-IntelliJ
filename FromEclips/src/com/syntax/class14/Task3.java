package com.syntax.class14;

public class Task3 {

	String sayHello(String country) {
		switch (country) {
		case "usa":
			return "Hello";

		case "France":
			return "Bonjour";

		case "Turky":
			return "Merhaba";

		default:
			return "Unknown";

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task3 obj = new Task3();
		String country=obj.sayHello("usa");
		System.out.println(country);
		
	}

}
