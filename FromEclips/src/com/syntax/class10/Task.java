package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		
		/*Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.

Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.

Create an array on integers and calculate the sum of all elements in an array

From an array of integer elements find the largest number.
		 */ 
		  
		String[] cars= {"BMW","Toyota","Lada","Yugo","Mercedes","Nissan"};
		 
		for(int a=0; a<cars.length; a++) {
			System.out.println(cars[a]+" ");
		}
	System.out.println("--------------------------------------------------------");	 
	for(String car:cars) {
		System.out.println(car);
	}	 
	System.out.println("------------------------------------------------------------");	
		String[]animals= {"dog","cat","fish","hors","elephant"};
		
		for(int b=0; b<animals.length; b++) {
			System.out.println(animals[b]);
		}
		System.out.println("--------------------------------------------------------------");
		for(String animal:animals) {
			System.out.println(animal);
		}
		
		
		
		
		

	}

}
