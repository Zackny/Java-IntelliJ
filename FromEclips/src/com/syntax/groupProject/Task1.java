package com.syntax.groupProject;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create an array on int values using a scanner and calculate 
		 * the sum of all stored elements in that array
		 */
		//Pseudo programming
		//1) Take the size of the Array using scanner class from the user
		//2) create an int array of above size
		//3) fill the array with elements from the user using scanner class
		//4) sum all the elements of the array
		
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int size= scanner.nextInt();
		System.out.println("Size of the array "+size);
		int[] array=new int[size];
		System.out.println("Please enter the elements of the array");
		for (int i=0; i<size; i++) {
			System.out.println("Please enter the elements foe index "+i);
			array[i]=scanner.nextInt();
			//moze i bez linije 30 ali je ovako bolje i pravilnije
		}System.out.println(Arrays.toString(array));
		int sum=0;
		for(int x=0; x<size; x++) {
			sum=sum+array[x];
			//sum+=array[x];
		}System.out.println("Sum of Array elements is "+sum);
		
		
		
		
		
		
		
	}

}
