package com.syntax.honework.class6;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 *  A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		 *   At the end your program should print which grade was entered by a user with explanation.
		 */
		System.out.println("Please enter your grade");
		Scanner sc=new Scanner(System.in);
		char grade=sc.next().charAt(0);
		String explanation;
		
		switch(grade) {
		case 'a':
			explanation="excellent";
			break;
		case 'b':
			explanation="good";
			break;
		case 'c':
			explanation="average";
			break;
		case 'd':
			explanation="bad";
			default:
				explanation="not accepable";
		}
		System.out.println(explanation);		
//-------------------------------------------------------------------
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
		 *  Based on operator provide the result to user.
Please complete this assignment in 2 ways: using if statement and switch case.
		 * 
		 */
		System.out.println("Enter one number");
		int num1=sc.nextInt();
		System.out.println("Enter operator:+,-,*,/");
		char oper=sc.next().charAt(0);
		System.out.println("Enter one number");
		int num2=sc.nextInt();
		
		int result = 0;
		
		switch(oper) {
		case'+':
			result=num1+num2;
			break;
		case'-':
			result=num1-num2;
			break;
		case'*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
			
		}
			System.out.println(result);	
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
	}

}
