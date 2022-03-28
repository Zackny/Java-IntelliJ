package com.syntax.class4;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Temperature");
		int temp = sc.nextInt();
		System.out.println("Is it suny outside?");
		boolean sun = false;

		if (temp > 90) {
			System.out.println("It is hot outside");
			if (sun == true) {
				System.out.println("It is also sunny outside");
			} else {
				System.out.println("It is also cloudy outside");
			}
		} else {
			System.out.println("It is not hot out side");
			if (sun == true) {
				System.out.println("It is also sunny outside");
			} else {
				System.out.println("It is also coold outside");
			}

		}

	}

}
