package com.syntax.class6;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		/*Write a program that will print whether it is a weekend or 
		 * weekday. If any day from 1-5 → output “It is a weekday�?, any day 
		 * from 6-7 → output “It is a weekend�?, any other day → output “Invalid day�?
		 * 
		 * 
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		
		if (day>=1 && day<=5) {
			System.out.println("weekday");
		}
		else if (day==6 || day==7) {
			System.out.println("weekend");
		}
		else {System.out.println("ivalid day");}
		
		
		
		
		
	}

}
