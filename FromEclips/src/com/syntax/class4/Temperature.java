package com.syntax.class4;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
		String city="New York";
		int tempF=32;
		int tempC=((tempF-32)/2);
		if (tempC==0) {
			System.out.println("The temperature in the city "+city+" is "+tempC);
		}
		else {
			System.out.println("We dont know the temperature");
		}
		//**************************************credit card
		
		
		
		Scanner balance=new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		
		 String card=balance.next();
		System.out.println("What is balance on the card?");
		
		
		
		
		
		
		
		
	    String credit= balance.next();
	    
		System.out.println("You can spend more!");	              
		
		
		
		
		
		
		

	}

}
