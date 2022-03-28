package com.syntax.class7;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Declare a variable to store a price for a coffee. Ask user to pay for a coffee.
		 *  Keep asking to pay for coffee until user enters exact amount . If user give more than $3 -->
		 *  ask them to give less, if user gives less money then ask to give more.
		 *   Once user got a write amount print “Please enjoy your candy”
		 */
	System.out.println("Please pay for a coffee");	
		Scanner sc=new Scanner(System.in);
		int coffee;
		int price=3;
		do {
			 coffee=sc.nextInt();
			
			if(coffee<3) {
				System.out.println("Please pay more");
			}else if(coffee>3) {
				System.out.println("Please pay less");
			}
			
			
			
			
			
			
		}while(price!=coffee);
		System.out.println("Please enjoy your candy");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
