package com.syntax.class4;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		int num1=10;
	    int num2=20;
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		
		String name=input.next();
		
		System.out.println("Your name "+name);
		
		Scanner years=new Scanner(System.in);
		
		System.out.println("How old you are?");
		
		String age=years.next();
		System.out.println("You are "+age+" years old");
		
        Scanner city=new Scanner(System.in);
        System.out.println("Where are you are born?");
		String born=city.nextLine();
		System.out.println("You are born in "+born);
		
		Scanner state=new Scanner(System.in);
		System.out.println("Which state you are born?");
		String country=state.nextLine();
		System.out.println("I am born in "+country);
		Scanner co=new Scanner(System.in);
		System.out.println("Your county?");
		String coun=co.next();
		System.out.println(coun);
		Scanner color=new Scanner(System.in);
		System.out.println("Tell me your color?");
		String xy=color.next();
		System.out.println("your color is "+color);
		System.out.println("your color is "+color);
	
		
		
	}

}
