package com.syntax.class6;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the age of the Child");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		String baby;

		switch(age){
		  case 1:
		  baby="You can Crawl";
		  break;
		  case 2:
		  baby="You can Talk";
		  break;
		  case 3:
		  baby="You can Dance";
		  break;
		  case 4:
		  
		  baby="You can get Trouble";
		break;
		default:
		baby="I don't know how old you are";
		break;

		}
	}

}
