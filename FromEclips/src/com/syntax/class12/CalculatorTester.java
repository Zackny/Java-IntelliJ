package com.syntax.class12;

import java.util.Scanner;

public class CalculatorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator simpleMathCalculator = new Calculator();

		simpleMathCalculator.add();
		Scanner scan = new Scanner(System.in);
		simpleMathCalculator.addNumbers(20, 30);

		simpleMathCalculator.addNumbers(50, 30);
		int number1 = 60;
		int number2 = 60;
		simpleMathCalculator.addNumbers(number1, number2);

	}

}
