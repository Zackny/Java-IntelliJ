package com.syntax.class13;

public class HW1 {

	// Create a method that will take 2 parameters as a numbers and prints which
	// number is larger.
	void larger(int number1, int number2) {
		if (number1 > number2) {
			System.out.println("This is larger number: " + number1);
		} else {
			System.out.println("This is larger number: " + number2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HW1 obj = new HW1();
		obj.larger(10, 100);

	}

}
