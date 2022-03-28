package com.syntax.class4;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		System.out.println("Enter third number");
		int num3=sc.nextInt();
		
		if (num1<num2) {
		
			if(num2>num3) {
			System.out.println(num2+" is largest no");
			}else if(num3>num1) {
			System.out.println(num3 +" is largest no");
			}else if(num1>num3) {
	System.out.println(num2>num1);}
			else if(num3>num2) {
			System.out.println(num3+ " is largest no");}
		
		}else System.out.println("all number are same");
		
}
}