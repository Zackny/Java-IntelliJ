package com.syntax.class02;

public class CreatingVariables {

	public static void main(String[] args) {
		
	/*
	 * create a variable and assing value
	 * declare a variable and initialize	
	 */
		//1
		int age=25;
		//2
		int num; //declare variable
		num=10; //initialize it
		
		int n1,n2,n3;// all 3 variables are on the int type
		
		n1=10;
		n2=20;
		n3=30;
		// ctrl+d-->will remuve entire line
		// can i change a value of  variable ?
		
		age=26; // reassigning the value of variable age
		
		// age=26.5; ERROR: age variable can hold only int value
		age=57;
		age=75;
		
		
		System.out.println(age);//75
		age=100;
		// Java rules for identifier
		//boolean break=false; ERROR-->do not use keywords as identifier(names)
		//char 1character='A'; ERROR-->do not start identifiers with numbers or special character
		//double %value=12.99; ERROR
		//not rules but we prefer to follow,
		//variable and method names should start with lowercase
		//give variable meaningful name
		//class name should start with upper casing
		//if name have 2 or more words--. follow camel casing
		char character1='A';
		boolean Break=true;
		
		

	}

}
