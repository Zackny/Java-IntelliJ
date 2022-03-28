package com.syntax.class09;

public class Task {

	public static void main(String[] args) {
		
	double [] prices=new double[4];	
		prices[0]=10.10;
		prices[1]=20.20;
		prices[2]=30.30;
		prices[3]=40.40;
		double ave=(prices[0]+prices[1]+prices[2]+prices[3])/4;
		System.out.println(ave);
	System.out.println("------------------------------------------------");	
		
	/*Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).

Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).

Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding Day”. 
	 * 
	 * 
	 * 	
	 */
		char [] grades= new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[1]);
		
		char []grade;
		grade=new char[6];
		
		
		
	}

}
