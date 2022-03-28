package com.syntax.groupProject;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Create 2d array of integer type where you will store odd and even numbers.
		 * Develop a program witch will identify/print the even numbers only.
		 * 
		 * 
		 */

		int[][] array2d = { { 2, 3, 4 },

				{ 5, 6 }, { 12, 6, 8 } };

		for (int x = 0; x < array2d.length; x++) {

			for (int y = 0; y < array2d[x].length; y++) {
				int element=array2d[x][y];
				if(element%2==0) {
					System.out.println(element);
				}

			}
		}

	}

}
