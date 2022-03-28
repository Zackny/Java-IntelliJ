package com.syntax.class14;

public class Task1 {

	void printLarger(int num1, int num2) {
		if (num1 > num2) {
			System.out.println("Number 1 is greater");
		} else if (num2 > num1) {
			System.out.println("Number 2 is greater");
		} else {
			System.out.println("Numbers are even");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1 obj = new Task1();
		obj.printLarger(10, 200);
	}

}
