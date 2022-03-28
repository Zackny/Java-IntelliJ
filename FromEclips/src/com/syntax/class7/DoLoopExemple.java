package com.syntax.class7;

import java.util.Scanner;

public class DoLoopExemple {

	public static void main(String[] args) {
		
		/*
		 * create a secret number
		 * we want to guess our secret number 
		 * the moment user guess my secret number -->my program should stop
		 * otherwise it should continue asking to guess my number
		 * 
		  
		  
		 * 
		 */
		int secretNumber=12;
		Scanner scan=new Scanner(System.in);
		int guessNumber;
		
		do {
			System.out.println("Please enter number to win");
			guessNumber=scan.nextInt();
			
		}while(guessNumber!=secretNumber);
		System.out.println("Congratulations");
	//------------------------------------------------------	
		int num3=1;
		do {
			System.out.println(num3);
			num3++;
		}while(num3<=30);
		
		
		
		
		
		
		
		
	}

}
