package com.syntax.class13;

public class HW3 {
	// Create a method that will say Hello in different language based on the
	// country that will passed when method is executed.
	void sayHello(String s) {
		switch (s) {
		case "usa":
			System.out.println("Hello");
			break;
		case "Serbia":
			System.out.println("Zdarvo");
			break;
		default:
			System.out.println("Unknown language");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HW3 obj = new HW3();
		obj.sayHello("Serbia");
	}

}
