package com.syntax.class7;

public class WhileLoop {

	public static void main(String[] args) {
		
	int i=1;
	
	while(i <=5) {
		System.out.println(i);
		i++;
	}
	System.out.println("the value of the loop is "+i);	
	//i need to print value from 2 to 20	
		int a=2;
		while(a<=20) {
			System.out.println(a);
			a++;
		}
	//i need to print value from 1 to 50	
		int b= 1;
		while(b<=50) {
			System.out.print(b+" ");
			b++;
		}// i need numbers from 20 to 1
		int c=20;
		while(c>=1) {
			System.out.println(c+" ");
			c--;
		}
		// print only even numbers from 1 to 30
		int d=2;
		while(d<=30) {
			System.out.println(d);
			d+=2;//same as d=d+2;
		}//second way
		int e=1;
		while(e<=30) {
			if(e% 2==0) {
				System.out.println(e);
			}e++;
		}
			
		
		
		
		
		
		
		
		

	}

}
