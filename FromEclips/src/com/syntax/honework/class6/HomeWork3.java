package com.syntax.honework.class6;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		
	///*	Write a program to ask user to enter value for sale: yes or no
	//	 * if there is no sale --> you are not going for shopping
	//	 * if there is sale ask you user for the price of the item
  //  * Based on the price you have to calculate the price of the item after the discount
		// * if price is less than $20 --> apply 10% discount
	//	 * if price is between $20 & $100 --> 20% discount
	//	 * if price between $100 & $500 --> 30% discount
	//	 * otherwise apply 50% discount
       //   Output of the program should be:
	//	After discount ___ the price of the item reduce from __ to ___
System.out.println("Is it sale in you store?");
Scanner sc=new Scanner(System.in);
boolean sale=sc.nextBoolean();
if(sale) {
	System.out.println("What is the price of item?");
	double price=sc.nextDouble();
	
	double discount=0;
	if(price<20) {
		discount=10;
	}else if(price>20 && price<100) {
		discount=20;
	}else if(price>100 && price<500) {
		discount=30;
	}else {
		discount=50;
	}
double saving=price-(price*discount)/100;
System.out.println("After discount "+discount+" the price of the item reduce from "+price+" to "+saving);
}
		
	else {
			System.out.println("I am not shooping today");
		}		
		
		
		
		
		
		
		

	}

}
