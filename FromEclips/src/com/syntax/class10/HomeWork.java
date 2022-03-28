package com.syntax.class10;

public class HomeWork {

	public static void main(String[] args) {
		/*
		 * Create an array on integers and calculate the sum of all elements in an array

                From an array of integer elements find the largest number.
		 * 
		 * 
		 * 
		 */
int[] num= {10,20,30,40,50,60,70,80,90,100};
int sum;
	
		sum=(num[0]+num[1]+num[2]+num[3]+num[4]+num[5]+num[6]+num[7]+num[8]+num[9]);
				System.out.println(sum);
	System.out.println("-----------------------------------------------------------------");	
		
	int[] n= {10,20,30,40};
	
	for(int i=0; i<n.length; i++) {
		if(n[0]>n[1] && n[0]>n[2] && n[0]>n[3]) {
			System.out.println(n[0]+" is larges number");
		}else if(n[1]>n[0] && n[1]>n[2] && n[1]>n[3]) {
			System.out.println(n[1]+" is largest number");	
			}else if(n[2]>n[0] && n[2]>n[1] && n[2]>n[3]) {
		System.out.println(n[2]+" is largest number");
	}else if(n[3]>n[0] && n[3]>n[1] && n[3]>n[2]) {
		System.out.println(n[3]+" is largest number");
	}
		
	}	
	System.out.println("----------------------------------------------------");	
		
		int largest = 0;
		for(int r=0; r<n.length; r++) {
			if(n[r]>largest) {
				largest=n[r];
			}
		}System.out.println(largest);
		
		
		
		
	}

}
