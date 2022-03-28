package com.syntax.class08;

public class MultiplicationTable {

	public static void main(String[] args) {
	    int num2=8;
		int num=7;
		int result=0;
		for(int i=1; i <=10; i++) {
			result=num*i;
			System.out.println(num+" x "+ i +"= "+result);
		}for(int j=1; j<=10; j++) {
				result=num2*j;
				System.out.println(num2+" x "+j+" = "+result);
			}
		System.out.println("-------------------------------------");
		int sum=0;
		for(int i=1; i<=5; i++) {
			sum+=i;//sum=sum+i;
			System.out.println(sum);
		}
		
		
		
		
		
		
		

	}

}
