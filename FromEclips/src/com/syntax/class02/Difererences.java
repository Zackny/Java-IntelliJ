package com.syntax.class02;

public class Difererences {

	public static void main(String[] args) {
		
		
		String a="Hello";
		String b="Bye";
		
		int c=10;
		int d=20;
		
		System.out.println(c+d+a+b);//30helloBye
		System.out.println(a+b+c+d);//Hellobye1020
		System.out.println(a+b+(c+d));//Hellobye30
		
		int num=123;
		String num2="123";
		System.out.println(num+num2);
		
		String what=num+num2;//123123
		System.out.println(what);
		System.out.println(num+num2);
				
		
				
		
		
		
		
		
		

	}

}
