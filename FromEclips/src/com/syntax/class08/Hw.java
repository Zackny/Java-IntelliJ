package com.syntax.class08;

import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {
		
/*Ask a user to enter name, last name and age 5 times.
  Every time your program
 * should print those values in a format * 
* 
*/
Scanner sc=new Scanner(System.in);
for(int i =1; i<=5; i++) {
	System.out.println("Enter your name");
	String name=sc.next();
	System.out.println("Enter your last name");
	String lname=sc.next();
	System.out.println("Enmter your age");
	String age=sc.next();
	System.out.println("Your name is "+name+" "+lname+" and yoy are "+age+" years old");
}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
