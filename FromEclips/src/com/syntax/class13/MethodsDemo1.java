package com.syntax.class13;

import java.util.Scanner;

public class MethodsDemo1 {

	void checkEvenOdd(int number) {
		if (number%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
	void checkWeder(boolean isRaining) {
		if(isRaining) {
			System.out.println("Im staing home");
		}else {
			System.out.println("Lets go for a walk");
		}
	}
	//create a method to check a name if name is Teyfur it print send memes
	//otherwise if name is MAha print i am a doctor
	//or print i dont know you.
	//void is a type of method that dont return anything
	//chackEvenOdd is the name of the method
	//() we use to pass info from outside
	//int number this is parameter thet we can pass to this method when colled
	//we can use this variable inside the logic of method
	
	void name(String chackName) {
		if("Teyfur".equals(chackName)) {
			System.out.println("Memer");
		}else if("Maha".equals(chackName)) {
			System.out.println("I am doctor");
		}else {
			System.out.println("I dont know you");
		}
	}
	public static void main(String[] args) {
		
		MethodsDemo1 object1=new MethodsDemo1();
		object1.checkEvenOdd(120);
		object1.checkEvenOdd(3);
		object1.checkEvenOdd(7);
object1.checkWeder(false);
  object1.name("Teyfur");
  object1.name("Maha");
  
  Scanner scan=new Scanner(System.in);
  int number=scan.nextInt();
	}

}
