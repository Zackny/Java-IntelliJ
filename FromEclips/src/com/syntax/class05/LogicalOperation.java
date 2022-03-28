package com.syntax.class05;

public class LogicalOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=100;
		int num2=2000;
		int num3=300;
		
		if (num1>num2 && num1>num3) {
			System.out.println(num1+" is largest");
		}
		else if(num2>num1 && num2>num3) {
			System.out.println(num2+" is the largest");
			
		}
		else if(num3>num1 && num3>num2) {
			System.out.println(num3+" is the largest");
		}
		
		
		
		
		
		
	}

}
