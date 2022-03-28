package com.syntax.honework.class6;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter one number");
		int num1=sc.nextInt();
		System.out.println("Please enter operater:+,-,*,/,");
		char oper=sc.next().charAt(0);
		System.out.println("Please enter one number");
		int num2=sc.nextInt();
		double result = 0;
		
		if(oper=='+') {
			result=num1+num2;
		}else if(oper=='-') {
			result=num1-num2;
		}else if(oper=='*') {
			result=num1*num2;
		}else if(oper=='/') {
			result=num1/num2;
		}
		System.out.println("Result is "+result);
		
		
		
		
		
		
		
		
		

	}

}
