package com.syntax.class13;

public class HW2 {

	// Create a method that will take a number and prints whether the number is even
	// or odd.
	void evenOrOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HW2 obj = new HW2();
		obj.evenOrOdd(1456);
	}

}
